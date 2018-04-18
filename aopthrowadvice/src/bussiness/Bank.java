package bussiness;

public class Bank {
	private int amount =5000;
	private String account = "sbi123";
	public int deposit(String account,int amount)  {
		// TODO Auto-generated constructor stub
		if(account.equals(this.account)){
			System.out.println("in deposte method.");
			this.amount=this.amount+amount;
			
		}
		else{
			throw new AccountNotFound();
		}
		return this.amount;
	}
	

}
