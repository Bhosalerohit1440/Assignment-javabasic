/*04.	Write a program to find the simple interest. Take the principle amount, rate of interest and time from user using Scanner */
import java.util.Scanner;
class Q4 
{ 

public static void main(String[] args){  
 
	 double principle, rate, time, Simple_interest;
	      
	      Scanner sc = new Scanner(System.in);
	      
	      System.out.print("Enter a Principle number : ");
	      principle = sc.nextInt();
	      System.out.print("Enter Interest rate : ");
	      rate = sc.nextInt();
	      System.out.print("Enter a Time period in years : ");
	      time = sc.nextInt();
	      Simple_interest = (principle *  rate * time)/ 100;
	      System.out.println("The Simple Interest is : " + Simple_interest);
 
}  
}  