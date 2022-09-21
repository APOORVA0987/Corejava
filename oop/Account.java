package com.rays.oop;

public class Account {
	
	private String number ;
		
    private  String accounttype; 
	
	private  double balance ;
	

	

	
	
public Account( String number ,String a,double b ) {
	this. number= number;
	 accounttype=a;
	 balance =b;
	 
	}
	    
	public Account() {
	// TODO Auto-generated constructor stub
}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public String getAccounttype() {
		return accounttype;
	}

	public void setAccounttype(String accounttype) {
		this.accounttype = accounttype;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

        public void paybill(double pb) {
 
 	   setBalance(getBalance()-pb);
        }
        public void withdrawal(double W) {
        setBalance(getBalance()-W);	
        }
        public void deposit(double d) {
        	setBalance(getBalance() + d); 
        } 

		
        
        }
	
	
