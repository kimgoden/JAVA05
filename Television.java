package project06;

public class Television {
int channel;
int volume;
boolean onOFF;
//다음예제1문
public void print() {
 System.out.println(" 텔레비전 채널은" + channel+ ", 볼륨은" +volume+", 현재 상태는" + onOFF +"입니다.");
}
//다음예제2문
 int getchannel() {
	 return channel;

}
 //다음예제3문
 
 void setchannel(int ch) {
	 channel =ch;
 }
}