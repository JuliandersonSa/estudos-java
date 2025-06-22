package app.principal;

import java.util.Scanner;

import app.modelo.Pessoa;

public class Main {

	public static void main(String[] args) {
		
		//criando objeto Scanner para entrada de dados de usuário
		Scanner entrada = new Scanner(System.in);
		
		//criando um objeto da classe Pessoa
		Pessoa p = new Pessoa();
		
		System.out.print("Digite seu nome: ");
		p.nome = entrada.nextLine();
		System.out.print("Digite sua idade: ");
		p.idade = entrada.nextInt();
		
		System.out.println("Olá! Seu nome é " + p.nome + " e você tem " + p.idade );
		
		entrada.close();//fechada o Scanner (boa prática)
	}

}
