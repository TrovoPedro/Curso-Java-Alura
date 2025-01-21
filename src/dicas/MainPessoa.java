package dicas;

public class MainPessoa {
    public static void main(String[] args) {

        Pessoa pessoa1 = new Pessoa();

        pessoa1.nome = "Pedro";
        pessoa1.idade = 19;

        System.out.println("O " +pessoa1.nome+ " tem "+ pessoa1.idade+ " anos.");

        pessoa1.fazAniversario();

        System.out.println("A idade de "+ pessoa1.nome+ " agora é "+ pessoa1.idade+ " anos.");

        Pessoa pessoa2 = new Pessoa();

        pessoa2.nome = "Miguel";
        pessoa2.idade = 15;

        System.out.println("O " +pessoa2.nome+ " tem "+ pessoa2.idade+ " anos.");

        pessoa2.fazAniversario();

        System.out.println("A idade de "+ pessoa2.nome+ " agora é "+ pessoa2.idade+ " anos.");
    }
}
