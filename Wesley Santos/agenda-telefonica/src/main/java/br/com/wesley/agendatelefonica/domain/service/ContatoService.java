package br.com.wesley.agendatelefonica.domain.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

import br.com.wesley.agendatelefonica.domain.repository.ContatoRepository;
import br.com.wesley.agendatelefonica.domain.model.Contato;

@Service


public class ContatoService {
    private ContatoRepository contatoRepository;

    @Autowired
    public ContatoService(ContatoRepository contatoRepository) {
        this.contatoRepository = contatoRepository;
    }

    public List<Contato> listar(){
        return contatoRepository.findAll();
    }

    public Optional<Contato> getContatoById(Long id){
        return contatoRepository.findById(id);
    }

    public Contato salvar(Contato contato){
        return contatoRepository.save(contato);
    }

    public Contato atualizar(Contato contato){
        return contatoRepository.save(contato);
    }

    public void apagar(Contato contato){
        contatoRepository.delete(contato);
    }
}
