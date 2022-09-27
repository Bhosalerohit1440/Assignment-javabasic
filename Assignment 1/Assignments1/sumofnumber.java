import java.util.Scanner;
class sumofnumber{
	
	public static void main(String args[]){
		System.out.println("Enter any number");
		Scanner sc = new Scanner(System.in);
        int number =sc.nextInt();
		
		int r;
		int sum=0;
		while(number!=0)
		{
			
			r=number%10;
			sum=sum+r;
			number=number/10;
					
		}
		System.out.println("sum ="+sum);

	}
}
		