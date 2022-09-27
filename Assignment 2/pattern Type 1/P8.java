class P8
{
	public static void main(String[] args)
	{
		for(int i=5;i>0;i--)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(" ");
			}
			for(int j=i;j<=5;j++)
			{
				System.out.print(j+" ");
			}
			System.out.println();
			
		}
	}
}
/*
     5
    5 4
   5 4 3
  5 4 3 2
 5 4 3 2 1

*/