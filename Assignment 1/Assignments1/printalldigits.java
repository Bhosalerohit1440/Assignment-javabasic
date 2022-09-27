import java.util.Scanner;
class printalldigits{
	
	public static void main(String args[]){
		System.out.println("Enter any number");
		Scanner sc = new Scanner(System.in);
        int a =sc.nextInt();
		
		int r;
		int rev=0;
		while(a!=0)
		{
			
			r=a%10;
			rev=rev*10+r;
			a=a/10;
					System.out.println(r);

		}
	}
}
		