package Ejercicios;

public class Gato {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		boolean var = isCatPlaying(false,36);
		
		System.out.println(var);
	}
	
	public static boolean isCatPlaying(boolean verano, int temp)
	{
		if(temp > 24 && temp < 36)
		{
			return true;
		}
		else {
			return false;
		}
		
	}

}
