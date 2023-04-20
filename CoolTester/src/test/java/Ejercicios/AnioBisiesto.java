package Ejercicios;

public class AnioBisiesto {
	

	public static boolean isLeapYear(int año)
	{
		if(año >0 && año <= 9999) {
			if(año % 4 == 0) // Si el año es divisible entre 4, vaya al paso 2
			{
				if(año % 100 == 0) //si el año es divisible entre 100, vaya al paso 3
				{
					if(año % 400 == 0) {
						return true;
					}else {
						return false;
					}
					
				}else { // de lo contrario vaya al paso 4
					return true;
				}
			}else //de lo contrario, vaya al paso 5 
			{
				return false;
			}
		
		}else {
			return false;
		}
		
		
	}

}
