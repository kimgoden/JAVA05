package project06;

public class CarMain {
 public static void main(String[] args) {
	 Car Car= new Car();
	 System.out.println("�����ӵ�: " + Car.speed);
	 System.out.println("��������: " + Car.color);
	 for(int i=0; i<5; i++){
	 Car.forword();
 }
 System.out.println("�����ӵ� : " + Car.speed); 

}
}
