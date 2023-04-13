package file1;

import java.util.Scanner;

public class SumNumber {
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the num");
		int n=scan.nextInt();
		int sum=0;
		while(n!=0)
		{
		int k=n%10;
		n=n/10;
		sum=k+sum;
		}
		
	System.out.println("sum of no is "+ sum);
}

}
