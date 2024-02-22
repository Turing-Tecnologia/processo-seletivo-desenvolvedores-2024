package br.com.wesley.agendatelefonica.domain.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.wesley.agendatelefonica.domain.model.Contato;

@Repository
public interface ContatoRepository extends JpaRepository<Contato, Long> {

}
