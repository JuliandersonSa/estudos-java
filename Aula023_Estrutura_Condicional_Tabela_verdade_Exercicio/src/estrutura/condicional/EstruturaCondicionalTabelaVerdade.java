package estrutura.condicional;

import java.util.Scanner;

public class EstruturaCondicionalTabelaVerdade {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Você tem ingresso? (S/N) ");
		String ingresso = entrada.nextLine();
		System.out.println("Você está na lista vip? (S/N) ");
		String listaVip = entrada.nextLine();
		System.out.println("Você tem documento com foto? (S/N) ");
		String docFoto = entrada.nextLine();
		
		boolean temIngressoOuListaVip = ingresso.equalsIgnoreCase("s") || listaVip.equalsIgnoreCase("s");
		boolean temFoto = docFoto.equalsIgnoreCase("s");
		
		if (temIngressoOuListaVip && temFoto) {
			System.out.println("Entrada liberada!");
		} else {
			System.out.println("Entrada negada!");
		}
		
		entrada.close();
		
	}

}
