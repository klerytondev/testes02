package trilhaJava05;

import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String op;
		String nome;
		double[] notas = new double[4];
		System.out.print("Digite 'S' para iniciar a entrada: ");
		op = sc.next();

		if (op.equals("s")) {

			do {

				for (int i = 0; i < notas.length; i++) {
					System.out.println("Digite o nome do aluno: ");
					nome = sc.next();
					System.out.println("Digite a nota " + i + 1);
					notas[i] = sc.nextDouble();
					op = sc.nextLine();
					System.out.print("Digite 'S' para sair: ");
					op = sc.next().toLowerCase();
				}
			} while (!op.equals("s"));
		}
		sc.close();
	}

}
