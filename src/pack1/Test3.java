package pack1;

public class Test3 {
	public static void main(String[] args) {
	

		int s=Demo1(10,25);
		System.out.println("value is"+s);

		Test3 D2 = new Test3();
		
		int a = D2.Demo2(5);
		System.out.println("Value is " + a);
		
	}
	
	
	private static int Demo1(int x,int y) {

		int z=x+y;
		return (z);

	}
	
	int Demo2(int w) {

		return(++w);
	}
}
