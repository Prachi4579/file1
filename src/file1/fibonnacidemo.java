package file1;

import java.util.Scanner;

public class fibonnacidemo {
	public static void main(String[] args) {
	// Series is 0 1 1 2 3 5 8 13
		
		int i =0;
		int j =1;
//		System.out.println("Series is" );	
		Scanner Scan = new Scanner(System.in);
		System.out.println("Enter Number of Term to be Printed");
		int n =Scan.nextInt();
		System.out.println(i);
		System.out.println(j);
		
		
		

		for(int k=2;k<n;k++) {
			int sum=i+j;
			i=j;
			j=sum;
			System.out.println(sum);
		}
		
		
}

}
