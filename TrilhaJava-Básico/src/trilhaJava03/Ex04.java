package trilhaJava03;

import java.util.Scanner;

/*
 * 
 * Escreva Um Programa De Calculadora Basica:
Entre Com O Numero1
Entre Com O Operador ( / * +
Entre Com O Segundo Numero
Usar O SWITCH
Case "+"
RESULTADO = NUMERO 1 + NUMERO 2
Escrever Na Tela ( Numero 1," + ", Numero2, " = ", Resultado) , Assim Por Diante,
Outro Caso Escrever "Operador Invalido"
 * 
 * @Kleryton de Souza
 * 
 */

public class Ex04 {

	public static void main(String[] args) {

			Scanner sc= new Scanner(System.in);
			
			int numero01 = 0;
			int numero02 = 0;
			String operador;
			double resultado = 0;
			
			System.out.print("Entre com o primeiro numero: ");
			numero01 = sc.nextInt();
			
			System.out.print("Entre com a operação que deseja realizar  ( / * + - ): ");
			operador = sc.next();
			
			System.out.print("Entre com o segundo numero: ");
			numero02 = sc.nextInt();
			switch (operador) {
			case "/":
				resultado = numero01 / numero02;
				System.out.println(numero01  + " " + operador + " " + numero02 + " = " + resultado);
				break;
			case "*":
				resultado = numero01 * numero02;
				System.out.println(numero01  + " " + operador + " " + numero02 + " = " + resultado);
				break;
			case "+":
				resultado = numero01 + numero02;
				System.out.println(numero01  + " " + operador + " " + numero02 + " = " + resultado);
				break;
			case "-":
				resultado = numero01 - numero02;
				System.out.println(numero01  + " " + operador + " " + numero02 + " = " + resultado);
				break;

			default:
				System.out.println("Você NÃO digitou um operador válido!");
			}
			
			sc.close();
	}

}
