package project06;

public class ex01maincard {
//ÇÊµå
	int num =1;
	boolean chk = true;
	String st;
	
	ex01maincard(int num, boolean chk) {
		this.num = num;
		this.chk = chk;
	}
	ex01maincard() {
	
	}


	public String info() {
		if(chk) {
			st = "" + num + "k"; 
			return st;
			}
		    else {
			st= "" + num;
			return st;
		}
	}
}
	


