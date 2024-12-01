package org.example.classes;

public class produtosFisicos extends produto {
    protected double peso;
    protected double dimensoes;

    public produtosFisicos(){
        super();
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getDimensoes() {
        return dimensoes;
    }

    public void setDimensoes(double dimensoes) {
        this.dimensoes = dimensoes;
    }

    public produtosFisicos(double peso, double dimensoes) {
        this.peso = peso;
        this.dimensoes = dimensoes;
    }

    public produtosFisicos(int id, String nome, double preco, double peso, double dimensoes) {
        super(id, nome, preco);
        this.peso = peso;
        this.dimensoes = dimensoes;
    }
    public double calcularFrete(double cep){
        return peso * dimensoes/cep;
    }
    public void produto1(){
    produtosFisicos PF1 = new produtosFisicos(30.00, 40.50);
    produto Produto1 = new produto(01,"cesto", 19.90);
    }
    public void produto2(){
        produtosFisicos PF2 = new produtosFisicos(50.00, 70.80);
        produto Produto2 = new produto(02, "capa", 10.00);
    }
    public void produto3(){
        produtosFisicos PF3 = new produtosFisicos(25.00, 40.65);
        produto Produto3 = new produto(03, "Pelicula", 5.00);

    }

}