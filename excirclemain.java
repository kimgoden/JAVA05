package project06;

public class excirclemain {
	public static void main(String[] args) {

		excircle[] a = new excircle[5];
		for (int i = 0; i < a.length; i++) {
			a[i] = new excircle(i);

			System.out.println("반지름" + i);
			System.out.println("원의 넓이" + a[i].getArea());
		}

	}
}
