package com.google;

import java.util.Collections;

public class cd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	/*	String[] array = {"1","3","4","6","6","3","1","8","9","3"};
			
	// Imprimir solo los valores sin repetir
		// 1,3,4,6,8,9
		for(int i = 0;  i < array.length ; i++)
		{
			for (int j =0; j < array.length ; j++) {
				if(i != j)
				{
					if(array[i].equals(array[j])) {
						array[i]="";
					}
				}
			}
		}
		
		for(String next : array)
		{
			System.out.println(next);
		}

	}*/
	
	
	//encontrar el numero mayor del arreglo
	int [] arrayNumeros = {1,2,3,78,3,56};
	int mayor=arrayNumeros[0];
	for (int i=0; i < arrayNumeros.length; i++) {
		if(arrayNumeros[i]>mayor) {
			mayor = arrayNumeros[i];
		}
	}
	System.out.println(mayor);
	
	
	//ordenar alfabeticamente los strings
	String[] frutas = {"apple", "oranges", "bananas", "Strawberry", "Blueberry"};
 
	String temp;
    for (int i = 0; i < frutas.length; i++) 
    {
        for (int j = i + 1; j < frutas.length; j++) { 
            if (frutas[i].compareTo(frutas[j])>0) 
            {
                temp = frutas[i];
                frutas[i] = frutas[j];
                frutas[j] = temp;
            }
        }
    }
    
    //Displaying the strings after sorting them based on alphabetical order
    System.out.print("Strings in Sorted Order:");
    for (int i = 0; i < frutas.length; i++) 
    {
        System.out.print(frutas[i] + ", ");
    }
    
    
    
    //swap two numer without using thir variable
    int a = 33;
    int b= 13;
    b=b+a; //46
    a=b-a; //13
    b=b-a;
    System.out.println("el valor de a es:"+a +"/n el valor de b es: "+ b);
	
    
    //reverse string 
    String str= "Geeks", nstr="";
    char ch;
   
  System.out.print("Original word: ");
  System.out.println("Geeks"); //Example word
   
  for (int i=0; i<str.length(); i++)
  {
    ch= str.charAt(i); //extracts each character
    nstr= ch+nstr; //adds each character in front of the existing string
  }
  System.out.println("Reversed word: "+ nstr);
    
/*
	
	public static double suma(int z) {
		double x=0; double y = 0;
		double sum ;
		sum = x + y;
		return sum; 
	}*/

}
}

