package com.api.sistemavenda.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.api.sistemavenda.domain.model.Cliente;
import com.api.sistemavenda.domain.repository.ClienteRepository;

import org.springframework.web.bind.annotation.RequestMapping;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/cliente")

public class ClienteController {
    
    @Autowired
    private ClienteRepository repository;

    @GetMapping
    public List<Cliente> listar(){
        return repository.findAll();
    }

    @PostMapping
    public void incluir(@RequestBody Cliente cliente){
        repository.save(cliente);
    }

    @PutMapping 
    public void alterar(@RequestBody Cliente cliente){
        if(cliente.getId() > 0){
            repository.save(cliente);
        }
    }

    @DeleteMapping
    public void excluir(@RequestBody Cliente cliente){
        repository.delete(cliente);
    }

}
