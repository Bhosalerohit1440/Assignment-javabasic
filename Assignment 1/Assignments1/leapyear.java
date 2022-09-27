import java.util.Scanner;
class leapyear{
	
	public static void main(String args[]){
		System.out.println("Enter any number");
		Scanner sc = new Scanner(System.in);
     int a =sc.nextInt();
	 if(a%4==0 && a%100!=0 || a%400==0)
		 {
				System.out.println("Leap year");
	
		}
			else
		{
						System.out.println("Non Leap year");
	
		}
	}
}