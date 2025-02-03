package desafio01;

public class Main {
    public static void main(String[] args) {
        Venda venda1 = new Venda();

        venda1.produto = "Camiseta";
        venda1.quantidade = 2;
        venda1.valorUnitario = 25.50;

        System.out.println("Valor total da venda: "+ venda1.quantidade * venda1.valorUnitario);
    }
}
