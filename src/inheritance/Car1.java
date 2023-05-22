package inheritance;

public class Car1 {
	public void mileage() 
	{
	}
}

class Hyundai{
	public void hatchBack() {
		Car1 c=new Car1();//Hyundai has a Car1 relationship
		c.mileage();
	}	

}
class Maruti extends Car1{
	void speed() {
		mileage();//Maruti is a car
	}	
}

