package project06;

public class exbookmain {
 public static void main(String[] args) {
	 exbook book1 = new exbook();
	 book1.bookname = "�����ϱ� û���̴�.";
	 book1.bookw ="��۾�";		 
	 
	 System.out.println("����>>" + book1.bookname);
	 System.out.println("����>>" + book1.bookw);
	 
	 
	 exbook book2 = new exbook();
	 book2.bookname = "���ü��";
	 book2.bookw = "����";
	 
	 System.out.println("����>>" + book2.bookname);
	 System.out.println("����>>" + book2.bookw);
	 
	 System.out.println("("+book1.bookname+","+book1.bookw+")"+"("+book2.bookname+","+book2.bookw+")");
 }
}
