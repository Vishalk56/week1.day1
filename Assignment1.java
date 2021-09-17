package week1.day1;

/*Problem statement: Convert a negative number to positive number

Pseudocode:
-----------
1. Initialize an integer with a negative number
   like, int number = -40;
2. Check if the number is a negative number 
   Hint : any number that is lesser than zero is a negative number
3. If so, convert the number to a positive number
4. Print as below
        "The number -40 is converted to 40"
 */

public class Assignment1 {

	public static void main(String[] args) {
		int num = -20, n;
		if (num < 0) {
			n = num * -1;
			System.out.println("The number " + num + " is converted to : " + n);
		} else {
			System.out.println("Number is : "+num);
		}

	}

}
