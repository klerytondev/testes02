package trilhaJava03;

import java.util.Scanner;

public class Ex06 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int qtdeAtual = 0;
		int qtdeMaxima = 0;
		int qtdeMinima = 0;
		float qtdeMEdia = 0;
		
		System.out.print("Entre com a quantidade atual: ");
		qtdeAtual = sc.nextInt();
		System.out.print("Entre com a quantidade maxima: ");
		qtdeMaxima = sc.nextInt();
		System.out.print("Entre com a quantidade minima: ");
		qtdeMinima = sc.nextInt();
		
		qtdeMEdia = (qtdeMaxima + qtdeMinima)/2;
		
		if(qtdeAtual >= qtdeMEdia) {
			System.out.println("Não efetuar a compra!");
		}
		else {
			System.out.println("Efetuar a compra!");
		}
		
		sc.close();
	}

}
