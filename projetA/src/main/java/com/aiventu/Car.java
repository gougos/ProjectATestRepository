package com.aiventu;

public class Car {
    private Boolean started ;
	public void turnKey(String direction) {
		
		if (direction.equals("RIGHT")){
			System.out.println(" Hello");
			started = true ;
			
		}
		
	}

	public boolean isStarted() {
		// TODO Auto-generated method stub
		return started;
	}

}
