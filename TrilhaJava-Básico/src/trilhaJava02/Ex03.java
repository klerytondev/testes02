package trilhaJava02;

import java.util.Scanner;


/*
 * 
 * CRIAR UM PROGRAMA PARA VERIFICAR MAIOR NUMERO
ENTRAR COM O NUMERO1 , NUMERO2LER OS VALORESSE O NUMERO1 FOR MAIOR QUE NUMERO2 DEVE MOSTRAR
VERDADEIRO, SENAO MOSTRAR FALSOUSAR OPERADORE S LÓGICOS
 *
 *@Kleryton de Souza
 * 
 */

public class Ex03 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int num01 = 0;
		int num02 = 0;

		System.out.print("Digite o primeiro numero: "); // Entrada de dados
		num01 = sc.nextInt();
		System.out.print("Digite o segundo numero: "); // Entrada de dados
		num02 = sc.nextInt();

		// Teste com operadores lógicos

		System.out.println(num01 > num02);

		// Segunda solução(melhor)

		/*
		 * if(num01 > num02) {
		 * System.out.println("O primeiro numero digitado é MAIOR!"); } else {
		 * System.out.println("O primeiro numero digitado é MENOR!"); }
		 */

		sc.close();
	}

}
