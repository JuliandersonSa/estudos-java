package app.principal;

import app.modelo.Pessoa;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		Pessoa p = new Pessoa();
		
		System.out.print("Digite seu nome: ");
		p.nome = entrada.nextLine();
		System.out.print("Digite sua idade: ");
		p.idade = entrada.nextInt();
		entrada.nextLine();
		System.out.print("Digite sua cidade: ");
		p.cidade = entrada.nextLine();
		System.out.print("Digite sua profissão: ");
		p.profissao = entrada.nextLine();
		System.out.println("\n");
		System.out.println("DADOS CADASTRADOS:");
		System.out.println("Nome: " + p.nome);
		System.out.println("Idade: " + p.idade + " anos");
		System.out.println("Cidade: " + p.cidade);
		System.out.println("Profissão: " + p.profissao);
		
		entrada.close();
		
	}

}
