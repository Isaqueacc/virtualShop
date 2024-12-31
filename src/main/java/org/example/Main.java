package org.example;


import org.example.classes.carrinhoDeCompras;
import org.example.classes.produto;
import org.example.classes.produtoDigital;
import org.example.classes.produtoFisico;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        // PRODUTOS FISICOS
        produto PF1 = new produtoFisico(1,"Corrente", 23.99, 12.00,20.30);
        produto PF2 = new produtoFisico(2, "cabo",10.00,15.05,10.05);
        produto PF3 = new produtoFisico(3, "carregador", 20.00, 10.00, 20.20);
        produto PF4 = new produtoFisico(4,"fone", 30.99, 10.00,30.15);
        produto PF5 = new produtoFisico(5,"pilha", 01.00, 13.00, 15.00);
        // PRODUTOS VIRTUAIS
        produto PV1 = new produtoDigital(6,"bitcoin", 15.00,20.00,"png");
        produto PV2 = new produtoDigital(7,"dolar", 30.00, 10.00, "jpeg");
        produto PV3 = new produtoDigital(8, "ebook", 45.00, 50.00, "pdf");
        produto PV4 = new produtoDigital(9,"foto",13.99,3.20, "png");
        produto PV5 = new produtoDigital(10,"arquivo", 70.00, 16.00, "mp4");
        // TESTE DE CLASSE
        //Criação do carrinho de compras
        carrinhoDeCompras carrinho = new carrinhoDeCompras();
        // adicionar produtos ao carrinho
        carrinho.adicionarProduto(PF1);
        carrinho.adicionarProduto(PV4);
        carrinho.adicionarProduto(PF2);
        carrinho.adicionarProduto(PV5);
        // exibir produtos
        System.out.println("Produtos no carrinho");
        for (produto p : carrinho.getProdutos()){
            System.out.println(p.getNome() + " - R$" + p.getPreco());
        }
        // calcular e exibir o total
        System.out.println("Total do carrinho: R$" + carrinho.calcularTotal());

        //remover produto
        carrinho.removePRoduto(PV4);

        // exibir carrinho pós remoção
        System.out.println("PRodutos no carriinho após remover item 'corrente' " );
        for (produto p : carrinho.getProdutos()) {
            System.out.println(p.getNome() + "- R$" + p.getPreco());
        }
            // calculando exibição total do carrinho após a remoção
            System.out.println("Total do carrinho após a remoção da corrente: R$ " + carrinho.calcularTotal());

    }
}