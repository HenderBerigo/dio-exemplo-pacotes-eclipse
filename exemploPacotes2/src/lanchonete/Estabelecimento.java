package lanchonete;

import lanchonete.area.cliente.Cliente;
import lanchonete.atendimento.Atendente;
//import lanchonete.atendimento.cozinha.Almoxarife;
import lanchonete.atendimento.cozinha.Cozinheiro;

public class Estabelecimento {
	public static void main(String[] args) {
		Cozinheiro cozinheiro = new Cozinheiro();
		//cozinheiro.lavarIngredientes();
		//cozinheiro.baterVitaminaNoLiquidificador();
		//cozinheiro.selecionarIngredientesVitamina();
		//cozinheiro.prepararLanche();
		//cozinheiro.prepararVitamina();
		
		cozinheiro.adicionarSucoNoBalcao();
		cozinheiro.adicionarLancheNoBalcao();
		cozinheiro.adicionarComboNoBalcao();
		
		//Almoxarife almoxarife = new Almoxarife();
		//almoxarife.controlarEntrada();
		//almoxarife.controlarSaida();
		
		
		Atendente atendente = new Atendente();
		//atendente.pegarLancheCozinha();
		atendente.servindoMesa();
		atendente.receberPagamento();
		//
		
		
		Cliente cliente = new Cliente();
		cliente.escolherLanche();
		cliente.fazerPedido();
		//cliente.pegarPedidobalcao();
		//cliente.consultarSaldoAplicativo();
		cliente.pagarConta();
		
	}
}
