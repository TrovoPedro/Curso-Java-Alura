package POO.aula02.br.com.tmusic.modelo.principal;

import POO.aula02.br.com.tmusic.modelo.modelo.MinhasPreferidas;
import POO.aula02.br.com.tmusic.modelo.modelo.Musica;
import POO.aula02.br.com.tmusic.modelo.modelo.Podcast;

public class Main {
    public static void main(String[] args) {
        Musica minhaMusica = new Musica();
        minhaMusica.setTitulo("Ele se morde");
        minhaMusica.setCantor("Ryu, the runner");
        minhaMusica.setAlbum("SEMRÉH");
        minhaMusica.setGenero("Trap");

        for(int i = 0; i < 1000; i++){
            minhaMusica.reproduz();
        }

        for(int i = 0; i < 50; i++){
            minhaMusica.curte();
        }

        Podcast podcast = new Podcast();

        podcast.setApresentador("Igão");
        podcast.setTitulo("Tamo competindo tamo competindo?");
        podcast.setDescricao("Episódio com pilotos da Fórmula 1");

        for(int i = 0; i < 5000; i++){
            podcast.reproduz();
        }

        for(int i = 0; i < 1000; i++){
            podcast.curte();
        }

        MinhasPreferidas minhasPreferidas = new MinhasPreferidas();
        minhasPreferidas.inclui(podcast);
        minhasPreferidas.inclui(minhaMusica);
    }
}
