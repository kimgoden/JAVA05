package project06;

public class CarMain2 {
	public static void main(String[] args) {
		Car car1 =  new Car();
		Car car2 = new Car();
		
		System.out.println("차량의 색상: " + car1.color);
		System.out.println("차량의 색상: " + car2.color);
		
		System.out.println("---차량도색 후---");
		
		car1.color = "검정";
		car2.color = "핑크";
		System.out.println("차량의 색상: " +car1.color);
		System.out.println("차량의 색상: " +car2.color);
	}
}
