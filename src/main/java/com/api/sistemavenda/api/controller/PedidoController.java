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

import com.api.sistemavenda.domain.model.Pedido;
import com.api.sistemavenda.domain.repository.PedidoRepository;

import org.springframework.web.bind.annotation.RequestMapping;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/pedido")

public class PedidoController {
    
    @Autowired
    private PedidoRepository repository;

    @GetMapping
    public List<Pedido> listar(){
        return repository.findAll();
    }

    @PostMapping
    public void incluir(@RequestBody Pedido pedido){
        repository.save(pedido);
    }

    @PutMapping 
    public void alterar(@RequestBody Pedido pedido){
        if(pedido.getId() > 0){
            repository.save(pedido);
        }
    }

    @DeleteMapping
    public void excluir(@RequestBody Pedido pedido){
        repository.delete(pedido);
    }

}
