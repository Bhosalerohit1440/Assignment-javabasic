import java.util.Scanner;

class P14
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number of rows want to print");
		int n=sc.nextInt();
		for(int i=n;i>0;i--)
		{
			for(int j=i;j<n;j++)
			{
				System.out.print(" ");
			}
			for(int j=i;j>0;j--)
			{
				System.out.print("* ");
			}
			if(i>1)
			System.out.println();
		}
		
		
		
		
		for(int i=0;i<n;i++)
		{
			for(int j=n-1;j>i;j--)
			{
				System.out.print(" ");
			}
			for(int j=0;j<=i;j++)
			{
				System.out.print("* ");
			}
			if(i<n-1)
			System.out.println();
		}
	}
}

/*
OUTPUT:


C:\Users\dhuma\Desktop\C-DAC\Pattern Que\Assignment 2\Type 2>java P14
Enter a number of rows want to print
5
* * * * *
 * * * *
  * * *
   * *
    *     *
   * *
  * * *
 * * * *
* * * * *
C:\Users\dhuma\Desktop\C-DAC\Pattern Que\Assignment 2\Type 2>

*/