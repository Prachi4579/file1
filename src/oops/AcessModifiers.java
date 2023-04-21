package oops;

public class AcessModifiers {
	public static void main(String[] args)
	{int g=multiply(11,12);
		System.out.println(g);
		
		AcessModifiers m1=new AcessModifiers();
		int h=m1.multiply1();
		System.out.println(h);
		int j=m1.multiply2(5);
		System.out.println(j);

	}
	public static int multiply(int x,int y)
	{int z=x*y;
	return(z);

	}
	private int multiply1()
	{int v=10;
	int w=20;
	return(v*w);
	}

	int multiply2(int s) {

		return(++s);
	}



}