package practice;

public class Singleton {
	
	private Singleton() {
		int x=1;
		
	}
	static Singleton s1=new Singleton();
	
	public static Singleton H1() {
		System.out.println("s1");
		return s1;

	}
	
	
	
	public static void main(String[] args) 
	{
		 H1();
	}
	

}
