package Ejercicios;

import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner introducir = new Scanner(System.in);
		int x;
		
		System.out.println("Introduzca un numero: ");
		
		x = introducir.nextInt();
		
		if(x>0)
		{
			System.out.println("El numero es positivo");
		}else {
			System.out.println("El numero es negativo");
		}
		 
		int division = x % 2;
		if(division==0) {
			System.out.println("El numero es par ");
		}else {
			System.out.println("El numero es impar");
		}
		
		
	}

}
