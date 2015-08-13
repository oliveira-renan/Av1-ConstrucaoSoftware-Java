/*
 * Copyright (c) 2015, GEC5 and/or its affiliates. All rights reserved.
 * INSTITUTO INFNET. Use is subject to license terms.
 * 
 * 
 * 
 */
package com.concessionaria.veiculos;

import java.util.InputMismatchException;

import com.concessionaria.administracao.auxiliares.SubOpcoesMenu.*;

/**
 * @author Tiago Henrique
 * @author Yasmin Farias
 * @author Renan Oliveira
 * @see Veiculo
 * @since JDK 1.8
 *
 */

public class Motocicleta extends Veiculo {
	private int cilindrada;
	private int capacidaDeTanque;
	
	public Motocicleta() {
	}
	
	public int getCilindrada() {
		return cilindrada;
	}
	
	public void setCilindrada(int cilindrada) {
		this.cilindrada = cilindrada;
	}
	
	public int getCapacidaDeTanque() {
		return capacidaDeTanque;
	}
	
	public void setCapacidaDeTanque(int capacidadeTanque) {		
		this.capacidaDeTanque = capacidadeTanque;
	}
	
	/**
	 * Cadastra os Dados de uma nova Motocicleta e Retorna um
	 * Veiculo Preenxido.
	 * 
	 * @throws InputMismatchException se digitar alguma String
	 * quando se pede Inteiro.
	 */
	public Veiculo cadastrarVeiculo(){
		int opcaoEscolhida = 0;
		
		System.out.println("********Entre com caracteristicas para a sua moto********");
		
		tela.exibirMsg("\nEntre com o chassi: ");
		setChassi(entradaDeDado.getInputString());
		
		tela.inserirQuebraDeLinha();
		Montadora.exibirOpcoes();
		tela.exibirMsg("\nEntre com a Montadora: ");
		try {
			opcaoEscolhida = entradaDeDado.getInputInt();
		} catch (InputMismatchException string) {
			tela.exibirMsg("N�o se Aceita Letras, s� N�meros..");
			System.exit(1);
		}
		setMontadora(Montadora.pesquisarOpcao(opcaoEscolhida));
		
		tela.exibirMsg("Entre com o Modelo: ");
		try {
			setModelo(entradaDeDado.getInput());
		} catch (InputMismatchException string) {
			tela.exibirMsg("N�o se Aceita Letras, s� N�meros..");
			System.exit(1);
		}
		
		tela.inserirQuebraDeLinha();
		TipoMoto.exibirOpcoes();
		tela.exibirMsg("Entre com o tipo de moto: ");
		try {
		opcaoEscolhida = entradaDeDado.getInputInt();
		} catch (InputMismatchException string) {
			tela.exibirMsg("N�o se Aceita Letras, s� N�meros..");
			System.exit(1);
		}
		setTipo(TipoMoto.pesquisarOpcao(opcaoEscolhida));
		
		tela.inserirQuebraDeLinha();
		Cor.exibirOpcoes();
		tela.exibirMsg("Entre com a cor: ");
		try {
			opcaoEscolhida = entradaDeDado.getInputInt();
		} catch (InputMismatchException string) {
			tela.exibirMsg("N�o se Aceita Letras, s� N�meros..");
			System.exit(1);
		}
		setCor(Cor.pesquisarOpcao(opcaoEscolhida));
		
		tela.exibirMsg("Entre com o pre�o: ");
		try {
			setPreco(entradaDeDado.getInputDouble());
		} catch (InputMismatchException string) {
			tela.exibirMsg("N�o se Aceita Letras, s� N�meros..");
			System.exit(1);
		}
		
		tela.exibirMsg("Entre com a capacidade do tanque da moto: ");
		try {
			setCapacidaDeTanque(entradaDeDado.getInputInt());
		} catch (InputMismatchException string) {
			tela.exibirMsg("N�o se Aceita Letras, s� N�meros..");
			System.exit(1);
		}
		
		tela.inserirQuebraDeLinha();
		Cilindrada.exibirOpcoes();
		tela.exibirMsg("Entre com a cilindrada da moto: ");
		try {
			setCilindrada(Cilindrada.pesquisarOpcao(entradaDeDado.getInputInt()));
		} catch (InputMismatchException string) {
			tela.exibirMsg("N�o se Aceita Letras, s� N�meros..");
			System.exit(1);
		}
		
		return this;
	}
	
		public void exibirVeiculo(){
		
		tela.exibirMsgLine("Chassi: " + getChassi());
		tela.exibirMsgLine("Montadora: " + getMontadora());
		tela.exibirMsgLine("Modelo: " + getModelo());
		tela.exibirMsgLine("Tipo: " + getTipo());
		tela.exibirMsgLine("Cilindrada: " + getCilindrada());
		tela.exibirMsgLine("Capacida De Tanque: " + getCapacidaDeTanque());
		tela.exibirMsgLine("Cor: " + getCor());
		tela.exibirMsg("Preco: " + tela.exibirValorReais(getPreco()));
		System.out.println("-----------X------------\n");
	}
}
