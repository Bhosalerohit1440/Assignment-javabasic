import java.util.Scanner;

class P2
{
	public static void main(String []args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Number of rows Want to print");
		int n=sc.nextInt();
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

C:\Users\dhuma\Desktop\C-DAC\Pattern Que\Assignment 2\Type 2>javac P2.java

C:\Users\dhuma\Desktop\C-DAC\Pattern Que\Assignment 2\Type 2>java P2
Enter a Number of rows Want to print
5
    *
   **
  ***
 ****
*****

*/ 