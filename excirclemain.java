package project06;

public class excirclemain {
	public static void main(String[] args) {

		excircle[] a = new excircle[5];
		for (int i = 0; i < a.length; i++) {
			a[i] = new excircle(i);

			System.out.println("������" + i);
			System.out.println("���� ����" + a[i].getArea());
		}

	}
}
