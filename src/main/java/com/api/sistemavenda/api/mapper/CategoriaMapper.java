package com.api.sistemavenda.api.mapper;

import java.util.List;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

import com.api.sistemavenda.api.request.CategoriaRequest;
import com.api.sistemavenda.api.response.CategoriaResponse;
import com.api.sistemavenda.domain.model.Categoria;

import lombok.RequiredArgsConstructor;

@Component
@RequiredArgsConstructor
public class CategoriaMapper {

    private final ModelMapper mapper;

    public Categoria toCategoria(CategoriaRequest request){
        return mapper.map(request,Categoria.class);
    }
    
    public CategoriaResponse toCategoriaResponse(Categoria categoria){
        return mapper.map(categoria, CategoriaResponse.class);
    }

    public List<CategoriaResponse> toCategoriaReponseList(List<Categoria> categorias){
        return categorias.stream()
            .map(this::toCategoriaResponse)
            .collect(Collectors.toList());
    }
}
