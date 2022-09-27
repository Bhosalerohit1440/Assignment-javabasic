import java.util.Scanner;
class Factorial{
	
	public static void main(String args[]){
		System.out.println("Enter any number");
		Scanner ab = new Scanner(System.in);
		int no= ab.nextInt();
		int fact=1;
		for( int i=1;i<=no;i++)
		{
			fact=fact*i;

		}
		System.out.println("The Factorial is  "+fact);
		
	}
}