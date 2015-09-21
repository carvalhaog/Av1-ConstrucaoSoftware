package main;

import loja.Loja;
import veiculos.Veiculo;
import fabricas.CarroFactory;
import fabricas.CarroPesquisaFactory;
import fabricas.Fabricavel;
import fabricas.MotoFactory;
import fabricas.MotoPesquisaFactory;

public class Main {

	public static void main(String[] args) {
		Loja loja = new Loja();
		
		//Cria uma fabrica de carros, cria um novo carro e isere o mesmo no estoque da loja
		Fabricavel fabrica = new CarroFactory();
		Veiculo carro = fabrica.criarVeiculo();
		if(carro != null)
			loja.adicionarVeiculo(carro);
		else
			System.out.println("Falha ao criar o veiculo!");
		
		//Cria uma fabrica de motos, cria uma nova moto e isere a mesma no estoque da loja
		fabrica = new MotoFactory();
		Veiculo moto = fabrica.criarVeiculo();
		if(moto != null)
			loja.adicionarVeiculo(moto);
		else
			System.out.println("Falha ao criar o veiculo!");
		
		//Lista o estoque da loja
		loja.listarEstoque();
		
		//cria uma moto de pesquisa e pesquisa se há alguma moto que corresponde a essas caracteristicas
		fabrica = new MotoPesquisaFactory();
		Veiculo pesquisa = fabrica.criarVeiculo();
		if(pesquisa != null)
			loja.pesquisarVeiculo(pesquisa);
		else
			System.out.println("Falha ao criar o veiculo!");
		
		//cria um carro de pesquisa e pesquisa se há algum carro que corresponde a essas caracteristicas
		fabrica = new CarroPesquisaFactory();
		pesquisa = fabrica.criarVeiculo();
		if(pesquisa != null)
			loja.pesquisarVeiculo(pesquisa);
		else
			System.out.println("Falha ao criar o veiculo!");
	}

}
