package com.hender.clinical.model;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		System.out.println("Hello World!");
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Digite seu nome: ");
		String nome = scan.nextLine();
		System.out.print("Digite a sua idade: ");
		int idade = scan.nextInt();
		System.out.println("Olá "+nome+", sua idade é: "+idade+"!");
		scan.close();
	}

}
