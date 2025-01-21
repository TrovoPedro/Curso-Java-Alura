package desafio02;

public class Musica {
    String titulo;
    String artista;
    int anoLancamento;
    double avaliacao;
    int numeroAvaliacao;

    void exibeFichaTecnica(){
        System.out.println("Título: "+titulo);
        System.out.println("Artista: "+artista);
        System.out.println("Ano de lançamento: "+anoLancamento);
        System.out.println("Avaliação: "+avaliacao);
        System.out.println("Número de avaliações: "+numeroAvaliacao);
    }

    void avaliaMusica(double avaliacao){
        this.avaliacao += avaliacao;
        numeroAvaliacao++;
    }

    double calculaMediaAvaliacao(){
        return avaliacao / numeroAvaliacao;
    }
}
