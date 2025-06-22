package operadores;

import java.util.Locale;
import java.util.Scanner;

public class OperadoresLogicosAndExercicio {

	public static void main(String[] args) {
		//Locale.setDefault(Locale.US);
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite sua idade: ");
		int idade = entrada.nextInt();
		entrada.nextLine();
		System.out.println("Você tem CNH? [true/false]: ");
		String resp = entrada.nextLine();
		
		if (idade >= 18 && resp.equalsIgnoreCase("true")) {
			System.out.println("Pode dirigir");
		}else {
			System.out.println("Não pode dirigir");
		}
		entrada.close();
	}

}
