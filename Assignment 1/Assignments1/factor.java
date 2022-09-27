import java.util.Scanner;
class factor{
	
	public static void main(String args[]){
		System.out.println("Enter any number");
		Scanner sc = new Scanner(System.in);
        int a =sc.nextInt();
		
		for(int i=1;i<=a;i++)
		{
			
			if(a%i==0)
			{
					System.out.print(i+" ");
			}
		}
	}
}
		