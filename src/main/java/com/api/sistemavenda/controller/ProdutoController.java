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

import com.api.sistemavenda.model.Produto;
import com.api.sistemavenda.repository.ProdutoRepository;

import org.springframework.web.bind.annotation.RequestMapping;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/produto")

public class ProdutoController {
    
    @Autowired
    private ProdutoRepository repository;

    @GetMapping
    public List<Produto> listar(){
        return repository.findAll();
    }

    @PostMapping
    public void incluir(@RequestBody Produto produto){
        repository.save(produto);
    }

    @PutMapping 
    public void alterar(@RequestBody Produto produto){
        if(produto.getId() > 0){
            repository.save(produto);
        }
    }

    @DeleteMapping
    public void excluir(@RequestBody Produto produto){
        repository.delete(produto);
    }

}
