package inheritance;

public class Animal1 {
	String color;
	public void eat() {System.out.println("animal eating");

	}

}
class Dog extends Animal1{
	String breed;
	public void bark() {
		System.out.println("bark");

	}
	public void eat() {
		super.eat();// to print parent class eat method
		System.out.println("dog eating");}//method overriding
}
class Cat extends Animal1{
	int age;
	public void meow() {
		System.out.println("meow");	
	}

}
class RunTime{
	public static void main(String[] args) {
		Dog d1=new Dog();
		d1.breed="Pug";
		d1.bark();
		d1.eat();
		d1.color="black";
	}

}
