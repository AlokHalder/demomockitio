package com.training.DemoMockito;

public class Calculator {
   
	CalculatorService service;
	
	public int perform(int i, int j)  //2 3 --> (i+j)*2
       {		
	     return service.add(i,j)*i;
		//return (i+j)*i;		
	}

	public Calculator(CalculatorService service) {	
		this.service = service;
	}
	
	
}
