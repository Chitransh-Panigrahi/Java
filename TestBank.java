package csw;

import java.util.Scanner;

public class TestBank {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bank b=new Bank();
		Scanner sc= new Scanner(System.in);
		System.out.println("Balance :");
		double bl = sc.nextDouble();
		
	
		System.out.println("Deposit :");
		double dp = sc.nextDouble();
		
		
		System.out.println("Withdraw :");
		double wt = sc.nextDouble();
		
		b.Balance=bl;
		b.withdraw=wt;
		b.deposit=dp;
		
		System.out.println("Balance: "+b.getbalance ());
		
	}

}
