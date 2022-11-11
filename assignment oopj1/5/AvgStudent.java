/*
5. Write a program to implement a class "student" with the following members. Name of the student. Marks of the 
student obtained in three subjects. Function to assign initial values. Function to compute total average. Function to 
display the student’s name and the total marks. Write an appropriate main() function to demonstrate the functioning 
of the above. 
*/
class Student{
	String name;
	Student (String name){ this.name=name;}
	int math;
	int science;
	int marathi;
	void marks(int marathi, int science, int math){
		this.marathi=marathi;
		this.math=math;
		this.science=science;
	}
	double average(){
		return ((marathi+math+science)/3);
	}
	void display(){
		System.out.println("Name of the student is: "+name);
		System.out.println("Total marks student achieve : "+(marathi+math+science));
	}
}
public class AvgStudent{
	public static void main(String[] args){
		Student s1=new Student("Rohit");
		s1.marks(80,75,98);
		Student s2=new Student("sandesh");
		s2.marks(99,95,90);
		s1.display();
		System.out.println("Average Marks are: "+s1.average());
		System.out.println("\n=============================================\n");
		s2.display();
		System.out.println("Average Marks are: "+s2.average());
	}
}



*/
E:\Cdac\a3\assignment oopj\5>java AvgStudent
Name of the student is: Rohit
Total marks student achieve : 253
Average Marks are: 84.0

=============================================

Name of the student is: sandesh
Total marks student achieve : 284
Average Marks are: 94.0
*/