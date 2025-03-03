package lanchonete.atendimento.cozinha;

public class Almoxarife {
	private void controlarEntrada() {
		System.out.println("Controlando a Entrada dos itens...");
	}
	
	private void controlarSaida() {
		System.out.println("Controlando a Saída dos itens...");
	}
	
	void entregarIngredientes() {
		System.out.println("Entregando Ingredientes...");
		controlarSaida();
		controlarEntrada();
	}
	
	void trocarGas() {
		System.out.println("Almoxarife trocando Gás...");
	}
}
