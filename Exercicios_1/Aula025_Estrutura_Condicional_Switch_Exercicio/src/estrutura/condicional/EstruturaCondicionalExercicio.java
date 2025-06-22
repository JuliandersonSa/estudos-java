package estrutura.condicional;

import java.util.Scanner;

public class EstruturaCondicionalExercicio {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		
		System.out.println("Digite o número do mês de 1 a 12: ");
		int mes = entrada.nextInt();
		entrada.nextLine();
		
		switch (mes) {
		
		case 1: {
			System.out.println("O mês de janeiro tem 31 dias.");
			break;
		}
		case 2: {
			System.out.println("O mês de fevereiro tem 28 dias.");
			break;
		}
		case 3: {
			System.out.println("O mês de março tem 31 dias.");
			break;
		}
		case 4: {
			System.out.println("O mês de abril tem 30 dias.");
			break;
		}
		case 5: {
			System.out.println("O mês de maio tem 31 dias.");
			break;
		}
		case 6: {
			System.out.println("O mês de junho tem 30 dias.");
			break;
		}
		case 7: {
			System.out.println("O mês de julho tem 31 dias.");
			break;
		}
		case 8: {
			System.out.println("O mês de agosto tem 31 dias.");
			break;
		}
		case 9: {
			System.out.println("O mês de setembro tem 30 dias.");
			break;
		}
		case 10: {
			System.out.println("O mês de outubro tem 31 dias.");
			break;
		}
		case 11: {
			System.out.println("O mês de novembro tem 30 dias.");
			break;
		}
		case 12: {
			System.out.println("O mês de dezembro tem 31 dias.");
			break;
		}
		default: {
			System.out.println("Dia inválido!");
		}
		}
		
		entrada.close();
	}

}
