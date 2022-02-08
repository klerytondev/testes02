package trilhaJava02;

import java.util.Scanner;

/*
 * 
 * CRIAR UM PROGRAMA PARA MOSTRAR O SEU NOME E SOBRE NOME
 * SOLICITAR A ENTRADA COM O NOME, SOBRE NOME SAIDA: “ BEM VINDO “ NOME “ “, SOBRE NOME
 * 
 * @Kleryton de Souza
 * 
 * */

public class Ex02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String nome;
		String sobrenome;
		
		System.out.print("Digite seu nome: "); //Entrada de dados
		nome = sc.next();
		System.out.print("Digite seu sobrenome: ");//Entrada de dados
		sobrenome = sc.next();
		
		System.out.println("Bem vindo " + nome + " " + sobrenome); //saida de dados
		
		
		sc.close();

	}

}
