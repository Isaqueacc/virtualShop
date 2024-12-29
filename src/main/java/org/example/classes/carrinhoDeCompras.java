package org.example.classes;

import java.util.ArrayList;
import java.util.List;

public class carrinhoDeCompras{
    private List<produto> produtos;

    public List<produto> getProdutos() {
        return produtos;
    }

    public void setProdutos(List<produto> produtos) {
        this.produtos = produtos;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public carrinhoDeCompras(List<produto> produtos, double total) {
        this.produtos = produtos;
        this.total = total;
    }

    private double total;

public carrinhoDeCompras(){
    produtos = new ArrayList<>();
    total = 0.0;
    }
    public void adicionarProduto(produto p){
        produtos.add(p);
        total += p.getPreco();
    }
    public void removePRoduto(produto p){
    if(produtos.remove(p)){
        total -= p.getPreco();
    }
    }
    public double calcularTotal(){
    total = 0.0;
    for (produto p : produtos){
        total += p.getPreco();
    }
    return total;
    }
}
