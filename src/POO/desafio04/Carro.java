package desafio04;

public class Carro {
    private String modelo;
    private double precoAno;
    private double precoAno2;
    private double precoAno3;

    public double getPrecoAno() {
        return precoAno;
    }

    public void setPrecoAno(double precoAno) {
        this.precoAno = precoAno;
    }

    public double getPrecoAno2() {
        return precoAno2;
    }

    public void setPrecoAno2(double precoAno2) {
        this.precoAno2 = precoAno2;
    }

    public double getPrecoAno3() {
        return precoAno3;
    }

    public void setPrecoAno3(double precoAno3) {
        this.precoAno3 = precoAno3;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void definirPrecos(double precoAno1, double precoAno2, double precoAno3) {
        this.precoAno = precoAno1;
        this.precoAno2 = precoAno2;
        this.precoAno3 = precoAno3;
    }

    public void exibirInfo() {
        System.out.println("Modelo: " + modelo);
        System.out.println("Preço Ano 1: " + precoAno);
        System.out.println("Preço Ano 2: " + precoAno2);
        System.out.println("Preço Ano 3: " + precoAno3);
        System.out.println("Menor Preço: " + calcularMenorPreco());
        System.out.println("Maior Preço: " + calcularMaiorPreco());
    }

    private double calcularMenorPreco(){
        double menorPreco = precoAno;

        if(precoAno2 < menorPreco){
            menorPreco = precoAno2;
        }

        if (precoAno3 < menorPreco){
            menorPreco = precoAno3;
        }

        return menorPreco;
    }


    private double calcularMaiorPreco() {
        double maiorPreco = precoAno;

        if (precoAno2 > maiorPreco) {
            maiorPreco = precoAno2;
        }

        if (precoAno3 > maiorPreco) {
            maiorPreco = precoAno3;
        }

        return maiorPreco;
    }


}

