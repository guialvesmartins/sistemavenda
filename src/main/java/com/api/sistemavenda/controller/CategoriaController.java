package com.api.sistemavenda.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.api.sistemavenda.model.Categoria;
import com.api.sistemavenda.repository.CategoriaRepository;

import org.springframework.web.bind.annotation.RequestMapping;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/categoria")

public class CategoriaController {
    
    @Autowired
    private CategoriaRepository repository;

    @GetMapping
    public List<Categoria> listar(){
        return repository.findAll();
    }

    @PostMapping
    public void incluir(@RequestBody Categoria categoria){
        repository.save(categoria);
    }

    @PutMapping 
    public void alterar(@RequestBody Categoria categoria){
        if(categoria.getId() > 0){
            repository.save(categoria);
        }
    }

    @DeleteMapping
    public void excluir(@RequestBody Categoria categoria){
        repository.delete(categoria);
    }

}
