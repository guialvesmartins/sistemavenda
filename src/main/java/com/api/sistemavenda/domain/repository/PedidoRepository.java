package com.api.sistemavenda.domain.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.api.sistemavenda.domain.model.Pedido;

public interface PedidoRepository extends JpaRepository<Pedido,Long> {
    
}
