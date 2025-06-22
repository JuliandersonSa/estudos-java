package operadores;

import java.util.Scanner;
import java.util.Locale;

public class OperadoresRelacionaisExercicio {

	public static void main(String[] args) {
		
		//Locale.setDefault(Locale.US);
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite o primeiro número: ");
		int numero1 = entrada.nextInt();
		entrada.nextLine();
		System.out.println("Digite o segundo número: ");
		int numero2 = entrada.nextInt();
		entrada.nextLine();
		
		System.out.println(numero1 + " é igual a " + numero2 + "? " + (numero1 == numero2));
		System.out.println(numero1 + " é diferente de " + numero2 + "? " + (numero1 != numero2));
		System.out.println(numero1 + " é maior que " + numero2 + "? " + (numero1 > numero2));
		System.out.println(numero1 + " é menor que " + numero2 + "? " + (numero1 < numero2));
		System.out.println(numero1 + " é maior ou igual a " + numero2 + "? " + (numero1 >= numero2));
		System.out.println(numero1 + " é menor ou igual a " + numero2 + "? " + (numero1 <= numero2));
		
		entrada.close();
	}

}
