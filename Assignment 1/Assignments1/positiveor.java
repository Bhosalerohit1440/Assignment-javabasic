import java.util.Scanner;
class positiveor{
	
	public static void main(String args[]){
		System.out.println("Enter any number");
		Scanner sc = new Scanner(System.in);
     int a =sc.nextInt();

		if(a>0)
		{
				System.out.println("Positive");
	
		}
		else 
			if(a==0)
		{
				System.out.println("Zero");
	
		}
			else
		{
						System.out.println("Negative");
	
		}
	}
}