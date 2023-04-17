package file1;

import java.util.Scanner;

public class largest_of_3 {
public static void main(String[] args) {
	//take value from scanner
	Scanner Scan=new Scanner(System.in);
	System.out.println("Enter no1 to compare");
	int x=Scan.nextInt();
	System.out.println("Enter no2 to compare");
	int y=Scan.nextInt();
	System.out.println("Enter no3 to compare");
	int z=Scan.nextInt();
	if((x>y) && (x>z))
	{System.out.println("greatest no is"+x);}
	else if(y>z)
	{System.out.println("greatest no is"+y);}
	else
	{System.out.println("greatest no is"+z);}
}}

		