package ColecaoDeDados.testes;

public class TesteProduto {
    public static void main(String[] args) {
        Produto p1 = new Produto("Caneta", 1.50);
        Produto p2 = p1;
        p2.setPreco(2.00);
        System.out.println(p1.getPreco());
    }
}

