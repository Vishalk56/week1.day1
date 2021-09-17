package week1.day1;

public class PrimeNumber {

	/*
	 * Goal: To find whether a number is a Prime number or not
	 * 
	 * input: 13 output: 13 is a Prime Number
	 * 
	 * Shortcuts: 1) Print : type: syso, followed by: ctrl + space + enter 2) To
	 * create a 'for' loop: type 'for', followed by ctrl + space + down arrow +
	 * enter 3) To create an 'if' condition: type 'if', followed by ctrl + space
	 * +down arrow + enter
	 * 
	 * What are my learnings from this code? 1) 2) 3)
	 * 
	 */

	public static void main(String[] args) {

		// Declare an int Input and assign a value 13
		int input = 17;

		// Declare a boolean variable flag as false
		boolean flag = false;

		for (int i = 2; i <= input / 2; i++) {
			int rem = input % i;
			if (rem == 0) {
				System.out.println("Not a Prime number : " + input);
				flag = true;
				break;
			}
		}
		if (flag == false) {
			System.out.println("Prime number : " + input);
		}

		// otherway
		int count = 0;
		for (int i = 1; i <= input; i++) {
			if (input % i == 0) {
				count = count + 1;
			}
		}
		if (count == 2) {
			System.out.println(input + " is prime number ");
		} else {
			System.out.println(input + " is not prime number");
		}
	}
}