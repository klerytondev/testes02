package trilhaJava03;

import java.util.Scanner;

/*
 * 
 * Crie Um Programa Para Determinar Se Uma Pessoa Est� Apta Para Dirigir Um Carro.
Voc� Deve Solicitar A Entrada De Dados: Nome, Idade, Habilitado
Se A Pessoa � Maior De Idade E Se Tem Carteira De Habilita��o
Ou Seja, Se Atende A Todos Os Requisitos, Informar: �Libera��o Realizada Para �, Nome
Senao Informar Que �O Cliente �,Nome, � N�o Atente A Todos Os Requisitos.
Obrigat�rios�
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
		System.out.print("� habilitado? sim(S) - n�o(N): ");
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
			return String.format("Est� apto a dirigir");
		} else {
			return String.format("N�o est� �pto a dirigir");
		}

	}

}
