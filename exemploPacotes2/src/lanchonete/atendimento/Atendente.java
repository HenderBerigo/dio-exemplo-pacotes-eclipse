package lanchonete.atendimento;

public class Atendente {
	public void servindoMesa() {
		pegarLancheCozinha();
		System.out.println("Servindo a Mesa...");
	}
	
	private void pegarLancheCozinha() {
		System.out.println("Pegando Lanche na Cozinha");
	}
	
	public void receberPagamento() {
		System.out.println("Recebendo pagamento...");
	}
	
	void trocarGas() {
		System.out.println("Atendente trocando Gás...");
	}
	
	private void pegarPedidoBalcao() {
		System.out.println("Pegando o Pedido no Balcão");
	}
	
	
}
