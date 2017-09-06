package com.aiventu;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class TestDemo {
    Car car;
	@Before
	public void setUp() throws Exception {
		car = new Car();
	}

	@Test
	public void itShouldStartWhenKeyIsTurnedRight() {
		String direction = "right";
		car.isturned(direction);
		boolean car = true ;
	}

}
