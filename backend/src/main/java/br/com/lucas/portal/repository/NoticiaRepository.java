package br.com.lucas.portal.repository;

import org.springframework.data.repository.CrudRepository;

import br.com.lucas.portal.model.Noticia;

public interface NoticiaRepository extends CrudRepository<Noticia, Integer> {

}
