package fabricas;

import java.util.InputMismatchException;
import java.util.Scanner;

import veiculos.CorVeiculo;
import veiculos.TipoMoto;
import veiculos.Veiculo;

//Fabrica de motos
public class MotoFactory implements Fabricavel{
	
	//Método que cria e retorna uma nova moto, recebendo os dados do usuario
	public Veiculo criarVeiculo() {
		Veiculo moto = new Veiculo();
		
		String chassi, montadora, modelo;
		int cilindrada, capacidadeTanque, cor, tipo;
		float preco;
		
		Scanner input = new Scanner(System.in);
		
		try{
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
		
		return moto;
		}
		catch (InputMismatchException exception) {
			System.out
					.println("Entrada invalida. A criacao do veiculo sera cancelada!!");

			return null;
		}
	}
	
}
