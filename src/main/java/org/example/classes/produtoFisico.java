package org.example.classes;

public class produtoFisico extends produto {
    protected double peso;
    protected double dimensoes;

    public produtoFisico(){
        super();
    }

    public produtoFisico(int id, String nome, double preco, double peso, double dimensoes) {
        super(id, nome, preco);
        this.peso = peso;
        this.dimensoes = dimensoes;
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

    public produtoFisico(double peso, double dimensoes) {
        this.peso = peso;
        this.dimensoes = dimensoes;
    }
    // função que calcula frete (calculo teste apenas)
    public double calcularFrete(double cep){
        return peso * dimensoes/cep;
    }
    }
