package operadores;

import java.util.Scanner;

public class OperadoresLogicosOrExercicio2 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		float dinheiroParaViajar = 2000f;
		int milhasParaViajar = 15000;
		
		System.out.println("Quanto dinheiro você tem disponível? R$ ");
		float dinheiroDisponivel = entrada.nextFloat();
		entrada.nextLine();
		System.out.println("Quantas milhas você tem disponível? ");
		int milhasDisponivel = entrada.nextInt();
		entrada.nextLine();
		
		boolean podeViajar = dinheiroDisponivel >= dinheiroParaViajar || milhasDisponivel >= milhasParaViajar;
		
		if (podeViajar) {
			System.out.println("Você pode viajar nas férias!");
		}else {
			System.out.println("Você não pode viajar. Economize mais!");
		}
		
		entrada.close();
	}

}
