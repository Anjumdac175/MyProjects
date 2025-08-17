package com.cdac.acts.account;

public class Account {

	private int accno;
	private String name;
	private double balance;
	
	public Account() {
	}
	
	public Account(int accno, String name, double balance) {
		this.accno = accno;
		this.name = name;
		this.balance = balance;
	}

	@Override
	public String toString() {
		return "Account [accno=" + accno + ", name=" + name + ", balance=" + balance + "]";
	}

	public int searchByAccount(Account []ac, int sacno) {
		boolean found= false;
		int idx = 0;
		for(int i=0; i<3; i++)
		{
			if(ac[i].accno == sacno)
			{
				found = true;
				idx = i;
			}
		}
		
		if(found)
		{
			System.out.println("Name:" + ac[idx].name +" Account : "+ac[idx].accno);
		}
		else
		{
			System.out.println("Account No not found");
		}
		return idx;
	}
	
	public void Withdraw(Account []ac,int daccount, double draw) {
		for(int i=0; i<3; i++)
		{
			if(ac[i].accno == daccount)
			{
				if(ac[i].balance > 500)
				{
					ac[i].balance = ac[i].balance - draw;
				}
				else
				{
					System.out.println("Insufficient balance !!");
				}
			}
		}
		
	}
	
	public void Transfer(Account []ac, int ac1, int ac2, double transfer) { 

		if((ac1 > 0 && ac1 <= ac.length) && (ac2 > 0 && ac2 <= ac.length))
		{
			if(ac[ac1].balance > 0)
			{
				ac[ac1].balance = ac[ac1].balance - transfer;
			}
			ac[ac2].balance = ac[ac2].balance + transfer;
		}
	}
}
