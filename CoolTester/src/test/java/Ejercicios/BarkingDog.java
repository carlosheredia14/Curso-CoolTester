package Ejercicios;

public class BarkingDog {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		boolean var = shouldWakeUp(false, 2);
		System.out.println(var);
	}
	public static boolean shouldWakeUp(boolean ladrando, int hourOfDay){
		boolean wakeUp = false;
		ladrando = false;
		if  ( hourOfDay >= 0 && hourOfDay <= 7){  
			 if (ladrando = true){
				wakeUp = true;
			} else if (!ladrando){
				wakeUp = false;
			}
		}
		else if (hourOfDay >= 22 && hourOfDay <= 23){
			if (ladrando){
				wakeUp = true;
			}
		}
		else  if  (hourOfDay >=  8  && hourOfDay <= 21) { 
			if (ladrando){ wakeUp = false;
		}}
		else if (!ladrando){  
			wakeUp = false;
		}

		return wakeUp;}

}


