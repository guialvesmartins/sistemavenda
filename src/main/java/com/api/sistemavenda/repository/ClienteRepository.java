package com.api.sistemavenda.repository;
import org.springframework.data.jpa.repository.JpaRepository;

import com.api.sistemavenda.model.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente,Long> {
    
}
