package desafio02;

public class Carro {
    String modelo;
    int ano;
    String cor;

    void exibeFichaTecnica(){
        System.out.println("Modelo do carro: "+ modelo);
        System.out.println("Ano do carro: "+ ano);
        System.out.println("Cor do carro: "+ cor);
    }

    int calculaIdadeCarro(int anoAtual){
        return anoAtual - ano;
    }
}
