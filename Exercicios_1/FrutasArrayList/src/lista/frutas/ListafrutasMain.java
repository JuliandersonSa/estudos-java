package lista.frutas;

import java.util.Scanner;
import java.util.ArrayList;

public class ListafrutasMain {

	public static void main(String[] args) {
		ArrayList<String> frutas = new ArrayList<>();
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Quantas frutas você quer cadastrar? ");
		int quantidade = entrada.nextInt();
		entrada.nextLine();
		
		for(int i = 0; i < quantidade; i++) {
			System.out.print("Digite o nome da fruta: ");
			String fruta = entrada.nextLine();
			frutas.add(fruta);
			
		}
		System.out.println("=-".repeat(11));
		System.out.println("FRUTAS CADASTRADAS:");
		int contador = 1;
		for(String fruta : frutas) {
			System.out.println(contador + " - " + fruta);
			contador++;
		}
		
		entrada.close();
	}

}

