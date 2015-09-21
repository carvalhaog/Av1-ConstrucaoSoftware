package fabricas;

import java.util.InputMismatchException;
import java.util.Scanner;

import veiculos.CorVeiculo;
import veiculos.TipoMoto;
import veiculos.Veiculo;

//Fabrica para motos em formato de pesquisa, isso é, que podem não ter todos os atributos
public class MotoPesquisaFactory implements Fabricavel {

	public Veiculo criarVeiculo() {
		Veiculo moto = new Veiculo();

		String chassi, montadora, modelo;
		int cilindrada, capacidadeTanque, cor, tipo;
		float preco;

		Scanner input = new Scanner(System.in);

		try {
			System.out.println("Entre com o chassi da moto: ");
			chassi = input.next();
			if (chassi.equals("-1"))
				return moto;
			moto.setAtributo("chassi", chassi);

			input.nextLine();
			System.out.println("Entre com a montadora da moto: ");
			montadora = input.nextLine();
			if (montadora.equals("-1"))
				return moto;
			moto.setAtributo("montadora", montadora);
			System.out.println("Entre com o modelo da moto: ");
			modelo = input.nextLine();
			if (modelo.equals("-1"))
				return moto;
			moto.setAtributo("modelo", modelo);
			System.out
					.println("Entre com o tipo da moto: 1 - Custon, 2 - Wheelie, 3 - Scooter ");
			tipo = input.nextInt();
			if (tipo == -1)
				return moto;
			switch (tipo) {
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
			System.out
					.println("Entre com a cor da moto: 1 - Vermelho, 2 - Preto, 3 - Prata ");
			cor = input.nextInt();
			if (cor == -1)
				return moto;
			switch (cor) {
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
			if (cilindrada == -1)
				return moto;
			moto.setAtributo("cilindrada", cilindrada);
			System.out.println("Entre com a capacidade do tanque da moto: ");
			capacidadeTanque = input.nextInt();
			if (capacidadeTanque == -1)
				return moto;
			moto.setAtributo("capacidadeTanque", capacidadeTanque);
			System.out.println("Entre o preco da moto: ");
			preco = input.nextFloat();
			if (preco == -1)
				return moto;
			moto.setAtributo("preco", preco);

			return moto;
		} catch (InputMismatchException exception) {
			System.out
					.println("Entrada invalida. A criacao do veiculo sera cancelada!!");

			return null;
		}
	}

}
