package week1.day1;

public class Factorial {

	public static void main(String[] args) {
		int num = 6, fact = 1;

		while (num > 0) {
			fact = fact * num;
			num--;
		}
		System.out.println("Factorial value is : " + fact);

		// Otherway using for loop
		for (int i = 1; i <= num; i++) {
			fact = fact * i;
		}
		System.out.println("Factorial value from for loop : " + fact);

	}

}
