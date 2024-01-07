package com.api.sistemavenda.model;

import java.util.List;

import com.api.sistemavenda.model.Enums.SituacaoPedido;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;

@Entity

public class Pedido {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;
    @ManyToOne
    @JoinColumn(name = "cliente_id", nullable = false)
    private Cliente cliente;
    @ManyToMany()
    @JoinTable(
        name = "pedidos_produtos",
        joinColumns = @JoinColumn(name = "pedido_id"),
        inverseJoinColumns = @JoinColumn(name = "produto_id")
    )
    private List<Produto> produtos;
    @Column(nullable = false)
    private Number valor;
    private String observacao;
    @Enumerated(EnumType.STRING)
    private SituacaoPedido situacaoPedido;

    public Long getId() {
        return Id;
    }
    public void setId(Long id) {
        Id = id;
    }
    public Cliente getCliente() {
        return cliente;
    }
    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
    public List<Produto> getProdutos() {
        return produtos;
    }
    public void setProdutos(List<Produto> produtos) {
        this.produtos = produtos;
    }
    public Number getValor() {
        return valor;
    }
    public SituacaoPedido getSituacaoPedido() {
        return situacaoPedido;
    }
    public void setSituacaoPedido(SituacaoPedido situacaoPedido) {
        this.situacaoPedido = situacaoPedido;
    }
    public void setValor(Number valor) {
        this.valor = valor;
    }
    public String getObservacao() {
        return observacao;
    }
    public void setObservacao(String observacao) {
        this.observacao = observacao;
    }

    
    
}
