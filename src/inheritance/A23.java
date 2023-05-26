package inheritance;

public class A23 {
//	final void test1()
	 void test1(){
System.out.println("class A23");
	}

}

class B23 extends A23{
	public void test1() {
		System.out.println("class B23");

	}
}

class C23 extends B23{
	public void test1() {
		System.out.println("class c23");

	}
}
class Main23{
	public static void main(String[] args) {
		A23 a2=new B23();
		a2.test1();//If method is pvt it is not visible
		B23 b2=new B23();
		b2.test1();
//		C23 c2=new C23();
//		c2.test1();
//		
	}
}
//if method is protected,default it is inheritable 
//if method is final it can't be overriden