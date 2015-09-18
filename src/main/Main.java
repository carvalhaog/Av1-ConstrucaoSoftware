package main;

import loja.Loja;
import veiculos.TipoVeiculo;
import veiculos.Veiculo;
import fabricas.VeiculoPesquisaFabrica;
import fabricas.VeiculosFactory;

public class Main {

	public static void main(String[] args) {
		Loja loja = new Loja();
		
		Veiculo moto = VeiculosFactory.criarVeiculo(TipoVeiculo.MOTO);
		Veiculo carro = VeiculosFactory.criarVeiculo(TipoVeiculo.CARRO);
		
		loja.adicionarVeiculo(moto);
		loja.adicionarVeiculo(carro);

		loja.listarEstoque();
		
		Veiculo pesquisa = VeiculoPesquisaFabrica.criarVeiculoPesquisa(TipoVeiculo.MOTO);
		
		loja.pesquisarVeiculo(pesquisa);
		
	}

}
