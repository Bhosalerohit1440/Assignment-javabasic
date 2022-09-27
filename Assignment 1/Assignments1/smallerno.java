import java.util.Scanner;
class smallerno{
	
	public static void main(String args[]){
		System.out.println("Enter three number");
		Scanner sc = new Scanner(System.in);

		int a= sc.nextInt();
		int b= sc.nextInt();
		int c= sc.nextInt();
		if(a>b)
		{
			if(a>c)
			{
					System.out.println(c+" is smallest ");
			}		
			else
			{		System.out.println(a+" is smallest ");

	
			}
 
			else 
          if(b>c)
			{
					System.out.println(c+" is smallest ");
			}		
			else
			{
			System.out.println(b+" is smallest ");

			}			
	
			}
		}
    }
}