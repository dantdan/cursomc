package com.danilocorpo.cursomc.services;


import com.danilocorpo.cursomc.domain.Categoria;
import com.danilocorpo.cursomc.repositories.CategoriaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class CategoriaService {

    @Autowired
    private CategoriaRepository repo;

    public Optional<Categoria> buscar(Integer id){
        Optional<Categoria> categoria = repo.findById(id);

        return categoria;
    }
}
