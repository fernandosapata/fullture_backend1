package com.fullture.ex1;

import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@RestController
public class CarrinhoController {

	@Autowired
	CarrinhoService carrinhoService;

	@RequestMapping("/carrinho/limpar")
	public String limpar() {
		carrinhoService.limpar();
		return "Pronto, o carrinho está limpo!";
	}

	@RequestMapping("/carrinho/adicionar")
	public String adicionar(Model model) {

		carrinhoService.addProduto(new Produto());

		return "Produto adicionado com sucesso!";
	}

	@RequestMapping("/carrinho/listar")
	public @ResponseBody List<Produto> listar() {
		return carrinhoService.getProdutos();
	}	

}