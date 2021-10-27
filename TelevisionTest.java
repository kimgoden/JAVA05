package project06;

public class TelevisionTest {
 public static void main(String[] args) {
	 Television mytv= new Television();
	 mytv.channel = 7;
	 mytv.volume = 9;
	 mytv.onOFF = true;
	 System.out.println("나의 텔레비전 채널은" + mytv.channel+ ", 볼륨은" +mytv.volume+", 현재 상태는" + mytv.onOFF +"입니다.");
 
 Television yourtv= new Television();
 yourtv.channel = 9;
 yourtv.volume = 12;
 yourtv.onOFF = true;
 System.out.println("너의 텔레비전 채널은" +yourtv.channel+", 볼륨은" +yourtv.volume+", 현제 상태는" +yourtv.onOFF+"입니다.");
 
}
}
