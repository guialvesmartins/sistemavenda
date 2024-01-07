package com.api.sistemavenda.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import com.api.sistemavenda.model.Produto;

public interface ProdutoRepository extends JpaRepository<Produto,Long> {
    
}
