package trilhaJava03;

import java.util.Scanner;

public class Ex08 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		final int codigo = 1234;
		final int senha = 9999;

		int loginUsuario = 0;
		int senhaUsuario = 0;

		System.out.println("Entre com o codigo do usuário: ");
		loginUsuario = sc.nextInt();
		if (codigo != loginUsuario) {
			System.out.println("Usuário invalido!");

		} else {
			System.out.println("Entre com a senha do usuário: ");
			senhaUsuario = sc.nextInt();

			if (senha != senhaUsuario) {
				System.out.println("Senha incorreta!");
			} else {
				System.out.println("Acesso permitido!");
			}
		}

		sc.close();
	}

}
