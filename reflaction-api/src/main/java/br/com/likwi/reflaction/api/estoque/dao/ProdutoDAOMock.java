package br.com.likwi.reflaction.api.estoque.dao;

import br.com.likwi.reflaction.api.estoque.modelo.Produto;

import java.util.Arrays;
import java.util.List;


public class ProdutoDAOMock implements ProdutoDAO {
    private static final List<Produto> LISTA_PRODUTO = Arrays.asList(
            new Produto("Ford", "Bronko", 20d),
            new Produto("GM", "Corvette", 99d),
            new Produto("Mercedes-Benz", "CLA", 120.5d),
            new Produto("Mercedes-Benz", "ECq", 20d));

    public List<Produto> lista() {
        return LISTA_PRODUTO;
    }

    public Produto getProduto(Integer id) {
        return LISTA_PRODUTO.get(id);
    }
}
