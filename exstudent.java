package project06;

public class exstudent {

 String name;
 int ban;
 int no;
 int kor;
 int eng;
 int math;
 
 public int getTotal () {
	 return kor+eng+math;
 }
 public float Average () {
	 return Math.round(getTotal()/3f*100)/100f; 
	 
 }
	 public exstudent(String name, int ban, int no, int kor, int eng, int math) {

			this.name = name;
			this.ban = ban;
			this.no = no;
			this.kor = kor;
			this.eng = eng;
			this.math = math;
		}
	 
		public String info() {
			return ban + "," + no + "," + kor + "," + eng + "," + math+ "," + getTotal() + "," + Average();

		}	 


 }
 

