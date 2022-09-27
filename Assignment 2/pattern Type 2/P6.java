import java.util.Scanner;

class P6
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a no. of tpws you want");
		int n=sc.nextInt();
		for(int i=n;i>0;i--)
		{
			for(int j=i;j<n;j++)
			{
				System.out.print(" ");
			}
			for(int j=1;j<i*2;j++)
			{
				System.out.print("*");
			}
			if(i>1)
			System.out.println();
		}
	}
}
/*
OUTPUT:

C:\Users\dhuma\Desktop\C-DAC\Pattern Que\Assignment 2\Type 2>java P6
Enter a no. of tpws you want
25
*************************************************
 ***********************************************
  *********************************************
   *******************************************
    *****************************************
     ***************************************
      *************************************
       ***********************************
        *********************************
         *******************************
          *****************************
           ***************************
            *************************
             ***********************
              *********************
               *******************
                *****************
                 ***************
                  *************
                   ***********
                    *********
                     *******
                      *****
                       ***
                        *
C:\Users\dhuma\Desktop\C-DAC\Pattern Que\Assignment 2\Type 2>

*/