package lanchonete.atendimento.cozinha;

import lanchonete.atendimento.Atendente;

public class Cozinheiro {
	public void adicionarLancheNoBalcao() {
		System.out.println("Adicionando Lanche no balcão...");
	}

	public void adicionarSucoNoBalcao() {
		System.out.println("Adicionando Suco no balcão...");
	}

	public void adicionarComboNoBalcao() {
		adicionarLancheNoBalcao();
		adicionarSucoNoBalcao();
	}

	private void prepararLanche() {
		System.err.println("Preparando Lanche...");
	}

	private void prepararVitamina() {
		System.err.println("Preparando Vitamina...");
	}

	private void prepararCombo() {
		prepararLanche();
		prepararVitamina();
	}

	private void selecionarIngredientesLanche() {
		System.out.println("Selecionado o Pão, Salada, Ovo e Carne...");
	}

	private void selecionarIngredientesVitamina() {
		System.out.println("Selecionado a Fruta, Leite e Suco...");
	}

	private void lavarIngredientes() {
		System.out.println("Lavando os Ingredientes...");
	}

	private void baterVitaminaNoLiquidificador() {
		System.out.println("Batendo Vitamina no Liquidificador");
	}

	private void fritarIngredientesDoLanche() {
		System.out.println("Fritando a Carne e o Ovo para o lanche...");
	}


	private void pedirTrocarGas(Almoxarife meuAmigo) {
		meuAmigo.trocarGas();
	}

	private void pedirIngredientes(Almoxarife almoxarife) {
		almoxarife.entregarIngredientes();
	}

}
