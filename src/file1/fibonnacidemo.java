package file1;

public class fibonnacidemo {
	public static void main(String[] args) {
	// Series is 0 1 1 2 3 5 8 13
		
		int i =0;
		int j =1;
		System.out.println("Series is" );
		System.out.println(i);
		System.out.println(j);

		for(int k=1;k<10;k++) {
			int sum=i+j;
			i=j;
			j=sum;
			System.out.println(sum);
		}
		
		
}

}
