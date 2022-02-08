package trilhaJava04;

import java.util.Scanner;

public class Ex03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String nome;
		int idade = 0;
		String op;
		float mediaIdades = 0;
		int maiorIdade = 0;
		int somaIdades = 0;
		int cont = 0;

		System.out.print("Digite 'S' para iniciar a entrada: ");
		op = sc.next();

		if (op.equals("s")) {

			do {
				op = sc.nextLine();
				System.out.print("Digite o nome: ");
				nome = sc.nextLine();
				System.out.print("Digite a idade: ");
				idade = sc.nextInt();
				somaIdades += idade;
				cont++;
				if (idade > maiorIdade) {
					maiorIdade = idade;
				}
				op = sc.nextLine();
				System.out.print("Digite 'S' para sair: ");
				op = sc.next().toLowerCase();

			} while(!op.equals("s"));
			mediaIdades = somaIdades / cont;
		} else {
			System.out.println("Você não digitou uma opção válida!");
		}
		System.out.println("Aluno com a maior idade: " + maiorIdade);
		System.out.println("Soma da idade dos alunos: " + somaIdades);
		System.out.println("Média de idade dos alunos: " + mediaIdades);

		sc.close();

	}

}
