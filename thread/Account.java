package in.com.rays.thread;

   public class Account {
	   
	   private  int balance = 0;

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}
	   
	 public synchronized void deposit(String msg,int amt) {  
		int bal = getBalance();
		bal = bal+amt;
		setBalance(bal);
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(msg+" balance"+bal);   
	   }

}
