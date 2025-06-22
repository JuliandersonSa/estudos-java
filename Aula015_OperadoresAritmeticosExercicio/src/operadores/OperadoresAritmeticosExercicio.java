package operadores;

import java.util.Scanner;
import java.util.Locale;

public class OperadoresAritmeticosExercicio {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite um número: ");
		double numero1 = entrada.nextDouble();
		entrada.nextLine();
		System.out.println("Digite outro número: ");
		double numero2 = entrada.nextDouble();
		entrada.nextLine();
		
		System.out.println("Adição: " + (numero1 + numero2));
		System.out.println("Subtração: " + (numero1 - numero2));
		System.out.println("Multiplicação: " + (numero1 * numero2));
		System.out.printf("Divisão interiro: %.2f\n" , (numero1 / numero2));
		System.out.println("Resto da divisão: " + (numero1 % numero2));
		
		entrada.close();
		
	}

}
