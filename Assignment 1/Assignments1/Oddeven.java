import java.util.Scanner;
class Oddeven{
	
	public static void main(String args[]){
		System.out.println("Enter any number");
		Scanner ab = new Scanner(System.in);
		int a = ab.nextInt();
		
		if(a%2==0)
		{
					System.out.println("The given number is Even");

		}
		else 
		{
					System.out.println("The given number is Odd");

		}
	}
}