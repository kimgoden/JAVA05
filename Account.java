package project06;

public class Account {
	String id, pw;
    int balance;
      
    public Account() {}
    public Account (String id, String pw,int balance){
        this.id = id;
        this.balance = balance;
        this.pw = pw;
    }
      
    public void changePw(String pw){
        this.pw = pw;
          
    }
      
    public int getBalance(){
        return balance;
    }
      //�Ա�
    public int Deposit(int value){
        balance = balance + value;
        return balance;
    }
      //���
    public int Withdraw(int value){
        if(balance>=value){
            balance = balance - value ;
        }else{
            System.out.println("�ܾ��� �����մϴ�");
        }
            return balance;
              
    }




}
