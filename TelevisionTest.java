package project06;

public class TelevisionTest {
 public static void main(String[] args) {
	 Television mytv= new Television();
	 mytv.channel = 7;
	 mytv.volume = 9;
	 mytv.onOFF = true;
	 System.out.println("���� �ڷ����� ä����" + mytv.channel+ ", ������" +mytv.volume+", ���� ���´�" + mytv.onOFF +"�Դϴ�.");
 
 Television yourtv= new Television();
 yourtv.channel = 9;
 yourtv.volume = 12;
 yourtv.onOFF = true;
 System.out.println("���� �ڷ����� ä����" +yourtv.channel+", ������" +yourtv.volume+", ���� ���´�" +yourtv.onOFF+"�Դϴ�.");
 
}
}
