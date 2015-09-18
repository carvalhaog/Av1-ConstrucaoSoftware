package fabricas;

import java.util.Scanner;

import veiculos.CambioVeiculo;
import veiculos.CorVeiculo;
import veiculos.TipoCarro;
import veiculos.TipoMoto;
import veiculos.TipoVeiculo;
import veiculos.Veiculo;

public class VeiculosFactory {

	public static Veiculo criarVeiculo(TipoVeiculo tipo) {

		Veiculo novoVeiculo = new Veiculo();

		switch (tipo) {
		case CARRO:
			criarCarro(novoVeiculo);
			break;
		case MOTO:
			criarMoto(novoVeiculo);
			break;
		default:
			novoVeiculo = null;;
			break;
		}

		return novoVeiculo;
	}

	private static void criarCarro(Veiculo carro){
		
		String chassi, montadora, modelo;
		int tipo, cor, cambio;
		float motorizacao, preco;
		Scanner input = new Scanner(System.in);
		
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
		System.out.println("Entre com o tipo do carro: 1 - Sedan, 2 - Hatch, 3 - SUV ");
		tipo = input.nextInt();
		switch(tipo){
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
		System.out.println("Entre com a cor do carro: 1 - Vermelho, 2 - Preto, 3 - Prata ");
		cor = input.nextInt();
		switch(cor){
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
		System.out.println("Entre com o cambio do carro: 1 - Manual, 2 - Automatico ");
		cambio = input.nextInt();
		switch(cambio){
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
		
	}
	
	private static void criarMoto(Veiculo moto){
		String chassi, montadora, modelo;
		int cilindrada, capacidadeTanque, cor, tipo;
		float preco;
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Entre com o chassi da moto: ");
		chassi = input.next();
		moto.setAtributo("chassi", chassi);
		
		input.nextLine();
		System.out.println("Entre com a montadora da moto: ");
		montadora = input.nextLine();
		moto.setAtributo("montadora", montadora);
		System.out.println("Entre com o modelo da moto: ");
		modelo = input.nextLine();
		moto.setAtributo("modelo", modelo);
		System.out.println("Entre com o tipo da moto: 1 - Custon, 2 - Wheelie, 3 - Scooter ");
		tipo = input.nextInt();
		switch(tipo){
			case 1:
				moto.setAtributo("tipo", TipoMoto.CUSTOM.name());
			break;
			case 2:
				moto.setAtributo("tipo", TipoMoto.WHEELIE.name());
			break;
			case 3:
				moto.setAtributo("tipo", TipoMoto.SCOOTER.name());
			break;
			default:
				System.out.println("Tipo invalido!");
		}
		System.out.println("Entre com a cor da moto: 1 - Vermelho, 2 - Preto, 3 - Prata ");
		cor = input.nextInt();
		switch(cor){
			case 1:
				moto.setAtributo("cor", CorVeiculo.VERMELHO.name());
			break;
			case 2:
				moto.setAtributo("cor", CorVeiculo.PRETO.name());
			break;
			case 3:
				moto.setAtributo("cor", CorVeiculo.PRATA.name());
			break;
			default:
				System.out.println("Cor invalida!");
		}
		System.out.println("Entre com a cilindrada da moto: ");
		cilindrada = input.nextInt();
		moto.setAtributo("cilindrada", cilindrada);
		System.out.println("Entre com a capacidade do tanque da moto: ");
		capacidadeTanque = input.nextInt();
		moto.setAtributo("capacidadeTanque", capacidadeTanque);
		System.out.println("Entre o preco da moto: ");
		preco = input.nextFloat();
		moto.setAtributo("preco", preco);
		
	}

}
