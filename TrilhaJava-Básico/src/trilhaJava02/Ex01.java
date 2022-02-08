package trilhaJava02;

import java.util.Scanner;

/**
 * 
 * CRIAR UM PROGRAMA PARA O CALCULO A ÁREA DE UM CIRCULO
ENTRAR COM OS DADOS DO RAIO FORMULA DO CIRCULO: A = PI * (RAIO **2)
REALIZAR A SAIDA : “O VALOR DA ÁREA É: “, VALOR DA ÁREA DO
CIRCULOCRIAR UM PROGRAMA PARA O CALCULO A ÁREA DE UM CIRCULO
ENTRAR COM OS DADOS DO RAIO FORMULA DO CIRCULO: A = PI * (RAIO **2)
REALIZAR A SAIDA : “O VALOR DA ÁREA É: “, VALOR DA ÁREA DO CIRCULO
 * 
 * @Kleryton de Souza
 * 
 */

public class Ex01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double calArea = 0;
		double raio = 0;
		final double PI = 3.14;

		System.out.print("Digite o raio do circulo: ");
		raio = sc.nextDouble();// salva o raio do circulo na varialvel raio
		calArea = PI * (Math.pow(raio, 2)); // Calcula a area do circulo e salva na variael CalArea
		System.out.printf("Area do circulo: %.2f ", calArea);// Imprime a Area do circulo

		sc.close();

	}

}
