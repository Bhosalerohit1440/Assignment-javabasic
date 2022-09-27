import java.util.Scanner;
class P13{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number of row");
		int n=sc.nextInt();
		for(char i='A';i<('A'+n);i++)
		{
			for(char j=i;j<('A'+n);j++)
			{
				System.out.print(" ");
			}
			for(char j='A';j<=i;j++)
			{
				System.out.print(j+" ");
			}
			System.out.println();
		}
	}
}

/*
OUTPUT:
Enter a number of row
10
          A
         A B
        A B C
       A B C D
      A B C D E
     A B C D E F
    A B C D E F G
   A B C D E F G H
  A B C D E F G H I
 A B C D E F G H I J
*/