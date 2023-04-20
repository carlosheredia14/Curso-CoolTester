package Ejercicios;

public class ImprimirVerificadorNumeros {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		imprimirVerificadorNumeros(1,-2,0);
	}
	public static void imprimirVerificadorNumeros(int a, int b, int c)
	{
		if(a<0 || b<0 || c<0) {
			System.out.println("Valor no valido");
		}
		else if(a != b && b!=c && a !=c)
		{
			System.out.println("Todos los numeros son diferentes");
		}else if(a ==b && b==c)
		{
			System.out.println("Todos los numeros son iguales");
		}else {
			System.out.println("Ni todos son iguales ni diferentes");
		}
	}

}
