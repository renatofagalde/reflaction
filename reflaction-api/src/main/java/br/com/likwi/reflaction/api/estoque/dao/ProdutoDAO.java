package br.com.likwi.reflaction.api.estoque.dao;

import br.com.likwi.reflaction.api.estoque.modelo.Produto;

import java.util.List;

public interface ProdutoDAO {
    List<Produto> lista();
    Produto getProduto(Integer id);
}
