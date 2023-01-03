public class CarroTestar {

    public static void main(String[] args) {

        // Instanciando o objeto:
        Carro c1 = new Carro();

        // Declarando valores aos atributos:
        c1.nome = "uno";
        c1.marca = "Fiat";
        c1.ano = 2015;
        c1.vel = 60;

        // Chamando os metodos
        c1.acelerar(10);
        c1.frear(80);
        c1.buzinar();
        System.out.println(c1.vel);
    }
}
