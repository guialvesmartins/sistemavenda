package com.api.sistemavenda.domain.repository;
import org.springframework.data.jpa.repository.JpaRepository;

import com.api.sistemavenda.domain.model.Categoria;

public interface CategoriaRepository extends JpaRepository<Categoria, Long> {
    
}
