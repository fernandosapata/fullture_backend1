package com.fullture.ex1;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class CarrinhoService {
    private static List<Produto> produtos;

    public CarrinhoService() {
        produtos = new ArrayList<Produto>();
    }   

    public List<Produto> getProdutos() {
        System.out.println("Total de Produtos no Carrinho: " + produtos.size());
        return produtos;
    }

    public void addProduto(Produto produto) {
        produtos.add(produto);

        System.out.println("Total de Produtos no Carrinho: " + produtos.size());
    }

    public void limpar() {
        produtos = new ArrayList<Produto>();
        System.out.println("Total de Produtos no Carrinho: " + produtos.size());
    }
}
