package operadores;

import java.util.Locale;
import java.util.Scanner;

public class OperadoresAtribuicaoExercicio {

	public static void main(String[] args) {
		//Locale.setDefault(Locale.US);
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite um número: ");
		int num = entrada.nextInt();
		entrada.nextLine();
		num += 5;
		System.out.println("Após += 5: " + num);
		num -= 3;
		System.out.println("Após -= 3: " + num);
		num *= 2;
		System.out.println("Após *= 2: " + num);
		num /= 4;
		System.out.println("Após /= 4: " + num);
		num %= 3;
		System.out.println("Após %= 3: " + num);
		
		entrada.close();
	}

}
