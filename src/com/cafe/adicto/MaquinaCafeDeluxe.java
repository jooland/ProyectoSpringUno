package com.cafe.adicto;

public class MaquinaCafeDeluxe implements IMaquinaCafe {
	private ICafe cafe;
	
	public MaquinaCafeDeluxe(ICafe cafe) {
		
		this.cafe = cafe;
	}

	@Override
	public void prepararCafe() {
		// TODO Auto-generated method stub
		cafe.preparar();

	}

}
