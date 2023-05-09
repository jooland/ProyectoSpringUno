package com.cafe.adicto;

public class MaquinaCafeBasico implements  IMaquinaCafe {

	private ICafe cafe;
	
	
	public MaquinaCafeBasico(ICafe cafe) {
		this.cafe = cafe;
	}


	@Override
	public void prepararCafe() {
		// TODO Auto-generated method stub
		cafe.preparar();

	}

}
