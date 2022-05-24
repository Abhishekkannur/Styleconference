package basics;
//Phone pe project
public class Phonepe {
	int upi_id;
	int password;
	String username;
	String bankacc;
	int mobilenumber;
	float balance;
	static String server="Internet";
	
	
	
	public Phonepe(int upi_id,int password,String username,String bankacc,int mobilenumber,float balance) {
		this.upi_id=upi_id;
		this.password=password;
		this.username=username;
		this.bankacc=bankacc;
		this.mobilenumber=mobilenumber;
		this.balance=balance;
				
	}
	public void userDetails() {
		System.out.println("your upi_id:"+upi_id);
		System.out.println("your password:"+password);
		System.out.println("your username:"+username);
		System.out.println("your bankacc:"+bankacc);
		System.out.println("your mobilenumber:"+mobilenumber);
		System.out.println("your balance:"+balance);
		
	}

}
