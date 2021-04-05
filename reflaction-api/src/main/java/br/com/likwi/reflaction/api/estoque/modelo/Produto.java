package br.com.likwi.reflaction.api.estoque.modelo;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Produto {

    /*
        private String nome;
        private double valor;
        private String marca;

        @Override
        public String toString() {
            return "Produto [nome=" + nome + ", valor=" + valor + ", marca=" + marca + "]";
        }
    */
    private String nome;
    private String marca;
    private double valor;

    public Produto(String nome, String marca,double valor) {
        this.nome = nome;
        this.marca = marca;
        this.valor = valor;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    @Override
    public String toString() {
        return "Produto [nome=" + nome + ", valor=" + valor + ", marca=" + marca + "]";
    }


}
