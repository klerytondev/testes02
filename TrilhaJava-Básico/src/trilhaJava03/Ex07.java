package trilhaJava03;

import java.util.Scanner;

public class Ex07 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		String tipoCombustivel;
		float qtdeCombustivel;
		float valorTotal = 0;
		final double A = 5.34;
		final double G = 6.18;

		System.out.println("A-álcool ou G-gasolina:");
		tipoCombustivel = sc.next();
		System.out.println("Quantidade de Combustível: ");
		qtdeCombustivel = sc.nextFloat();

		if (tipoCombustivel.equals("A")) {
			if (qtdeCombustivel <= 20) {
				valorTotal = (float) ((A * qtdeCombustivel) - ((A * qtdeCombustivel) * 0.03));
				System.out.println("Valor total a ser pago: R$ " + valorTotal);
			} else {
				valorTotal = (float) ((A * qtdeCombustivel) - ((A * qtdeCombustivel) * 0.05));
				System.out.println("Valor total a ser pago: R$ " + valorTotal);

			}
		} else {
			if (qtdeCombustivel <= 20) {
				valorTotal = (float) ((G * qtdeCombustivel) - ((G * qtdeCombustivel) * 0.0226));
				System.out.println("Valor total a ser pago: R$ " + valorTotal);
			} else {
				valorTotal = (float) ((G * qtdeCombustivel) - ((G * qtdeCombustivel) * 0.0425));
				System.out.println("Valor total a ser pago: R$ " + valorTotal);

			}
		}

		sc.close();
	}

}
