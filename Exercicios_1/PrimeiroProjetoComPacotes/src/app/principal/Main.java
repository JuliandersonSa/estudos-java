package app.principal;

import app.modelo.Pessoa;

//define a classe pública Main (classe principal do programa)
public class Main {
	
	//método principal do Java, ponto de entrada da aplicação
	public static void main(String[] args) {
		
		//cria um novo objeto da classe Pessoa e guarda na variável 'p'
		Pessoa p = new Pessoa();
		
		//exibe no console o conteúdo do atributo 'nome' do objeto p
		System.out.println("Nome: " + p.nome);
	}

}
