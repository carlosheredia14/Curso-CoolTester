package Ejercicios;

public class NumeroDiasMes {

	
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
	
	
	public static int getDaysInMonth(int mes, int a�o)
	{
		boolean var = isLeapYear(a�o);
		if(mes >=1 && mes <=12) {
			if(a�o >= 1 && a�o <= 9999) {
				
				switch(mes) {
				case 1: 
					return 31;
					 
				case 2: 
					isLeapYear(a�o);
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
		return a�o;
	}
	


}
