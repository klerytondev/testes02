package trilhaJava04;

public class Ex04 {

	public static void main(String[] args) {

		final double milhas = 1.609;
		double milhasT = 1.609;

		System.out.println("Milhas            Quilometros");
		System.out.println("------------------------------");

		for (int i = 1; i <= 10; i++) {
			System.out.println(i  + "                   " + milhasT);
			milhasT += milhas;
		}

	}

}
