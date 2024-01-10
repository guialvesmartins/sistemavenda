package com.api.sistemavenda.domain.repository;
import org.springframework.data.jpa.repository.JpaRepository;

import com.api.sistemavenda.domain.model.Produto;

public interface ProdutoRepository extends JpaRepository<Produto,Long> {
    
}
