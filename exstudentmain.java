package project06;

public class exstudentmain {
public static void main(String[] args) {
	exstudent student1 =new
			exstudent("������",3,17,92,63,74);
	//student.name = "��浿";
	//student.ban = 3;
	//student.no =17;
	//student.kor =92;
	//student.eng = 63;
	//student.math =74;
	student1.info();
	
	System.out.println("�̸� : " + student1.name);
	System.out.println("�� : " +student1.ban);
	System.out.println("��ȣ : " +student1.no);
	System.out.println("�������� : " +student1.kor);
	System.out.println("�������� : " +student1.eng);
	System.out.println("�������� : " +student1.math);
	System.out.println("���� : " + student1.getTotal());
	System.out.println("��� : " + student1.Average());
	
	


}
}
