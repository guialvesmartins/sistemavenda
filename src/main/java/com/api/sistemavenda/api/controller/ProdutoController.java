package com.api.sistemavenda.api.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.api.sistemavenda.api.mapper.ProdutoMapper;
import com.api.sistemavenda.api.request.ProdutoRequest;
import com.api.sistemavenda.api.response.ProdutoResponse;
import com.api.sistemavenda.domain.model.Produto;
import com.api.sistemavenda.domain.service.ProdutoService;

import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;

import org.springframework.web.bind.annotation.RequestMapping;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/produto")
@RequiredArgsConstructor
public class ProdutoController {
    
    private final ProdutoService service;
    private final ProdutoMapper mapper;

    @GetMapping
    public ResponseEntity<List<ProdutoResponse>> buscarTodos(){
        List<Produto> produtos = service.listarTodos();
        List<ProdutoResponse> produtoResponse = mapper.toProdutoReponseList(produtos);

        return ResponseEntity.status(HttpStatus.OK).body(produtoResponse);
    }

    @GetMapping("/{id}")
    public ResponseEntity<ProdutoResponse> buscarPorId(@PathVariable Long id){
        Optional<Produto> optProduto = service.buscarPorId(id);
        if(optProduto.isEmpty()){
            return ResponseEntity.notFound().build();
        }
        ProdutoResponse produtoResponse = mapper.toProdutoResponse(optProduto.get());
        return ResponseEntity.status(HttpStatus.OK).body(produtoResponse);
    }

    @PostMapping
    public ResponseEntity<ProdutoResponse> incluir(@Valid @RequestBody ProdutoRequest request){
        Produto produto = mapper.toProduto(request);
        Produto produtoSalvo = service.salvar(produto);
        ProdutoResponse produtoResponse = mapper.toProdutoResponse(produtoSalvo);
        return ResponseEntity.status(HttpStatus.CREATED).body(produtoResponse);
    }
    
    @PutMapping("/{id}")
    public ResponseEntity<ProdutoResponse> alterar(@PathVariable Long id, @RequestBody ProdutoRequest request){
        Produto produto = mapper.toProduto(request);
        Produto produtoSalvo = service.alterar(id, produto);
        ProdutoResponse produtoResponse = mapper.toProdutoResponse(produtoSalvo);
        return ResponseEntity.status(HttpStatus.CREATED).body(produtoResponse);
    }

    @DeleteMapping
    public ResponseEntity<Void> excluir(@PathVariable Long id){
        service.deletar(id);
        return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
    }

}
