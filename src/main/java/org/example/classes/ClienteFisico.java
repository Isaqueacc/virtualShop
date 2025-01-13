package org.example.classes;

public class ClienteFisico extends Cliente {
    private int numero;
    public ClienteFisico(String nome, String email, String endereço) {
        super(nome, email, endereço);
    }

    public ClienteFisico(String nome, String email, String endereço, int numero) {
        super(nome, email, endereço);
        this.numero = numero;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }
}
