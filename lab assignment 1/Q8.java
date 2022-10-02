/*08.	In a company an employee is paid as under: If his basic salary is less than Rs. 10000, then HRA = 10% of basic salary and DA = 90% of basic salary. If his salary is either equal to or above Rs. 10000, then HRA = Rs. 2000 and DA = 98% of basic salary. If the employee's salary is input by the user write a program to find his gross salary. [ formula : GS= Basic + DA + HRA ]*/
import java.util.Scanner;
class Q8{ 

public static void main(String[] args){  
double basic,DA,HRA;
 System.out.println("enter basic salary ");  
 Scanner sc =new Scanner(System.in);
  basic=sc.nextDouble();
 if(basic<10000){
	 
	 double GS=basic+((90/100)*basic)+((10/100)*basic) ;
	 System.out.println("GS is :"+GS); 
	 
 }
 else if(basic>=10000){
	  
 
	 double GS=basic+((90/100)*basic)+2000 ;
	 System.out.println("GS is : "+GS); 
	 
 }
}  
}  
