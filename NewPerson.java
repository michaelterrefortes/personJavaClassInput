//Edward Garcia (Recorder)
//Michael Terrefortes (Spokesperson)
//Luis Lopez (Manager)
//Yared Osorio (Data Analyst


//This is the input for name and age

import java.util.*;
public class NewPerson
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter your name: ");
		String Name = sc.nextLine();
		System.out.print("Enter your age: ");
		int Age = sc.nextInt();
		//System.out.printIn("Total= ");
		Person A = new Person(Name);
		A.setAge(Age);
	}
}