package week1.day1;


/*Problem statement: Check if the number is positive or negative
---------------------------------------------------------------
Pseudocode:
----------
 1. Initialize a number, say, int number= 35;
 2. If a number is positive, print "The number is positive"
    If a number is negative, print "The number is negative"
    If it nether negative nor positive, print as "The number is neither positive nor negative"
*/
public class Assignment2 {

	public static void main(String[] args) {
		int num=35;
		if(num>0) {
			System.out.println("The number is positive : "+num);
		}else if(num<0) {
			System.out.println("The number is negative : "+num);
		}else {
			System.out.println("The number is neither positive nor negative");
		}

	}

}
