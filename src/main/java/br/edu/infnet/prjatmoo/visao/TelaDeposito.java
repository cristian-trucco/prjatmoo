package br.edu.infnet.prjatmoo.visao;

import br.edu.infnet.prjatmoo.controle.ContaCtrl;

public class TelaDeposito implements Tela {

	private ContaCtrl contaCtrl = new ContaCtrl();

	public void apresentar() {
		System.out.println(" Qual valor do deposito?: ");
		System.out.println(" O saldo da conta é: " + contaCtrl.getSaldo());

	}
}
