package br.com.lucas.portal.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.lucas.portal.model.Categoria;

@RestController
@RequestMapping(value = "categoria")
public class CategoriaController extends GenericController<Categoria, Integer> {

}
