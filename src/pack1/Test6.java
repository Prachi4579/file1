package pack1;

public class Test6 {
	public static void main(String[] args) {
		int w=Test6.Add1();
		System.out.println(w);
		
		Test6 t6=new Test6();
		int v=t6.Add2();
		System.out.println(v);
		
	}

	public static int Add1()
	{int x=10;
	return(++x);
	
	}
	public int Add2()
	{int y=20;
	return(++y);
	}
	
}
