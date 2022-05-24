package bank;

public class Savings extends Account {
	public Savings(long accNumber,float balance,String accName,String accType) {
		super(accNumber,balance,accName,accType);
	}
	public void calcualteIntrest() {
		float intrest = balance*(1*(7*1));
		balance = balance+intrest;
		System.out.println("balance after intrest calcualtion : "+balance);
	}
	public void getBalance() {
		// TODO Auto-generated method stub
		
	}

}
