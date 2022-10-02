/*05.	Write a program to read the days (eg. 670 days) as integer value using Scanner class. Now convert the entered days into complete years, months and days and print them.*/
import java.util.Scanner;
class Q5{ 

public static void main(String[] args){  

int days,month,year,rem;
 System.out.println("enter days ");  
 Scanner sc =new Scanner(System.in);
 days=sc.nextInt();
 
 year=days/365;
 int rem1=days%365;
 month =rem1/30;
 int rem2=rem1%30;
 days=rem2;
 
 
System.out.println("year: "+year); 
 System.out.println("month: "+month); 
System.out.println("days: "+days);  
}  
}  
