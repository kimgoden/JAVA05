package project06;

import java.util.Scanner;

public class exbookmain2 {
public static void main(String[] args) {
	exbook[] book1 = new exbook[2];
	Scanner sc = new Scanner(System.in);
	
	for(int x =0; x<book1.length; x++) {
		System.out.println("제목>>");
		String bookname = sc.nextLine();
		System.out.println("저자>>");
		String bookw = sc.nextLine();
		
	
	book1[x] = new exbook(bookname, bookw);
	}
		 for(int x=0; x<book1.length; x++)
		 System.out.println("(" + book1[x].bookname + "," + book1[x].bookw + ")");

	
}


}
