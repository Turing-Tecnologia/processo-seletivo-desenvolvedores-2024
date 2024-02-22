package br.com.wesley.agendatelefonica.api.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import java.util.List;
import java.util.Optional;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.wesley.agendatelefonica.api.dto.ContatoDTO;
import br.com.wesley.agendatelefonica.api.helper.iHelper;
import br.com.wesley.agendatelefonica.domain.model.Contato;
import br.com.wesley.agendatelefonica.domain.service.ContatoService;

//link do swagger
//http://localhost:8080/swagger-ui/index.html#/


@RestController
@RequestMapping("/api/contatos")
public class ContatoController {

    private ContatoService contatoService;
    iHelper helper = new iHelper();

    public ContatoController(ContatoService contatoService) {
        this.contatoService = contatoService;
    }

    @GetMapping
    public ResponseEntity listar() {
        List<Contato> contatos = contatoService.listar();
        return ResponseEntity.ok(contatos);
    }

    @GetMapping("{id}")
    public ResponseEntity buscarPorId(@PathVariable Long id){
        Optional<Contato> optionalContato = contatoService.getContatoById(id);
        if (optionalContato.isPresent()) {
            Contato contato = optionalContato.get();
            return ResponseEntity.ok().body(contato);
        } else {
            return getNotFoundResponse(HttpStatus.NOT_FOUND);
        }
    }



    @PostMapping
    public ResponseEntity salvar(@RequestBody ContatoDTO contatoDTO) {
        Contato contato = helper.converterDtoParaContato(contatoDTO);
        contatoService.salvar(contato);
        ResponseEntity responseEntity = new ResponseEntity(contato, HttpStatus.CREATED);
        return responseEntity;
    }

    @PutMapping("{id}")
    public ResponseEntity atualizar(@PathVariable long id, @RequestBody ContatoDTO contatoDTO) {
        Optional<Contato> optionalContato = contatoService.getContatoById(id);
        if (optionalContato.isPresent()) {
            Contato contato = helper.converterDtoParaContato(contatoDTO);
            contatoService.atualizar(contato);
            return ResponseEntity.ok(contato);
        } else {
            return getNotFoundResponse(HttpStatus.NOT_FOUND);
        }
    }

    @DeleteMapping("{id}")
    public ResponseEntity deletar(@PathVariable long id) {
        Optional<Contato> optionalContato = contatoService.getContatoById(id);
        if (optionalContato.isPresent()) {
            Contato contato = optionalContato.get();
            contatoService.apagar(contato);
            return ResponseEntity.noContent().build();
        } else {
            return getNotFoundResponse(HttpStatus.NOT_FOUND);
        }
    }
    

    private ResponseEntity getNotFoundResponse(HttpStatus status) {
        return ResponseEntity.status(status).body("Contato não encontrado");
    }

}
