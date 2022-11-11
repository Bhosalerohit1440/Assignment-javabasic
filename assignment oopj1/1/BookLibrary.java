import java.util.Scanner;

class Book{
	int id;
	String title;
	String[] author;
	int page;
	double price;
	
	Book(int id, String title,String[] author, double price, int page)
	{
		this.title=title;
		this.author=author;
		this.price=price;
		this.page=page;
		this.id=id;
	}
	void det(){
		System.out.println("=========================================");
		System.out.println("Book id is: " +id);
		System.out.println("Book price is: " +price);
		System.out.println("Book page is: " +page);
		System.out.println("Book title is: " +title);
		System.out.println("Book Author are: " );
		for(int i=0;i<author.length;i++)
		{
			System.out.print(author[i]+" ");
		}
		System.out.println();
	}
}
class Library{
	int n;
	int count=0;
	Book[] arr;
	Library(int n){
		this.n=n;
		arr=new Book[n];
	}
	void add(int id, String title,String[] author, double price, int page){
		arr[count]=new Book(id, title, author, price, page);
		count++;
	}
	void print(int id){
		int i;
		for(i=0;i<arr.length;i++){
			if(arr[i].id==id){
			arr[i].det();
			break;
			}
		}
	}
}
public class BookLibrary{
	public static void main(String[] arg)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number of book store capacity of library");
		int n=sc.nextInt();
		Library li=new Library(n);
		
		for(int i=0;i<n;i++)
		{
			System.out.println("Enter detail of "+(i+1)+" book");
			System.out.println("Enter a book id");
			int id=sc.nextInt();
			System.out.println("Enter name book");
			sc.nextLine();
			String name=sc.nextLine();
			
			System.out.println("Enter price of book");
			
			double price=sc.nextDouble();
			System.out.println("Enter  no of pages of book");
			int no=sc.nextInt();
			String[] author={"Rohit","Sandesh","Suraj"};
			li.add(id,name,author,price,no);
		}
		
		
		
		
		//System.out.println("2");
		//l.add(1,2,"Secound Book",author,200.0,400);
		
		li.print(1);
		li.print(2);
		
		//l.print(1);
		
	}
}