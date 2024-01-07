package com.api.sistemavenda.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import com.api.sistemavenda.model.Categoria;

public interface CategoriaRepository extends JpaRepository<Categoria, Long> {
    
}
