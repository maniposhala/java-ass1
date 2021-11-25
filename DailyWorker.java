package com.mani.worker;

public class DailyWorker extends Worker {
	public DailyWorker() {
		super("mani",500);
		
	}
	public void Pay(int days) {
		int weekPay=getSalaryRate()*days;
		System.out.println("The DailyWorker pay for week is "+getName()+": "+weekPay);
	}

}


