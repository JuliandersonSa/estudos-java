package tipos.primitivos;

public class TiposPrimitivosExercicio {

	public static void main(String[] args) {
		
		String nome = "Julianderson Santos Sá";
		String endereco = "Rua Hemetério Leitão - N°481 b - São Francisco";
		double salario = 3500.50;
		String data = "01/06/2025";
		
		System.out.println("Eu " + nome + ", morando no endereço " + endereco + ", confirmo que recebi o salário de R$ " + String.format("%.2f", salario) + ", na data " + data);
	}

}
