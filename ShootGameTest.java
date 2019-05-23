package com.tarena.shoot;
import static org.junit.Assert.*;
import java.util.Arrays;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.List;

import org.mockito.*;
public class ShootGameTest {
//	ShootGame game = new ShootGame();
	@Before
	public void setUp() throws Exception {
	}
	@After
	public void tearDown() throws Exception {
	}
	@Test
	public void testEnterAction() {
		ShootGame mock = Mockito.mock(ShootGame.class);
		List list = Mockito.mock(List.class);
		int test = 0;
		for (int i=0;i<10;i++)
		{
			test=mock.flyEnteredIndex;
			mock.enterAction();
			Mockito.when(list.get(mock.flyEnteredIndex)).thenReturn("SX1816097");	
			assertEquals(test,mock.flyEnteredIndex);
		}
	}

	@Test
	public void testShootAction() {
		ShootGame mock = Mockito.mock(ShootGame.class);
		List list = Mockito.mock(List.class);
		int test = 0;
		for (int i=0;i<10;i++)
		{
			test=mock.shootIndex;
			mock.enterAction();
			Mockito.when(list.get(mock.shootIndex)).thenReturn("SX1816097");	
			assertEquals(test,mock.shootIndex);
		}
	}

}