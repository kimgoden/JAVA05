package project06;

import java.util.Scanner;

public class Accountmain {
	static Account [] acclist =new Account[100];
    static Scanner sc =new Scanner(System.in);
      
      
    public boolean Account_Create(String id, String pw,int balance){
        for (int i =0; i < acclist.length; i++) {
            if(acclist[i] ==null){
                acclist[i] =new Account(id, pw, balance);
                return true;
            }
        }
        return false;
    }
      
    public boolean Deposit(String id,int deposit){
        for (int i =0; i < acclist.length; i++)
        {
            if(acclist[i] !=null && acclist[i].id.equals(id))
            {
                acclist[i].Deposit(deposit);
                System.out.println("==============================");
                System.out.println(acclist[i].id+"���� ���� �ܾ��� "+acclist[i].getBalance()+"�� �Դϴ�.");
                System.out.println("==============================");
                return true;
            }
        }
        return false;
    }
      
    public boolean Withdraw(String id, String pw,int withdraw){
        for (int i =0; i < acclist.length; i++)
        {
            if(acclist[i] !=null && acclist[i].id.equals(id) && acclist[i].pw.equals(pw))
            {
                System.out.println("==============================");
                System.out.println(acclist[i].id+"���� ���� �ܾ��� "+acclist[i].Withdraw(withdraw)+"�� �Դϴ�.");
                System.out.println("==============================");
                return true;
            }
            else if(acclist[i] !=null && acclist[i].id.equals(id) && !(acclist[i].pw.equals(pw)))
            {
                System.out.println("==============================");
                System.out.println(acclist[i].id+"�� ��й�ȣ�� �ùٸ��� �ʽ��ϴ�.");
                System.out.println("==============================");
            }
        }
        return false;
    }
      
    public void showList(){
        for (int i =0; i < acclist.length; i++) {
            if(acclist[i] !=null){
            System.out.println(" ����� ID : "+acclist[i].id +"\t\t�ܾ� : "+acclist[i].getBalance()+"��");
            }
        }
    }
      
      
    public void changePw(String id, String pw){
        for (int i =0; i < acclist.length; i++)
        {
            if(acclist[i] !=null && acclist[i].id.equals(id) && acclist[i].pw.equals(pw))
            {
                System.out.println("�����Ͻ� ��й�ȣ�� �Է��ϼ���");
                String newPw = sc.next();
                acclist[i].changePw(newPw);
                  
                System.out.println("==============================");
                System.out.println(acclist[i].id+"�� ��й�ȣ�� "+newPw+" �� ����Ǿ����ϴ�.");
                System.out.println("==============================");
            }
            else if(acclist[i] !=null && acclist[i].id.equals(id) && !(acclist[i].pw.equals(pw)))
            {
                System.out.println("==============================");
                System.out.println(acclist[i].id+"�� ��й�ȣ�� �ùٸ��� �ʽ��ϴ�.");
                System.out.println("==============================");
            }
        }
    }
      
      
      
    public static void main(String[] args){
            Accountmain as =new Accountmain();
              
          
        do {
            System.out.print("0:����, 1:���� ���� , 2:�Ա� , 3:���, 4.��ü ���� list, 5.��� ���� = ?");
            int choice = sc.nextInt();
            if (choice==0)break;
            if (choice==1)
            {
                System.out.print("����� ID = ");
                String id = sc.next();
                System.out.print("����� PW = ");
                String pw = sc.next(); 
                System.out.print("����� �ܾ� = ");
                int balance = sc.nextInt();
                as.Account_Create(id, pw, balance);
            }
            if (choice==2)
            {
                System.out.print("����� ID = ");
                String id = sc.next();
                System.out.print("�Ա� �ݾ� = ");
                int deposit = sc.nextInt();
                as.Deposit(id, deposit);
            }
            if (choice==3)
            {
                System.out.print("����� ID = ");
                String id = sc.next();
                System.out.print("����� PW = ");
                String pw = sc.next();
                System.out.print("��� �ݾ� = ");
                int withdraw = sc.nextInt();
                as.Withdraw(id, pw, withdraw);
            }
            if (choice==4){
                as.showList();
            }
            if (choice==5){
                System.out.print("����� ID = ");
                String id = sc.next();
                System.out.print("����� PW = ");
                String pw = sc.next();
                  
                as.changePw(id, pw);
            }
          
              
        }while(true);
}



}
