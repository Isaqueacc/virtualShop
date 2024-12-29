package org.example.classes;

public class produtoDigital extends produto {
    protected double tamanhoArquivo;
    protected String formato;
    public produtoDigital(){
        super();
    }

    public double getTamanhoArquivo() {
        return tamanhoArquivo;
    }

    public void setTamanhoArquivo(double tamanhoArquivo) {
        this.tamanhoArquivo = tamanhoArquivo;
    }

    public String getFormato() {
        return formato;
    }

    public void setFormato(String formato) {
        this.formato = formato;
    }

    public produtoDigital(int id, String nome, double preco, double tamanhoArquivo, String formato) {
        super(id, nome, preco);
        this.tamanhoArquivo = tamanhoArquivo;
        this.formato = formato;
    }
}