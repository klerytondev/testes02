package trilhaJava03;

import java.util.Scanner;


/**
 * 
 * Crie Um Programa Temperatura De Uma Região:
Você Deve Entrada Com Os Dados:
Entre Com A Regiao ” E Outro Com Entre Com A
Temperatura ” Regiao(sul, Sudeste, Centro oeste, Norte, Nordeste), Temperatura
Se O Clima Estiver Entre Maior Igual Que 0 Até 15 Deve Informar “Muito Frio Na
Regiao ”, Regiao, Se O Clima Estiver Entre 16 Até 20 Deve Informar “Frio Moderado Na
Regiao ”, Regiao, Se O Clima Estiver Entre
21 Até 25 Deve Informar “Clima Moderado Na Regiao ”, Regiao
26 Até 35 Deve Informar “Clima Quente Na Regiao ”, Regiao
Acima de 35 graus Deve Informar “Clima Muito Quente Na Regiao ”, Regiao
 * 
 * @Kleryton de Souza
 * 
 */

public class Ex03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String regiao;
		float temp = 0;

		System.out.print("Digite a região(sul, sudeste, centro-oeste, norte ou nordeste : ");
		regiao = sc.nextLine();
		System.out.print("Digite a temperatura: ");
		temp = sc.nextFloat();

		if (temp <= 15) {
			System.out.println("Muito frio na região " + regiao);

		} else if (temp > 15 && temp <= 20) {
			System.out.println("Frio moderado na região " + regiao);

		} else if (temp > 20 && temp <= 25) {
			System.out.println("Clima moderado na região " + regiao);
		}

		sc.close();

	}

}
