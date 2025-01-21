package aula01;

import aula01.screenmatch.modelos.Filme;

public class Main {
    public static void main(String[] args) {
        Filme meuFilme = new Filme(); // Instância do objeto "aula01.screenmatch.modelos.Filme"

        meuFilme.setNome("O poderoso chefão");
        meuFilme.setAnoDeLancamento(1970);
        meuFilme.setDuracaoEmMinutos(180);

        meuFilme.exibeFichaTecnica();
        meuFilme.avalia(8.1);
        meuFilme.avalia(3.0);
        meuFilme.avalia(5.5);

        System.out.println("Total de avalições:" + meuFilme.getTotalDeAvaliacoes());
        System.out.println(meuFilme.pegaMedia());
    }
}