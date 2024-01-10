package com.api.sistemavenda.domain.repository;
import org.springframework.data.jpa.repository.JpaRepository;

import com.api.sistemavenda.domain.model.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente,Long> {
    
}
