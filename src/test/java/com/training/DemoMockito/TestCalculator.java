package com.training.DemoMockito;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnit;
import org.mockito.junit.MockitoRule;

public class TestCalculator {
	
	Calculator calc = null;
	
  @Mock
  CalculatorService service;
  	
	@Rule 
	public MockitoRule rule = MockitoJUnit.rule();
	
	
	//CalculatorService service = Mockito.mock(CalculatorService.class);
	
	// CReating Stub 
	/*CalculatorService service = new CalculatorService() {
		
		public int add(int i, int j) {
			
			return i+j;
		}
	};
	*/
	
	@Before
	public void setUp() {
		calc = new Calculator(service);
	}

	@Test
	public void testPerform() {
		when(service.add(2, 3)).thenReturn(5);
		assertEquals(10,calc.perform(2, 3));
		
		verify(service).add(2,3);
	}
}
