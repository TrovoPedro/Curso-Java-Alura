package aula02.br.com.tmusic.modelo;

public class Audio {
    private String titulo;
    private int totalDeReproducoes;
    private int numeroDeCurtidas;
    private int classificacao;

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getTotalDeReproducoes() {
        return totalDeReproducoes;
    }

    public int getClassificacao() {
        return classificacao;
    }

    public int getNumeroDeCurtidas() {
        return numeroDeCurtidas;
    }

    public void curte(){
        this.numeroDeCurtidas++;
    }

    public void reproduz(){
        this.totalDeReproducoes++;
    }


}
