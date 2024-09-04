package com.aula5;

import com.aula5.Carrinho;
import com.aula5.Produto;
import com.aula5.TipoProduto;

public class main {
    public static void main (String[] args) throws Exception {
        Produto p1 = new Produto("Caneta", 1.8, TipoProduto.Escritorio);
        Produto p2 = new Produto("Bala", 2.4, TipoProduto.Alimento);
        Produto p3 = new Produto("Capinha", 20, TipoProduto.Tecnologia);
        Carrinho k = new Carrinho();
        k.inserir(p1);
        k.inserir(p2);
        k.inserir(p3);

        k.listar();

    }
}
