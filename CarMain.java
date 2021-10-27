package project06;

public class CarMain {
 public static void main(String[] args) {
	 Car Car= new Car();
	 System.out.println("차량속도: " + Car.speed);
	 System.out.println("차량색상: " + Car.color);
	 for(int i=0; i<5; i++){
	 Car.forword();
 }
 System.out.println("차량속도 : " + Car.speed); 

}
}
