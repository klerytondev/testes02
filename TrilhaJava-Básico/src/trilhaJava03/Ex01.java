package trilhaJava03;

import java.util.Scanner;

/*
 * 
 * Crie Um Programa Para Determinar Se Uma Pessoa Está Apta Para Dirigir Um Carro.
Você Deve Solicitar A Entrada De Dados: Nome, Idade, Habilitado
Se A Pessoa É Maior De Idade E Se Tem Carteira De Habilitação
Ou Seja, Se Atende A Todos Os Requisitos, Informar: “Liberação Realizada Para ”, Nome
Senao Informar Que “O Cliente “,Nome, “ Não Atente A Todos Os Requisitos.
Obrigatórios”
 * 
 * @Kleryton de Souza
 * 
 */

public class Ex01 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		String nome;
		int idade = 0;
		String habilitado;
		boolean cond;

		System.out.print("Digite o nome: ");
		nome = sc.nextLine();
		System.out.print("Digite a idade: ");
		idade = sc.nextInt();
		System.out.print("É habilitado? sim(S) - não(N): ");
		habilitado = sc.next();

		if (habilitado == "S") {
			cond = true;
		} else {
			cond = false;
		}

		System.out.println(nome + " " + Teste(idade, cond));

		sc.close();
	}

	public static String Teste(int idade, boolean habilitado) {
		boolean resul = (idade >= 18 && habilitado == true);
		if (resul == true) {
			return String.format("Está apto a dirigir");
		} else {
			return String.format("Não está ápto a dirigir");
		}

	}

}
