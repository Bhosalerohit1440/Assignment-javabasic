/* 06.	Write a program to convert temperature from Fahrenheit to Celsius. Take Fahrenheit as input using Scanner class. [ formula : C= 5*(f-32)/9 ]*/
import java.util.Scanner;
class Q6
{ 

public static void main(String[] args){  
 
	 double Fahrenheit;
	      
	      Scanner sc = new Scanner(System.in);
	      
	      System.out.print("Enter a Fahrenheit  Temperature : ");
	      Fahrenheit = sc.nextInt();
	     
	     
	     double  C= 5*(Fahrenheit-32)/9 ;
	      System.out.println("temperature from Fahrenheit to Celsiusis : " +C);
 
}  
}  