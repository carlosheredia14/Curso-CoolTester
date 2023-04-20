package Ejercicios;

public class VerificadorSumaNumero {

	public static void main(String[] args) {
		
		boolean resultado = hasEqualSum(2,2,3);
		System.out.println(resultado);
	}
		
		
	public static boolean hasEqualSum(int a, int b, int c)
	{
		
		int suma = a + b;
		boolean var = true;
		if(suma == c)
		{
			var = true;
		}else {
			var = false;
		}
		return var;
		
	}

}
