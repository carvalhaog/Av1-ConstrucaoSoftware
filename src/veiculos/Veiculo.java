package veiculos;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class Veiculo {
	private HashMap<String, Object> especificacao;

	public Veiculo() {
		this.especificacao = new HashMap<String, Object>();
	}

	public void setAtributo(String atributo, Object valor) {
		especificacao.put(atributo, valor);
	}

	public void setEspecificacao(HashMap<String, Object> especificacao) {
		this.especificacao = especificacao;
	}

	public HashMap<String, Object> getEspecificacao() {
		return this.especificacao;
	}

	public Object getAtributo(String atributo) {
		return especificacao.get(atributo);
	}

	public int hashCode() {
		int hash = 0;

		Iterator<Entry<String, Object>> iterador = this.getEspecificacao().entrySet().iterator();

		// enquanto houver uma proxima entrada no mapa
		while (iterador.hasNext()) {
			Map.Entry<String, Object> atributo = (Map.Entry<String, Object>) iterador.next();
			Object valor = atributo.getValue();
			
			hash += valor.toString().length();

		}
		
		return hash;

	}

	@Override
	public boolean equals(Object veiculo) {
		if (veiculo == this) {
			return true;
		}

		if (veiculo instanceof Veiculo) {
			// cria um objeto para iterar sobre cada entrada do HashMap
			Iterator<Entry<String, Object>> iterador = ((Veiculo) veiculo)
					.getEspecificacao().entrySet().iterator();

			// enquanto houver uma proxima entrada no mapa
			while (iterador.hasNext()) {
				Map.Entry<String, Object> atributo = (Map.Entry<String, Object>) iterador
						.next();
				String chave = (String) atributo.getKey();
				String valor = atributo.getValue().toString();

				if (this.getEspecificacao().containsKey(chave)) {

					System.out.println("Valor1: "+ valor);
					System.out.println("Valor2: "+ this.getEspecificacao().get(chave).toString());
					
					if (!this.getEspecificacao().get(chave).toString().equals(valor)) {

						return false;
					}
				}

			}

			return true;
		}

		return false;
	}
}
