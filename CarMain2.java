package project06;

public class CarMain2 {
	public static void main(String[] args) {
		Car car1 =  new Car();
		Car car2 = new Car();
		
		System.out.println("������ ����: " + car1.color);
		System.out.println("������ ����: " + car2.color);
		
		System.out.println("---�������� ��---");
		
		car1.color = "����";
		car2.color = "��ũ";
		System.out.println("������ ����: " +car1.color);
		System.out.println("������ ����: " +car2.color);
	}
}
