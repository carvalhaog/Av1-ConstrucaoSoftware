package loja;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

import veiculos.Veiculo;

//Classe que representa a loja
public class Loja {
	private ArrayList<Veiculo> estoque;
	
	public Loja(){
		this.estoque = new ArrayList<Veiculo>();
	}
	
	public void adicionarVeiculo(Veiculo veiculo){
		this.estoque.add(veiculo);
	}
	
	//Método que exibe uma lista genérica de veiculos. Utilizado para reuso de código de métodos da classe
	private void listarVeiculos(ArrayList<Veiculo> listaVeiculos){
		
		for(Veiculo veiculo : listaVeiculos){
			Iterator<Entry<String, Object>> iterador = ((Veiculo)veiculo).getEspecificacao().entrySet().iterator();
		    
			//enquanto houver uma proxima entrada no mapa
			while (iterador.hasNext()) {
		        Map.Entry<String, Object> atributo = (Map.Entry<String, Object>)iterador.next();
		        String chave = (String)atributo.getKey();
		        Object valor = atributo.getValue();
		        
		       		        
		        System.out.println(chave + " : " + valor);
		        System.out.println();
			}
		}
	}
	
	//Método que pesquisa se há veiculos iguais a um veiculo de pesquisa passado e lista os que corresponderem
	public void pesquisarVeiculo(Veiculo veiculoPesquisar){
		ArrayList<Veiculo> resultado = new ArrayList<Veiculo>();
		
		for(Veiculo veiculo : this.estoque){
			if(veiculo.equals(veiculoPesquisar)){
				System.out.println("O Veiculo e igual!");
				resultado.add(veiculo);
			}
		}
		
		if(resultado.isEmpty()){
			System.out.println("Não encontramos nenhum veiculo com essa especificacao!");
		}
		else{
			System.out.println("Foram encontrados os seguintes veiculos com essa especificacao: ");
			
			this.listarVeiculos(resultado);
		}
	}
	
	//Método que lista todos os veiculos do estoque
	public void listarEstoque(){
		this.listarVeiculos(this.estoque);
	}
}
