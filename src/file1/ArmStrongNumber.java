package file1;

import java.util.Scanner;


public class ArmStrongNumber {
	
public static void main(String[] args) {
Scanner scan=new Scanner(System.in);
System.out.println("Input your number ");
long n=scan.nextLong();
long sum=0;

long m=n;
while(n!=0)
{long i=n%10;    
sum=sum+(i*i*i);
n=n/10;
System.out.println("Sum " + sum + " i " + i + " n " + n );
}
if(sum==m)
{System.out.println("It is an Armstrong no");
}
else
{System.out.println("Not an armstrong no");
}
}

	

}
