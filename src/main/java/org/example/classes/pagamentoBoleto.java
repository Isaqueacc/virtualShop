package org.example.classes;

import java.util.Date;

public class pagamentoBoleto extends Pagamento{
    private String codigoDeBarras;
    private Date vencimento;

    public String getCodigoDeBarras() {
        return codigoDeBarras;
    }

    public void setCodigoDeBarras(String codigoDeBarras) {
        this.codigoDeBarras = codigoDeBarras;
    }

    public pagamentoBoleto(Double valor, String codigoDeBarras) {
        super(valor);
        this.codigoDeBarras = codigoDeBarras;
    }
}
