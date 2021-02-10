package br.edu.infnet.prjatmoo.visao;

import java.util.Scanner;

import br.edu.infnet.prjatmoo.controle.LoginCtrl;

public class TelaLogin {

	private String conta;
	private int pin;
	private LoginCtrl loginCrtl = new LoginCtrl();
	public void apresentar() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Bem Vindo");
		System.out.println("Informar o numero da conta");
		conta = scan.next();
		System.out.print("informa o pin: ");
		pin = scan.nextInt();
		loginCrtl.login(conta, pin);
	}

}
