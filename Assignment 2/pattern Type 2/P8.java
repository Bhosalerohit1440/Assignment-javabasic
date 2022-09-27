import java.util.Scanner;

class P8
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Number of rows want to print");
		int n=sc.nextInt();
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<=i;j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		
		
		for(int i=n-1;i>0;i--)
		{
			for(int j=0;j<i;j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		
	}
}
/*

OUTPUT:

C:\Users\dhuma\Desktop\C-DAC\Pattern Que\Assignment 2\Type 2>java P8
Enter a Number of rows want to print
5
*
**
***
****
*****
****
***
**
*

C:\Users\dhuma\Desktop\C-DAC\Pattern Que\Assignment 2\Type 2>
*/