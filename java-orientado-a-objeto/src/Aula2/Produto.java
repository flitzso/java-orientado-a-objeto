package Aula2;

public class Produto {

    // Atributos:
    String nome;
    String marca;
    float valor;

    // construtores:
    Produto() {

    }

    Produto(String nome) {
        // esse.nome vai receber(=) o parametro(String nome)
        this.nome = nome;

    }

    Produto(String nome, String marca) {
        this.nome = nome;
        this.marca = marca;
    }

    Produto(String nome, String marca, float valor) {
        this.nome = nome;
        this.marca = marca;
        this.valor = valor;
    }

}
