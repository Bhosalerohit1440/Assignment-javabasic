/*07.	Write a program to swap two numbers without using third variable.*/
import java.util.Scanner;
class Q7
{ 

public static void main(String[] args){  

 
	      Scanner sc = new Scanner(System.in);
	      
	      System.out.println("Enter number 1 : ");
	     int num1 = sc.nextInt();
		  System.out.println("Enter number 2 : ");
	     int num2 = sc.nextInt();
		  System.out.println("numbers before swap: "+num1+" "+num2);
	    num1=num1+num2;
		  num2=num1-num2;
		 num1=num1-num2;

	      System.out.println("numbers before swap: " +num1+" "+num2);
 
}  
}  