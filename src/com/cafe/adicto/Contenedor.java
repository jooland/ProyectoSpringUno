package com.cafe.adicto;

import java.util.Map;
import java.util.HashMap;

public class Contenedor {
	
	static Map<String,Object> components = initmap();
	public static final String ICAFE="cafe";
	public static final String SERVICIO_MAQUINA="maquina";
	
	
	private static Map<String,Object> initmap(){
		Map<String,Object> components = new HashMap<String,Object>();
		
		ICafe cafe = new CafeAmericano();
		components.put(ICAFE, cafe);
		
		IMaquinaCafe basico = new MaquinaCafeBasico(cafe);
		components.put(SERVICIO_MAQUINA, basico);
		
		return components;
	}

	public static Object getComponents(String nombreComponent) {
		
		return components.get(nombreComponent);
	}
	
}	