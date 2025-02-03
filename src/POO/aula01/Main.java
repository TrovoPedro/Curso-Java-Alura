package POO.aula01;

import POO.aula01.screenmatch.calculos.CalculadoraDeTempo;
import POO.aula01.screenmatch.calculos.FiltroDeRecomendacao;
import POO.aula01.screenmatch.modelos.Episodio;
import POO.aula01.screenmatch.modelos.Filme;
import POO.aula01.screenmatch.modelos.Serie;

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

        Serie lost = new Serie();
        lost.setNome("Lost");
        lost.setAnoDeLancamento(2000);
        lost.exibeFichaTecnica();
        lost.setTemporadas(10);
        lost.setEpsodiosPorTemporada(10);
        lost.setMinutosPorEpsodio(50);
        System.out.println("Duração para maratonar Lost: " + lost.getDuracaoEmMinutos());

        Filme meuFilme2 = new Filme(); // Instância do objeto "Filme"

        meuFilme2.setNome("O poderoso chefinho");
        meuFilme2.setAnoDeLancamento(2017);
        meuFilme2.setDuracaoEmMinutos(97);

        CalculadoraDeTempo calculadora = new CalculadoraDeTempo();
        calculadora.inclui(meuFilme);
        calculadora.inclui(meuFilme2);
        calculadora.inclui(lost);
        System.out.println(calculadora.getTempoTotal());

        FiltroDeRecomendacao filtro = new FiltroDeRecomendacao();
        filtro.filtra(meuFilme);

        Episodio episodio = new Episodio();
        episodio.setNumero(1);
        episodio.setSerie(lost);
        episodio.setTotalDeVisualizacoes(300);
        filtro.filtra(episodio);
    }
}