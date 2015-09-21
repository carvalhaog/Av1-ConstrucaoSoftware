package fabricas;

import java.util.InputMismatchException;
import java.util.Scanner;

import veiculos.CambioVeiculo;
import veiculos.CorVeiculo;
import veiculos.TipoCarro;
import veiculos.Veiculo;

//Fabrica de carros
public class CarroFactory implements Fabricavel {
	
	//Método que cria e retorna um novo carro, recebendo os dados do usuario
	public Veiculo criarVeiculo() {
		Veiculo carro = new Veiculo();

		String chassi, montadora, modelo;
		int tipo, cor, cambio;
		float motorizacao, preco;
		Scanner input = new Scanner(System.in);

		try {
			System.out.println("Entre com o chassi do carro: ");
			chassi = input.next();
			carro.setAtributo("chassi", chassi);
			input.nextLine();
			System.out.println("Entre com a montadora do carro: ");
			montadora = input.nextLine();
			carro.setAtributo("montadora", montadora);
			System.out.println("Entre com o modelo do carro: ");
			modelo = input.nextLine();
			carro.setAtributo("modelo", modelo);
			System.out
					.println("Entre com o tipo do carro: 1 - Sedan, 2 - Hatch, 3 - SUV ");
			tipo = input.nextInt();
			switch (tipo) {
			case 1:
				carro.setAtributo("tipo", TipoCarro.SEDAN.name());
				break;
			case 2:
				carro.setAtributo("tipo", TipoCarro.HATCH.name());
				break;
			case 3:
				carro.setAtributo("tipo", TipoCarro.SUV.name());
				break;
			default:
				System.out.println("Tipo invalido!");
			}
			System.out
					.println("Entre com a cor do carro: 1 - Vermelho, 2 - Preto, 3 - Prata ");
			cor = input.nextInt();
			switch (cor) {
			case 1:
				carro.setAtributo("cor", CorVeiculo.VERMELHO.name());
				break;
			case 2:
				carro.setAtributo("cor", CorVeiculo.PRETO.name());
				break;
			case 3:
				carro.setAtributo("cor", CorVeiculo.PRATA.name());
				break;
			default:
				System.out.println("Cor invalida!");
			}
			System.out.println("Entre com a motorização do carro: ");
			motorizacao = input.nextFloat();
			carro.setAtributo("motorizacao", motorizacao);
			System.out
					.println("Entre com o cambio do carro: 1 - Manual, 2 - Automatico ");
			cambio = input.nextInt();
			switch (cambio) {
			case 1:
				carro.setAtributo("cambio", CambioVeiculo.MANUAL.name());
				break;
			case 2:
				carro.setAtributo("cambio", CambioVeiculo.AUTOMATICO.name());
				break;
			default:
				System.out.println("Cambio invalida!");
			}
			System.out.println("Entre o preco do carro ");
			preco = input.nextFloat();
			carro.setAtributo("preco", preco);

			return carro;
		} catch (InputMismatchException exception) {
			System.out
					.println("Entrada invalida. A criacao do veiculo sera cancelada!!");

			return null;
		}
	}

}
