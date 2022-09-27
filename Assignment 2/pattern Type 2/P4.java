import java.util.Scanner;

class P4
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number of rows to print");
		int n=sc.nextInt();
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<i;j++)
			{
				System.out.print(" ");
			}
			for(int j=i;j<n;j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}
}

/*
OUTPUT:


C:\Users\dhuma\Desktop\C-DAC\Pattern Que\Assignment 2\Type 2>java P4
Enter a number of rows to print
5
*****
 ****
  ***
   **
    *
	
*/