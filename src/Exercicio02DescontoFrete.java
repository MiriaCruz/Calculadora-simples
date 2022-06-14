import java.util.Scanner;

public class Exercicio02DescontoFrete {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("O valor do seu produto é: ");
		Double preco = scanner.nextDouble();
		
		Double ValorFrete = 15.0;
		Boolean ValorSemFrete = preco >= 100;
		if (ValorSemFrete) {
			ValorFrete = 0.00;
		}
		
		Double totalCompra = preco + ValorFrete;
		System.out.println("O valor total é de: R$" + totalCompra);
		
		scanner.close();	
	}
}
