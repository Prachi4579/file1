package file1;

import java.util.Scanner;

public class SwapNumber {
public static void main(String[] args) {
Scanner scan=new Scanner(System.in);
System.out.println("Input two numbers to be swapped:  i=");//(swapping without 3rd variable)
int i=scan.nextInt();
System.out.println("j=");
int j=scan.nextInt();
    i=i*j;
    j=i/j;
    i=i/j;
    System.out.println("Swapped numbers are "+'\n'+"i is "+i+'\n'+"j is "+j);
}
}
