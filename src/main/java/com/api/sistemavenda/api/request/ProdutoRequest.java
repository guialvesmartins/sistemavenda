package com.api.sistemavenda.api.request;

import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ProdutoRequest {
    @NotBlank
    private String nome;
    @NotBlank
    private String descricao;
    @NotBlank
    private Number preco;
    private boolean status;
    @NotBlank
    private Long categoriaId;
    
}
