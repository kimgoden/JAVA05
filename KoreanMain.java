package project06;

public class KoreanMain {
 public static void main(String[] args) {
	 //Korean ������ ȣ��
	 Korean k1 = new Korean("������", "951102-1194418");
	 System.out.println("k1�� �̸�: "+ k1.name);
	 System.out.println("k1�� �ֹι�ȣ: "+k1.ssn);
	 
	 Korean k2 = new Korean("���̷ο�", "940706-2388210");
	 System.out.println("k2�� �̸�: " +k2.name);
	 System.out.println("k2�� �ֹι�ȣ: "+k2.ssn);
 }
}
