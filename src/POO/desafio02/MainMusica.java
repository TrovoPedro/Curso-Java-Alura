package desafio02;

public class MainMusica {
    public static void main(String[] args) {
        Musica musica1 = new Musica();

        musica1.titulo = "Californication";
        musica1.artista = "Red Hot Chili Peppers";
        musica1.anoLancamento = 2010;

        musica1.avaliaMusica(5.0);
        System.out.println(musica1.calculaMediaAvaliacao());
        musica1.exibeFichaTecnica();
    }
}
