package bank;

public class Account {
	long accNumber;
	float balance;
	String accName;
	String accType;
	public Account(long accNumber,float balance,String accName,String accType) {
		this.accNumber=accNumber;
		this.balance =balance;
		this.accName=accName;
		this.accType=accType;
	}
	public void depositMoney(float amount) {
		balance=balance+amount;
		System.out.println("balance after deposit : "+balance);
	}
	
	public void withdrawMoney(float amount) {
		balance=balance-amount;
		float excess =0;
		if (accType=="CA") {
			if(amount>50000) {
				excess=amount-50000;
				excess=excess/10000;
				if (excess>1) {
				}
				else {
				}
			}
		}
				
		
	}

}
