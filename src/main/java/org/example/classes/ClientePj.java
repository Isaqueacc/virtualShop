package org.example.classes;

public class ClientePj extends Cliente{
    private String cnpj;
    public ClientePj(String nome, String email, String endereço) {
        super(nome, email, endereço);
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public ClientePj(String nome, String email, String endereço, String cnpj) {
        super(nome, email, endereço);
        this.cnpj = cnpj;
    }
}
