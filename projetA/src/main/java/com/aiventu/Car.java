package com.aiventu;

public class Car {
	
	boolean status = false ;

	public void turnKey(String direction) {
		 if ( direction == "RIGHT"){
			 
			 status = true ;
		 }
		
	}

	public boolean isStarted() {
		// TODO Auto-generated method stub
		return status;
	}

	public void isturned(String direction) {
		// TODO Auto-generated method stub
		
	}

}
