package com.aop.aspect;

public class ValidarMaterial {
	public void comprobarCantidad(){
		System.out.println("Se comprueba que es la cantidad correcta");
	}
 
	public void empaquetar(){
		System.out.println("Se empaqueta el resultado");
	}
 
	public void ponerReclamacion(){
		System.out.println("Se reclaman los defectos detectados");
	}
}
