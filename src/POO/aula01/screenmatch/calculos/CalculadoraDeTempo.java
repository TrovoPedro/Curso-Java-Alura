package POO.aula01.screenmatch.calculos;

import POO.aula01.screenmatch.modelos.Titulo;

public class CalculadoraDeTempo {
    private int tempoTotal;

    public int getTempoTotal() {
        return tempoTotal;
    }

    /*public void inclui(Filme filme){
        tempoTotal += filme.getDuracaoEmMinutos();
    }

    public void inclui(Serie serie){
        tempoTotal += serie.getDuracaoEmMinutos();
    }*/

    public void inclui(Titulo titulo){
        this.tempoTotal += titulo.getDuracaoEmMinutos();
    }
}
