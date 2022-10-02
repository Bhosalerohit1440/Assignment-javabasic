//02.	Write a program that takes radius of a circle as input. Read the entered radius using Scanner class. Then calculate and print the area and circumference of the circle.
//	C = 2 × π × r
import java.util.Scanner;
class Q2{ 

public static void main(String[] args){  

int r;
 System.out.println("enter Radius ");  
 Scanner sc =new Scanner(System.in);
 r=sc.nextInt();
 double a=3.14*r*r;
 double c = 2 * 3.14 * r ;
 
 System.out.println("Area of the circle: "+a); 
 
  System.out.println("circumference of the circle:"+c); 
}  
}  