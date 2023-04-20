package Ejercicios;

public class SumOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		boolean var1 = isOdd(1);
		
		System.out.println(var1);
		
		
		int var2 = sumOdd(1,100);
		
		System.out.println(var2); 
	}
	
	public static boolean isOdd(int numero)
	{
		int division = numero % 2;
		if (numero > 0 && division == 0)
		{
				return true; 	
		}else {
			return true;
		}
		
	}
	
	public static int sumOdd(int inicio, int fin)
	{
		int suma=0;

		
		if(inicio <= fin && inicio>0 && fin >0)
		{
			for(int i = inicio; i<= fin; i++)
			{
				if(isOdd(i))
				{
					suma = suma + i;
				}
			}
		}else
		{
			suma=-1;
		}
		return suma;
	}

}
