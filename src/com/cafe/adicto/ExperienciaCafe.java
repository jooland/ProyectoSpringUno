package com.cafe.adicto;

public class ExperienciaCafe {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		IMaquinaCafe basico = (IMaquinaCafe) Contenedor.getComponents(Contenedor.SERVICIO_MAQUINA);
		basico.prepararCafe();
	  
	}

}
