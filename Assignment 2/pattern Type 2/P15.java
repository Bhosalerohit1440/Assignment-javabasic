import java.util.Scanner;

class P15
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number of rows to print");
		int n=sc.nextInt();
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<=i;j++)
			{
				if(j==0) 	System.out.print("*");
				else if(i==n-1)	System.out.print("*");
				else if(i==j)	System.out.print("*");
				else System.out.print(" ");
			}
			System.out.println();
		}
		
		
	}
}

/*


C:\Users\dhuma\Desktop\C-DAC\Pattern Que\Assignment 2\Type 2>java P15
Enter number of rows to print
5
*
**
* *
*  *
*****




C:\Users\dhuma\Desktop\C-DAC\Pattern Que\Assignment 2\Type 2>java P15
Enter number of rows to print
25
*
**
* *
*  *
*   *
*    *
*     *
*      *
*       *
*        *
*         *
*          *
*           *
*            *
*             *
*              *
*               *
*                *
*                 *
*                  *
*                   *
*                    *
*                     *
*                      *
*************************







C:\Users\dhuma\Desktop\C-DAC\Pattern Que\Assignment 2\Type 2>java P15
Enter number of rows to print
25
*
**
* *
*  *
*   *
*    *
*     *
*      *
*       *
*        *
*         *
*          *
*           *
*            *
*             *
*              *
*               *
*                *
*                 *
*                  *
*                   *
*                    *
*                     *
*                      *
*************************


*/