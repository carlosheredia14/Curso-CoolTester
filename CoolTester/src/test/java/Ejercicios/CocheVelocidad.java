package Ejercicios;

import org.apache.poi.util.SystemOutLogger;

public class CocheVelocidad {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int miVelocidad=100;
		int limiteCarretera = 100;
		int limiteZonaEscolar = 30;
		int limiteCalle = 20;
		
		if(miVelocidad > limiteCarretera)
		{
			System.out.println("Vas a exceso de velocidad en carretera!");
		}
		if(miVelocidad > limiteZonaEscolar)
		{
			System.out.println("Vas a exceso de velocidad en Zona Escolar!");
		}
		if(miVelocidad > limiteCalle)
		{
			System.out.println("Vas a exceso de velocidad en calle!");
		}
		
	}

}
