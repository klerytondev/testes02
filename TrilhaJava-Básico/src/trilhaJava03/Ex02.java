package trilhaJava03;

import java.util.Scanner;

/*
 * 
 	* Criar Um Programa Para Validar Clientes Fidelização Do Supermercado Seu Joao
	*Entrar Com Dados: Nome, Sobre Nome E Rg
	*Ler Os Valores
	*Realizar A Saida : “Bem Vindo: “, Nome, “ “ Sobre Nome”
	*Colocar O Texto: “Vc É Portador Do Documento Rg : “, Rg
	*Se Sim Mensagem “Perfeito !! Boas Compras“
	*Senao Mensagem “Sinto Muito, Desconto Nao Autorizado!, Mas Pode Fazer As Compras”
	* 
	* @Klerytom de Souza
	* 
 * 
 */

public class Ex02 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		String nome;
		int registroGeral = 0;
		final int rgValidacao = 123456;

		System.out.print("Digite o nome: ");
		nome = sc.nextLine();
		System.out.print("Digite o seu RG: ");
		registroGeral = sc.nextInt();
		if (registroGeral == rgValidacao) {
			System.out.println("Bem vindo " + nome + " você é portador do RG nº " + rgValidacao);
			System.out.println("Boas compras!");
		} else {
			System.out.println("Sinto muito, desconto não autorizado!");
			System.out.println("Mas pode fazer as compras.");
		}

		sc.close();

	}

}
