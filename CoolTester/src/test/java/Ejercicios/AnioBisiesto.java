package Ejercicios;

public class AnioBisiesto {
	

	public static boolean isLeapYear(int a�o)
	{
		if(a�o >0 && a�o <= 9999) {
			if(a�o % 4 == 0) // Si el a�o es divisible entre 4, vaya al paso 2
			{
				if(a�o % 100 == 0) //si el a�o es divisible entre 100, vaya al paso 3
				{
					if(a�o % 400 == 0) {
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
