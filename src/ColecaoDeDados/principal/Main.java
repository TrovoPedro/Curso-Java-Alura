package ColecaoDeDados.principal;

import ColecaoDeDados.calculos.CalculadoraDeTempo;
import ColecaoDeDados.calculos.FiltroDeRecomendacao;
import ColecaoDeDados.modelos.Episodio;
import ColecaoDeDados.modelos.Filme;
import ColecaoDeDados.modelos.Serie;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Filme meuFilme = new Filme("O poderoso chefão", 1970); // Instância do objeto "aula01.screenmatch.modelos.Filme"
        meuFilme.setDuracaoEmMinutos(180);
        meuFilme.exibeFichaTecnica();
        meuFilme.avalia(8.1);
        meuFilme.avalia(3.0);
        meuFilme.avalia(5.5);

        System.out.println("Total de avalições:" + meuFilme.getTotalDeAvaliacoes());
        System.out.println(meuFilme.pegaMedia());

        Serie lost = new Serie("Lost", 2000);
        lost.exibeFichaTecnica();
        lost.setTemporadas(10);
        lost.setEpsodiosPorTemporada(10);
        lost.setMinutosPorEpsodio(50);
        System.out.println("Duração para maratonar Lost: " + lost.getDuracaoEmMinutos());

        Filme meuFilme2 = new Filme("O poderoso chefinho", 2017); // Instância do objeto "Filme"
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
        episodio. setSerie(lost);
        episodio.setTotalDeVisualizacoes(300);
        filtro.filtra(episodio);

        Filme meuFilme3 = new Filme("Jumanji", 2017);
        meuFilme2.setDuracaoEmMinutos(97);
        meuFilme3.avalia(10);

        ArrayList<Filme> listaDeFilmes = new ArrayList<>();
        listaDeFilmes.add(meuFilme);
        listaDeFilmes.add(meuFilme2);
        listaDeFilmes.add(meuFilme3);

        System.out.println("Tamanho da lista: " + listaDeFilmes.size());
        System.out.println("Primeiro filme: " + listaDeFilmes.get(0).getNome());
        System.out.println(listaDeFilmes);
        System.out.println("toString do filme: " + listaDeFilmes.get(0).getNome().toString());
    }
}