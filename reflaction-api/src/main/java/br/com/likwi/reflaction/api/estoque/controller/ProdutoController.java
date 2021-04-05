package br.com.likwi.reflaction.api.estoque.controller;

import br.com.likwi.reflaction.api.estoque.dao.ProdutoDAOMock;
import br.com.likwi.reflaction.api.estoque.modelo.Produto;

import java.util.List;
import java.util.stream.Collectors;

public class ProdutoController {
    private ProdutoDAOMock produtoDao;

    public ProdutoController() {
        produtoDao = new ProdutoDAOMock();
    }

    public List<Produto> lista() {
        return produtoDao.lista();
    }

    public List<Produto> filtra(String nome) {
        return produtoDao.lista().stream()
                .filter(produto -> produto.getNome().toLowerCase().startsWith(nome.toLowerCase()))
                .collect(Collectors.toList());
    }

    public List<Produto> filtra(String nome, String marca) {
        return produtoDao.lista().stream()
                .filter(produto ->
                        produto.getNome().toLowerCase().startsWith(nome.toLowerCase())
                                && produto.getMarca().equalsIgnoreCase(marca)
                )
                .collect(Collectors.toList());
    }
}
