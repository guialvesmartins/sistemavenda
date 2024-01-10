package com.api.sistemavenda.api.mapper;

import java.util.List;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

import com.api.sistemavenda.api.request.ProdutoRequest;
import com.api.sistemavenda.api.response.ProdutoResponse;
import com.api.sistemavenda.domain.model.Produto;

import lombok.RequiredArgsConstructor;

@Component
@RequiredArgsConstructor
public class ProdutoMapper {

    private final ModelMapper mapper;

    public Produto toProduto(ProdutoRequest request){
        return mapper.map(request,Produto.class);
    }
    
    public ProdutoResponse toProdutoResponse(Produto produto){
        return mapper.map(produto, ProdutoResponse.class);
    }

    public List<ProdutoResponse> toProdutoReponseList(List<Produto> produtos){
        return produtos.stream()
            .map(this::toProdutoResponse)
            .collect(Collectors.toList());
    }
}
