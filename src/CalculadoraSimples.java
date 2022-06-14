import java.util.Scanner;

public class CalculadoraSimples {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		//Declarando as váriaveis
		
		Integer adicao = 1;
		Integer subtracao = 2;
		Integer multiplicacao = 3;
		Integer divisao = 4;
		Integer resultado;
	
		
		System.out.println("---------CALCULADORA SIMPLES--------");
		
		System.out.print("Digite o primeiro numero: ");
		Integer numero1 = scanner.nextInt();
		
		System.out.print("Digite o segundo numero: ");
		Integer numero2 = scanner.nextInt();
		
		System.out.println("Digite o numero da operacao : ");
		Integer operacao = scanner.nextInt();
		
		if (operacao.equals(adicao)) {
			resultado = numero1 + numero2;
			System.out.print("O resultado da Operação em Adição: " + resultado);
		}
			if(operacao.equals(subtracao)) {
				resultado = numero1 - numero2;
				System.out.print("O resultado da Operação em Subtração: " + resultado);
		}
				if(operacao.equals(multiplicacao)) {
					resultado = numero1 * numero2;
					System.out.print("O resultado da operação em Multiplicação: " + resultado);
		}
					if(operacao.equals(divisao)) {
						resultado = numero1 / numero2;
						System.out.print("O resultado da operação em Divisão: " + resultado);
		}
			scanner.close();		
	}
}
