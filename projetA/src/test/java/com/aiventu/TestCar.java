package com.aiventu;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class TestCar {
    Car car ; 
	@Before
	public void setUp() throws Exception {
		car = new Car();
	}

	@Test
	public void itShouldStartWhenKeyIsTurnedRight() {
		String direction ="RIGHT";
		
		car.turnKey(direction);
		
		boolean state = car.isStarted ();
		assertTrue(state);
	}

}
