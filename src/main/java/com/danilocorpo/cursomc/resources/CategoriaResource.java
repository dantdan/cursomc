package com.danilocorpo.cursomc.resources;

import com.danilocorpo.cursomc.domain.Categoria;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping(value="/categorias")
public class CategoriaResource {

    @RequestMapping(method = RequestMethod.GET)
    public List<Categoria> Listar(){
        Categoria cat1 = new Categoria(1,"informatica");
        Categoria cat2 = new Categoria(2,"escritório");

        List<Categoria> catList = new ArrayList<Categoria>();
        catList.add(cat1);
        catList.add(cat2);

        return catList;
    }
}
