package com.example;

public class Airtal implements Sim {
	
	private String signal;
	
	public String getSignal() {
		return signal;
	}

	public void setSignal(String signal) {
		this.signal = signal;
	}

	@Override
	public void typeOfSim() {
		// TODO Auto-generated method stub
		System.out.println("This is Airtal Sim");
	}

	@Override
	public void networkType() {
		// TODO Auto-generated method stub
		System.out.println("it supports 5G network");
	}

}
