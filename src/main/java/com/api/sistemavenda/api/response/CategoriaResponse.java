package com.api.sistemavenda.api.response;

import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

public class CategoriaResponse {
    private Long id;
    private String nome;
    private boolean status;
    private List<ProdutoResponse> produtos;
}
