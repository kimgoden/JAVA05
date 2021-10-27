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
                System.out.println(acclist[i].id+"님의 현재 잔액은 "+acclist[i].getBalance()+"원 입니다.");
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
                System.out.println(acclist[i].id+"님의 현재 잔액은 "+acclist[i].Withdraw(withdraw)+"원 입니다.");
                System.out.println("==============================");
                return true;
            }
            else if(acclist[i] !=null && acclist[i].id.equals(id) && !(acclist[i].pw.equals(pw)))
            {
                System.out.println("==============================");
                System.out.println(acclist[i].id+"님 비밀번호가 올바르지 않습니다.");
                System.out.println("==============================");
            }
        }
        return false;
    }
      
    public void showList(){
        for (int i =0; i < acclist.length; i++) {
            if(acclist[i] !=null){
            System.out.println(" 사용자 ID : "+acclist[i].id +"\t\t잔액 : "+acclist[i].getBalance()+"원");
            }
        }
    }
      
      
    public void changePw(String id, String pw){
        for (int i =0; i < acclist.length; i++)
        {
            if(acclist[i] !=null && acclist[i].id.equals(id) && acclist[i].pw.equals(pw))
            {
                System.out.println("변경하실 비밀번호를 입력하세요");
                String newPw = sc.next();
                acclist[i].changePw(newPw);
                  
                System.out.println("==============================");
                System.out.println(acclist[i].id+"님 비밀번호가 "+newPw+" 로 변경되었습니다.");
                System.out.println("==============================");
            }
            else if(acclist[i] !=null && acclist[i].id.equals(id) && !(acclist[i].pw.equals(pw)))
            {
                System.out.println("==============================");
                System.out.println(acclist[i].id+"님 비밀번호가 올바르지 않습니다.");
                System.out.println("==============================");
            }
        }
    }
      
      
      
    public static void main(String[] args){
            Accountmain as =new Accountmain();
              
          
        do {
            System.out.print("0:종료, 1:계좌 생성 , 2:입금 , 3:출금, 4.전체 계좌 list, 5.비번 변경 = ?");
            int choice = sc.nextInt();
            if (choice==0)break;
            if (choice==1)
            {
                System.out.print("사용자 ID = ");
                String id = sc.next();
                System.out.print("사용자 PW = ");
                String pw = sc.next(); 
                System.out.print("사용자 잔액 = ");
                int balance = sc.nextInt();
                as.Account_Create(id, pw, balance);
            }
            if (choice==2)
            {
                System.out.print("사용자 ID = ");
                String id = sc.next();
                System.out.print("입금 금액 = ");
                int deposit = sc.nextInt();
                as.Deposit(id, deposit);
            }
            if (choice==3)
            {
                System.out.print("사용자 ID = ");
                String id = sc.next();
                System.out.print("사용자 PW = ");
                String pw = sc.next();
                System.out.print("출금 금액 = ");
                int withdraw = sc.nextInt();
                as.Withdraw(id, pw, withdraw);
            }
            if (choice==4){
                as.showList();
            }
            if (choice==5){
                System.out.print("사용자 ID = ");
                String id = sc.next();
                System.out.print("사용자 PW = ");
                String pw = sc.next();
                  
                as.changePw(id, pw);
            }
          
              
        }while(true);
}



}
