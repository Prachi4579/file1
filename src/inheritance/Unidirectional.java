package inheritance;

public class Unidirectional {//parent
	public void north() {
	//northEast();//Error showing northEast is not defined under Unidirectional

	}

}
class NorthWest extends Unidirectional{//NorthWest is child;it is inheriting method northEast
	void northEast() {
		north();
	}
}