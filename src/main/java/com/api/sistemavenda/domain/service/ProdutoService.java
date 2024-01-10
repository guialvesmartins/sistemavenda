package com.api.sistemavenda.domain.service;
import java.util.Optional;
import java.util.List;
import org.springframework.stereotype.Service;
import com.api.sistemavenda.domain.model.Produto;
import com.api.sistemavenda.domain.repository.ProdutoRepository;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;

@Service
@Transactional
@RequiredArgsConstructor

public class ProdutoService {

    private final ProdutoRepository repository;

    public Produto salvar(Produto produto) {

        // boolean existeCpf = false;

        // Optional<Produto> optProduto = repository.findById(produto.getId());

        // if (optProduto.isPresent()) {
        //     if (!optProduto.get().getId().equals(produto.getId())) {
        //         existeCpf = true;
        //     }
        // }

        // if (existeCpf) {
        //     throw new BusinessException("Cpf já cadastrado!");
        // }

        return repository.save(produto);
    }

    public Produto alterar(Long id, Produto paciente) {

        // Optional<Produto> optPaciente = this.buscarPorId(id);

        // if (optPaciente.isEmpty()) {
        //     throw new BusinessException("Paciente não cadastrado!");
        // }

        paciente.setId(id);

        return salvar(paciente);
    }

    public List<Produto> listarTodos() {
        return repository.findAll();
    }

    public Optional<Produto> buscarPorId(Long id) {
        return repository.findById(id);
    }

    public void deletar(Long id) {
        repository.deleteById(id);
    }
}
