package Aula2;

public class ProdutoTestar {

    public static void main(String[] args) {

        // Construtor padrão:
        Produto p1 = new Produto();
        p1.nome = "Caneta Preta";
        p1.marca = "Bic";
        p1.valor = 1.50f;

        // Construtor de dois parametros:
        Produto p2 = new Produto("Caneta azul", "Bic");
        p2.valor = 1.66f;

        // Construtor de três parametros:
        // No valor se coloca o f para não confundir com double
        Produto p3 = new Produto("Caderno", "Faber", 10.50f);

        // Objeto p1
        System.out.println("\nNome: " + p1.nome + " \nMarca: " + p1.marca + " \nValor: " + p1.valor);

        // Objeto p2
        System.out.println("\nNome: " + p2.nome + " \nMarca: " + p2.marca + " \nValor: " + p2.valor);

        // Objeto p1
        System.out.println("\nNome: " + p3.nome + " \nMarca: " + p3.marca + " \nValor: " + p3.valor);

    }
}
