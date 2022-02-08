package trilhaJava03;

import java.util.Scanner;

public class Ex05 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int numeroConta = 0;
		double saldo = 0;
		double debito = 0;
		double credito = 0;
		String op;

		System.out.print("Entre com o numero da conta: ");
		numeroConta = sc.nextInt();

		System.out.print("Entre com o saldo da conta: ");
		saldo = sc.nextDouble();

		System.out.print("Deseja sacar ou depositar: ");
		op = sc.next();

		if (op.equals("sacar")) {
			System.out.print("Quando deseja sacar: ");
			debito = sc.nextDouble();
			if (debito <= saldo) {
				saldo -= debito;
				System.out.println("Saldo da conta " + numeroConta + " positivo, seu novo saldo é " + saldo);
			} else {
				System.out.print("Saldo da conta " + numeroConta + " negativo, você não pode sacar!");
			}
		} else {
			System.out.print("Quando deseja depositar: ");
			credito = sc.nextDouble();
			saldo += credito;
			System.out.println("Saldo da conta " + numeroConta + " positivo, seu novo saldo é " + saldo);
		}

		sc.close();
	}

}
