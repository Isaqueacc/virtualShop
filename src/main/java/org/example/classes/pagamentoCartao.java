package org.example.classes;

public class pagamentoCartao extends Pagamento{
    private int numeroCartao;
    private int parcelas;

    public int getNumeroCartao() {
        return numeroCartao;
    }

    public void setNumeroCartao(int numeroCartao) {
        this.numeroCartao = numeroCartao;
    }

    public int getParcelas() {
        return parcelas;
    }

    public void setParcelas(int parcelas) {
        this.parcelas = parcelas;
    }

    public pagamentoCartao(Double valor, int numeroCartao, int parcelas) {
        super(valor);
        this.numeroCartao = numeroCartao;
        this.parcelas = parcelas;
    }
    public void validarCartao(){

    }
}
