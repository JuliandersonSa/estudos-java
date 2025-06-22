package estrutura.condicional;

import java.util.Scanner;

public class OperadorTernario {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite a nota do aluno: ");
		float nota = entrada.nextFloat();
		entrada.nextLine();
		
		String status = nota >= 7 ? "Aprovado" : "Reprovado";
		System.out.println(status);
		
		entrada.close();
	}

}
