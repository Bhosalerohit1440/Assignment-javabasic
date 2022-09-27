import java.util.Scanner;

class P10
{
	public static void main(String []args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number of rows want to print");
		int n=sc.nextInt();
		for(int i=0;i<n;i++)
		{
			for(int j=i;j<n-1;j++)
			{
				System.out.print(" ");
			}
			System.out.println("*****");
		}
	}
}

/*

OUTPUT:

Enter a number of rows want to print
5
    *****
   *****
  *****
 *****
*****

*/