package Ejercicios;

public class AreaCalculator {

	
	public static double area(double radio)
	{
		double area=0;
		if(radio < 0)
		{
			return -1;
		}else {
			area = (3.1416) * (radio)*(radio);
		}
		
		return area;
	}
	
	public static double areaRectangulo(double x, double y)
	{
		double area=0;
		if(x < 0 || y < 0)
		{
			return -1;
		}else
		{
			area = x * y;
		}
		
		return area;
	}

}
