package project06;

public class exbookmain {
 public static void main(String[] args) {
	 exbook book1 = new exbook();
	 book1.bookname = "아프니까 청춘이다.";
	 book1.bookw ="김글쓴";		 
	 
	 System.out.println("제목>>" + book1.bookname);
	 System.out.println("저자>>" + book1.bookw);
	 
	 
	 exbook book2 = new exbook();
	 book2.bookname = "블록체인";
	 book2.bookw = "김블록";
	 
	 System.out.println("제목>>" + book2.bookname);
	 System.out.println("저자>>" + book2.bookw);
	 
	 System.out.println("("+book1.bookname+","+book1.bookw+")"+"("+book2.bookname+","+book2.bookw+")");
 }
}
