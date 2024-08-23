package week1.HomeAssignment;
import java.util.Scanner;

public class IsPrimeNumber {

	public static void main(String[] args) {
    Scanner myObj = new Scanner(System.in);  // Create a Scanner object
    System.out.println("Enter Number");

    int num = myObj.nextInt();  // Read user input
    System.out.println("Given number: " + num);  // Output user input
		//int num=3;
    int divisorcount=0;
    
    for (int i = 1; i<=num; i++) {
    	if(num%i==0) {
    		divisorcount++;
    	}
			
	}
    if(divisorcount==2)
    {
		System.out.println("Given number is prime");
		
	}
	else	
	{
		System.out.println("Given number is not prime");
		
	}
  }
}