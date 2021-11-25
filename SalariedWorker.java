package com.mani.worker;
public class SalariedWorker extends Worker {
	public SalariedWorker() {
		super("mani",600);
		
	}
	public void Pay() {
		int weekPay=getSalaryRate()*40;
		System.out.println("The salariedworker pay for week is"+getName()+": "+weekPay);
	}
}


