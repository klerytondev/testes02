package trilhaJava04;

public class Ex05 {

	public static void main(String[] args) {

		
		System.out.println("50 primeiros numeros primos:");

		for (int i = 2; i <= 200; i++) {
			if (numPrimo(i)) {

				System.out.print(i + " ");

			}
		}

	}

	private static boolean numPrimo(int numero) {
		for (int i = 2; i < numero; i++) {
			if (numero % i == 0)
				return false;
		}
		return true;
	}

}
