package cadastro.simples.pessoa;

import java.util.Locale;
import java.util.Scanner;

public class Aula010_CadastroSimplesPessoa2 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Digite seu nome: ");
		String nome = entrada.nextLine();
		System.out.print("Digite sua idade: ");
		int idade = entrada.nextInt();
		entrada.nextLine();
		System.out.print("Digite sua altura: ");
		double altura = entrada.nextDouble();
		entrada.nextLine();
		System.out.print("Digite seu gênero M/F: ");
		char genero = entrada.next().charAt(0);
		System.out.print("Estudante? true/false");
		boolean estudante = entrada.nextBoolean();
		
		System.out.println("Nome: " + nome);
		System.out.println("Idade: " + idade);
		System.out.println("Altura: " + altura);
		System.out.println("Gênero: " + genero);
		System.out.println("Estudante: " + estudante);
		
		entrada.close();
	}

}
