class P5
{
	public static void main(String arg[])
	{
		for(char i='A';i<='E';i++)
		{
			for(char j='A';j<=i;j++)
			{
				System.out.print((char)(i)+" ");
			}
			System.out.println();
		}
	}

}
/*
A
B B
C C C
D D D D
E E E E E
*/