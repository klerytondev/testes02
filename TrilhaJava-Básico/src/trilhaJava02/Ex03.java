package trilhaJava02;

import java.util.Scanner;


/*
 * 
 * CRIAR UM PROGRAMA PARA VERIFICAR MAIOR NUMERO
ENTRAR COM O NUMERO1 , NUMERO2LER OS VALORESSE O NUMERO1 FOR MAIOR QUE NUMERO2 DEVE MOSTRAR
VERDADEIRO, SENAO MOSTRAR FALSOUSAR OPERADORE S L�GICOS
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

		// Teste com operadores l�gicos

		System.out.println(num01 > num02);

		// Segunda solu��o(melhor)

		/*
		 * if(num01 > num02) {
		 * System.out.println("O primeiro numero digitado � MAIOR!"); } else {
		 * System.out.println("O primeiro numero digitado � MENOR!"); }
		 */

		sc.close();
	}

}
