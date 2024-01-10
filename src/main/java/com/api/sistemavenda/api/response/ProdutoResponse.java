package com.api.sistemavenda.api.response;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ProdutoResponse{
    private Long id;
    private String nome;
    private String descricao;
    private Number preco;
    private boolean status;
    private Long categoriaId;
}
