package com.concessionaria.administracao.auxiliares;

import java.util.Scanner;

public class EntradaDeDados {
	private Scanner input;
	
	public EntradaDeDados() {
		input = new Scanner(System.in);
	}
	
	/**
	 * @return uma chamada de entrada do teclado de valor inteiro
	 */
	public int getInputInt() {
		return input.nextInt();
	}
	
	/**
	 * @return uma chamada de entrada do teclado de valor Double
	 */
	public double getInputDouble() {
		return input.nextDouble();
	}
	
	/**
	 * @return uma chamada de entrada do teclado de valor String
	 */
	public String getInputString() {
		return input.nextLine();
	}
	
	/**
	 * @return uma chamada de entrada do teclado de qualquer valor
	 */
	public String getInput() {
		return input.next();
	}
}
