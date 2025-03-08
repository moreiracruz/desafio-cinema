package com.cinema;

import com.cinema.ingresso.Ingresso;
import com.cinema.ingresso.IngressoFamilia;
import com.cinema.ingresso.MeiaEntrada;

import java.util.Scanner;

public class CinemaApplication {

	public static void main(String[] args) {
		new CinemaApplication().run();
	}

	public void run() {
		Scanner scanner = new Scanner(System.in);
		scanner.useDelimiter("\n");
		while (true) {
			System.out.println("Escolha o tipo de ingresso:");
			System.out.println("1 - Meia Entrada");
			System.out.println("2 - Ingresso Família");
			System.out.println("3 - Sair");
			int opcao = scanner.nextInt();
			if (opcao == 3) break;

			System.out.println("Digite o nome do filme:");
			String nomeFilme = scanner.next();
			System.out.println("O filme é dublado? (true/false):");
			boolean isDublado = scanner.nextBoolean();
			System.out.println("Digite o valor do ingresso:");
			double valor = scanner.nextDouble();

			Ingresso ingresso;
			if (opcao == 1) {
				ingresso = new MeiaEntrada(valor, nomeFilme, isDublado);
			} else {
				System.out.println("Digite o número de pessoas:");
				int numeroPessoas = scanner.nextInt();
				ingresso = new IngressoFamilia(valor, nomeFilme, isDublado, numeroPessoas);
			}

			System.out.println("Valor do ingresso: " + ingresso.getValorReal());
		}
		scanner.close();
	}

}
