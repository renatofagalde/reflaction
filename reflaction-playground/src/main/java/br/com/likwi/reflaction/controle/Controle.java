package br.com.likwi.reflaction.controle;

import java.util.List;

public class Controle {
    private List<String> lista = List.of("item 1", "item 2", "item 3");

    public Controle() {
    }

    public Controle(String s) {

    }

    private Controle(String s, String string) {

    }

    public List<String> getLista() {
        return lista;
    }
}
