package project06;

public class TelevisonTest2 {
	public static void main(String[] args) {
		
			 Television mytv= new Television();
			 mytv.channel = 7;
			 mytv.volume = 9;
			 mytv.onOFF = true;
			 mytv.print();
			 int ch = mytv.getchannel();
			 System.out.println("���� ä���� " + ch + "�Դϴ�.");
			 Television yourtv= new Television();
			 yourtv.channel = 9;
			 yourtv.volume = 12;
			 yourtv.onOFF = true;
			 yourtv.print();
	}
}
