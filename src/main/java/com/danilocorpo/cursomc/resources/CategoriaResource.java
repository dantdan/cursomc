package com.danilocorpo.cursomc.resources;

import com.danilocorpo.cursomc.domain.Categoria;
import com.danilocorpo.cursomc.services.CategoriaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
@RequestMapping(value="/categorias")
public class CategoriaResource {

    @Autowired
    private CategoriaService service;

    @RequestMapping(value ="/{id}", method = RequestMethod.GET)
    public ResponseEntity<?> find(@PathVariable Integer id){
        Optional<Categoria> categoria = service.buscar(id);

        return ResponseEntity.ok().body(categoria);
    }
}
