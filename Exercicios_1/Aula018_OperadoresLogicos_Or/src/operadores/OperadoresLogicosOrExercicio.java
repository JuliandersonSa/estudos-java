package operadores;

import java.util.Locale;
import java.util.Scanner;

public class OperadoresLogicosOrExercicio {

	public static void main(String[] args) {
		//Locale.setDefault(Locale.US);
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Você tem ingresso? S/N: ");
		String ingresso = entrada.nextLine();
		System.out.println("Seu nome está na lista VIP? S/N: ");
		String vip = entrada.nextLine();
		
		if (ingresso.equalsIgnoreCase("s") || vip.equalsIgnoreCase("s")) {
			System.out.println("Entrada liberada!");
		}else {
			System.out.println("Entrada negada!");
		}
		entrada.close();
	}

}
