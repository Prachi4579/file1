package oops;

import java.util.Scanner;

public class Profile
{
	 public static void main(String[] args)
	 {
    

	School n1= new School();
	Scanner input =new Scanner(System.in);
	System.out.println("input the details of student");
	System.out.println("enter name");
	n1.stuname=input.next();
	System.out.println("enter marks");
	n1.marks=input.nextDouble();
	System.out.println("enter rollno");
	n1.rollno=input.nextInt();

	
	School n2= new School();
	System.out.println("input the details of student 2");
	System.out.println("enter name");
	n2.stuname=input.next();
	System.out.println("enter marks");
	n2.marks=input.nextDouble();
	System.out.println("enter rollno");
	n2.rollno=input.nextInt();
	
	n1.Display();
	//n2.Display();
	//n1.name();
	n2.name();
	Dress d2=new Dress();
	n1.d1=d2;
	n1.d1.color="pink";
	System.out.println("Dress color is"+n1.d1.color);
	d2.typedress();
	

	 }

}

