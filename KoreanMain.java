package project06;

public class KoreanMain {
 public static void main(String[] args) {
	 //Korean 생성자 호출
	 Korean k1 = new Korean("김형준", "951102-1194418");
	 System.out.println("k1의 이름: "+ k1.name);
	 System.out.println("k1의 주민번호: "+k1.ssn);
	 
	 Korean k2 = new Korean("김이로운", "940706-2388210");
	 System.out.println("k2의 이름: " +k2.name);
	 System.out.println("k2의 주민번호: "+k2.ssn);
 }
}
