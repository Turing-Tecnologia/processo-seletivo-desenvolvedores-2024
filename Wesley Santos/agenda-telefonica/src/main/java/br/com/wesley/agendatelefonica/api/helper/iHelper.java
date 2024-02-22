package br.com.wesley.agendatelefonica.api.helper;

import br.com.wesley.agendatelefonica.api.dto.ContatoDTO;
import br.com.wesley.agendatelefonica.domain.model.Contato;


public class iHelper {

    public Contato converterDtoParaContato(ContatoDTO contatoDTO) {
        Contato contato = new Contato();
        contato.setNome(contatoDTO.getNome());
        contato.setTelefone(contatoDTO.getTelefone());
        return contato;
    }
}
