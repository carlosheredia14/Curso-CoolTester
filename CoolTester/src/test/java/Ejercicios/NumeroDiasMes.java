package Ejercicios;

public class NumeroDiasMes {

	
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
	
	
	public static int getDaysInMonth(int mes, int año)
	{
		boolean var = isLeapYear(año);
		if(mes >=1 && mes <=12) {
			if(año >= 1 && año <= 9999) {
				
				switch(mes) {
				case 1: 
					return 31;
					 
				case 2: 
					isLeapYear(año);
				if ( var == true)
				{
					return 29;
				}else {
					return 28;
				}
				case 3: 
					return 31;
				case 4: 
					return 30;
				case 5: 
					return 31;
				case 6: 
					return 30;
				case 7: 
					return 31;
				case 8: 
					return 31;
				case 9: 
					return 30;
				case 10: 
					return 31;
				case 11: 
					return 30;
				case 12: 
					return 31;
				}
				
			}else {
				return -1;
			}
		}else 
		{
			return -1;
		}
		return año;
	}
	


}
