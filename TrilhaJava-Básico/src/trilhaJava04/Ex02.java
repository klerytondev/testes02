package trilhaJava04;

import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		float nota = 0;
		float somaNotas = 0;
		float media = 0;
		int cont = 0;

		for (int i = 0; i < 2; i++) {
			System.out.println("Digite a nota " + (i+1) + ":");
			nota = sc.nextFloat();
			somaNotas += nota;
			cont++;
		}
		media = somaNotas / cont;

		if (media >= 7) {
			System.out.println("APROVADO");
		} else if (media >= 4 && media < 7) {
			System.out.println("RECUPERAÇÃO");
		} else if (media < 4) {
			System.out.println("REPROVADO");
		}

		sc.close();

	}

}
