package trilhaJava04;

import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int numero = 0;
		int soma = 0;

		do {
			System.out.println("Digite um numero: ");
			numero = sc.nextInt();
			soma += numero;
		} while (numero != 0);

		System.out.println("Resultado da soma: " + soma);

		sc.close();

	}

}
