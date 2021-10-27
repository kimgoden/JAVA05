package project06;

public class exstudentmain {
public static void main(String[] args) {
	exstudent student1 =new
			exstudent("김형준",3,17,92,63,74);
	//student.name = "고길동";
	//student.ban = 3;
	//student.no =17;
	//student.kor =92;
	//student.eng = 63;
	//student.math =74;
	student1.info();
	
	System.out.println("이름 : " + student1.name);
	System.out.println("반 : " +student1.ban);
	System.out.println("번호 : " +student1.no);
	System.out.println("국어점수 : " +student1.kor);
	System.out.println("영어점수 : " +student1.eng);
	System.out.println("수학점수 : " +student1.math);
	System.out.println("총점 : " + student1.getTotal());
	System.out.println("평균 : " + student1.Average());
	
	


}
}
