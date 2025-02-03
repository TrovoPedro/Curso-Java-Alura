package desafio02;

public class MainCarro {
    public static void main(String[] args) {
        Carro carro1 = new Carro();

        carro1.modelo = "Uno";
        carro1.ano = 1990;
        carro1.cor = "Prata";

        carro1.exibeFichaTecnica();
        System.out.println(carro1.calculaIdadeCarro(2025));
    }
}
