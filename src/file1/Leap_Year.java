package file1;

import java.util.Scanner;

public class Leap_Year {
	public static void main(String[] args) {
		String Year = "";
	System.out.println("Leap Year Calculator");
	Scanner Scan=new Scanner(System.in);
	System.out.println("Enter Year to be Checked");
	int x=Scan.nextInt();
	int y = x%4;
Year = y==0?"leap year":"not";
	
}}
