package mavenproject;

public class FibonacciSeries {
	public static void main(String[] args) {
		int Range=8;
		int Firstnumb=0;
		int secondnumb=1;
		System.out.println(Firstnumb);
		System.out.println(secondnumb);
		for(int i=0; i<Range;i++) {
			int Sum=Firstnumb+secondnumb;
			Firstnumb=secondnumb;
			secondnumb=Sum;
			System.out.println(Sum);
		}
	}

}
