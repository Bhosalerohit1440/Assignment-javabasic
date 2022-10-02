/*03.	Write a program to calculate sum of 5 subject’s marks & find percentage. Take the obtained marks from user using Scanner class.
 Output should be in this format [ percentage marks = 99 % ]. Use concatenation operator here.*/
 import java.util.Scanner;
class Q3{ 
public static void main(String args[]){
			
			Scanner sc = new Scanner(System.in);
			
			System.out.println(" Enter the Marks obtained in 5 Subjects:");
			
			float s1 = sc.nextFloat();
			float s2 = sc.nextFloat();
			float s3 = sc.nextFloat();
			float s4 = sc.nextFloat();
			float s5 = sc.nextFloat();
			
			float percentage = (float)(s1+s2+s3+s4+s5)/5; // percentages of 5 subjects
			
			System.out.println(" Percentages = "+percentage +"%"); 
}  
}  