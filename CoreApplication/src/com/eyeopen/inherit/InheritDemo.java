package com.eyeopen.inherit;

class BankAccount{
	double withdrawAmount;
	double depositAmount;
	double balance;
	double roi=9.5;
	public void depositMoney(double depositAmount) {
		this.depositAmount = depositAmount;
		balance+=depositAmount;
		System.out.println("Success. The Current balance "+balance);
	}
	public void withdrawMoney(double withdrawAmount) {
		this.withdrawAmount = withdrawAmount;
		if(balance>=withdrawAmount) {
			balance-=withdrawAmount;
			System.out.println("Done. The current balance "+balance);
		}else {
			System.out.println("Sorry. Insufficient balance.");
		}
	}
	public void applyFD() {
		System.out.println("In FD A/C the bank offer "+roi+"% for Regular Customer.");
	}
}
class NRIAccount extends BankAccount{
	@Override
	public void applyFD() {
		roi = 6.5d;
		System.out.println("In FD A/C the bank offer "+roi+"% for NRI Customer.");
	}
}
class SrCitizen extends BankAccount{
	@Override
	public void applyFD() {
		roi = 10.5d;
		System.out.println("In FD A/C the bank offer "+roi+"% for Sr.Citizen Customer.");
	}
}

public class InheritDemo {
	public static void main(String[] args) {
		BankAccount regular = new BankAccount();
		regular.depositMoney(65000);
		regular.withdrawMoney(27000);
		//regular.applyFD();
		
		BankAccount nri = new NRIAccount();
		nri.applyFD();
		
		BankAccount src = new SrCitizen();
		src.applyFD();
		
	}
}
