package ColecaoDeDados.principal;

import ColecaoDeDados.modelos.Filme;
import ColecaoDeDados.modelos.Serie;
import ColecaoDeDados.modelos.Titulo;

import java.util.*;

public class PrincipalComListas {
    public static void main(String[] args) {
        Filme meuFilme = new Filme("O poderoso chefão", 1970); // Instância do objeto "Filme"
        meuFilme.avalia(10);
        Serie lost = new Serie("Lost", 2000);
        lost.avalia(5);
        Filme meuFilme2 = new Filme("O poderoso chefinho", 2017);
        meuFilme2.avalia(1);
        Filme meuFilme3 = new Filme("Jumanji", 2017);
        meuFilme3.avalia(10);

        List<Titulo> lista = new ArrayList<>();
        lista.add(meuFilme);
        lista.add(meuFilme2);
        lista.add(meuFilme3);
        lista.add(lost);

        for(Titulo item: lista){
            System.out.println(item.getNome());
            if (item instanceof Filme filme){
                System.out.println("Classificação: "+ filme.getClassificacao());
            }
        }

        List<String> buscarPorArtista = new LinkedList<>();
        buscarPorArtista.add("Adam Sandler");
        buscarPorArtista.add("Pedro");
        buscarPorArtista.add("Miguel");
        System.out.println(buscarPorArtista);

        Collections.sort(buscarPorArtista);
        System.out.println("Depois da ordenação");
        System.out.println(buscarPorArtista);

        System.out.println("Lista de titulos ordenados");
        Collections.sort(lista);
        System.out.println(lista);

        lista.sort(Comparator.comparing(Titulo::getAnoDeLancamento));
        System.out.println("Ordenando por data de lançamento");
        System.out.println(lista);
    }
}
