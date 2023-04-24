package oops;

public class Am5 {
	int x = 3;
	int y = 3;

	
	public int method1()
	{
		int z = x+y;
		return z;
	
	}
	private int method2()
	{
	int a = x*y;
	return a;
	}
	
	int method3()
	{
		int b=y/x;
		return b;
		
	}
public static void main(String[] args) {
	Am5 x1=new Am5();
	//	System.out.println(x1.method1());
	//System.out.println(x1.method2());
	
	System.out.println(x1.method3());
}
}

