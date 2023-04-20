package Ejercicios;

public class Teen {

	

	public static boolean hasTeen(int age, int age2, int age3)
	{
		if (age > 12 && age < 20 || age2 > 12 && age2 < 20 || age3 > 12 && age3 < 20)
		{
            return true;
        }
		return false;
	}
	
    public static boolean isTeen ( int age)
    {
        if (age > 12 && age < 20){
            return true;
        }
        return false;
    }

}
