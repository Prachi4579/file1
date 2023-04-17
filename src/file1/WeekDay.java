package file1;

import java.util.Scanner;

public class WeekDay {
	public static void main(String[] args) {
		int i;
		Scanner num=new Scanner(System.in);
		System.out.println("input number between 1 -7");
		i=num.nextInt();
		if(i==1)
		{System.out.println("It's Sunday");}
		else if(i==2)
		{System.out.println("It's Monday");}
		else if(i==3)
		{System.out.println("It's Tuesday");}
		else if(i==4)
		{System.out.println("It's Wednesday");}
		else if(i==5)
		{System.out.println("It's Thursday");}
		else if(i==6)
		{System.out.println("It's Friday");}
		else if(i==7)
		{System.out.println("It's Saturday");}
		else
		{System.out.println("Wrong input");}


	}
}
