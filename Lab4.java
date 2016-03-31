import java.util.*;

public class Lab4 {

	public static void main(String[] args) {
		
	 
		long i;
		long input = 0;
		long fact = 1;
		Scanner sc = new Scanner (System.in);
		
		
		System.out.println("Welcome to Factorial Calculator!" );
		
		System.out.println("Enter a number:");
		 input = sc.nextInt();
		
			for (i = 1; i <= input; i++){
				fact = fact*i;
		
			}
		 
			System.out.println("Factorial of " + input +" "+ "is" + " " +fact);
		
		
		
		

		
	}
}


