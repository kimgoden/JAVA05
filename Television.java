package project06;

public class Television {
int channel;
int volume;
boolean onOFF;
//��������1��
public void print() {
 System.out.println(" �ڷ����� ä����" + channel+ ", ������" +volume+", ���� ���´�" + onOFF +"�Դϴ�.");
}
//��������2��
 int getchannel() {
	 return channel;

}
 //��������3��
 
 void setchannel(int ch) {
	 channel =ch;
 }
}