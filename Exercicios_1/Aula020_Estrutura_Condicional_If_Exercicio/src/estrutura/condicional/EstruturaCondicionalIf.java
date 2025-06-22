package estrutura.condicional;

import java.util.Scanner;

public class EstruturaCondicionalIf {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite sua idade: ");
		int idade = entrada.nextInt();
		entrada.nextLine();
		
		if (idade >= 18) {
			System.out.println("Você pode tirar CNH.");
		} else {
			System.out.println("Você não pode tirar CNH.");
		}
		
		entrada.close();
	}

}
