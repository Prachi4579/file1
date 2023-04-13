package file1;

import java.util.Scanner;

public class Reverse_Number {
	public static void main(String[] args) {
		
	Scanner Scan=new Scanner(System.in);
	System.out.println("Enter no to reverse");
	int n=Scan.nextInt();
	int x=0;
	while(n!=0)
		
	{
		int y=n%10;
		
		x=(x*10)+y;
		n=n/10;
//		System.out.println("x = "+x);
//		System.out.println("y = "+y);
//		System.out.println("n = "+n);
	}
	System.out.print(x);
		


}}
