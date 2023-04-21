package oops;

public class VariableTypes {
	
double x=10;
static int z =30;
public static void main(String[] args) {
	

	int y=20;
	System.out.println("value of local is "+y);
	VariableTypes x1=new VariableTypes();
	System.out.println("value of instance var is"+x1.x);
	System.out.println("value of static var is"+z);
}
}
