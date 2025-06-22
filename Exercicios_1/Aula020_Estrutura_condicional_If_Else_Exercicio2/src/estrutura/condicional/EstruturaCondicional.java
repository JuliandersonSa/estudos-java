package estrutura.condicional;

import java.util.Scanner;

public class EstruturaCondicional {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite sua idade: ");
		int idade = entrada.nextInt();
		entrada.nextLine();
		
		if (idade < 0) {
			System.out.println("Idade inválida. Tente novamente.");
		} else if (idade >= 0 && idade < 13) {
			System.out.println("Você é uma criança.");
		} else if (idade < 18) {
			System.out.println("Você é um adolescente.");
		} else if (idade < 60) {
			System.out.println("Você é um adulto.");
		} else {
			System.out.println("Você é um idoso.");
		}
		
		entrada.close();
	}

}
