import java.util.Scanner;

class P13
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number of rows to print");
		int n=sc.nextInt();
		for(int i=0;i<n-1;i++)
		{
			for(int j=0;j<i;j++)
			{
				System.out.print(" ");
			}
			for(int j=i;j<n;j++)
			{
				System.out.print("*");
			}
			//if(i<n-1)
			System.out.println();
			
		}
		
		
		for(int i=0;i<n;i++)
		{
			for(int j=i+1;j<n;j++)
			{
				System.out.print(" ");
			}
			for(int j=0;j<=i;j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
/*

OUTPUT:
Enter number of rows to print
5
*****
 ****
  ***
   **
    *
   **
  ***
 ****
*****

*/
