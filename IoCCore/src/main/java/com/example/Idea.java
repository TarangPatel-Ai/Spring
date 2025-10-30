package com.example;

public class Idea implements Sim {

	private String signal;
	
	public Idea(String signal) {
		this.signal = signal;
	}
	
	public String getSignal() {
		return signal;
	}

	@Override
	public void typeOfSim() {
		
		System.out.println("This is Idea sim");
	}

	@Override
	public void networkType() {
		// TODO Auto-generated method stub
		System.out.println("it support 4G network..");
	}

}
