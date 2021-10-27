package project06;

public class TelevisionTest3 {
	public static void main(String[] args) {
		
		 Television mytv= new Television();
		 mytv.setchannel(11);
		 int ch =mytv.getchannel();
		 System.out.println("현재 채널은 "+ ch + "입니다");
		 
}
}