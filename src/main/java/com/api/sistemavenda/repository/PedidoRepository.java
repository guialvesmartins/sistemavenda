package com.api.sistemavenda.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.api.sistemavenda.model.Pedido;

public interface PedidoRepository extends JpaRepository<Pedido,Long> {
    
}
