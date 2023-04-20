package Ejercicios;

public class Pintor {

	
	public static int getBucketCount(double width, double height, 
			double areaPerBucket, int extraBuckets)
	{
		double area= width*height; 
	    double totalBuckets = (area / areaPerBucket) - extraBuckets ;
		if (width<= 0 || height <=0 || areaPerBucket<=0 || extraBuckets < 0)
		{
			return -1; 
		}else
		{
			return (int) Math.ceil(totalBuckets);
		}
		
	}
	
	public static int getBucketCount1(double width, double height, 
			double areaPerBucket)
	{
		double area= width*height; 
	    double totalBuckets = (area / areaPerBucket)  ;
		if (width<= 0 || height <=0 || areaPerBucket<=0)
		{
			return -1; 
		}else
		{
			return (int) Math.ceil(totalBuckets);
		}
		
	}
	
	public static int getBucketCount2(double area, 
			double areaPerBucket)
	{
		
	    double totalBuckets = (area / areaPerBucket)  ;
		if ( area <=0 || areaPerBucket<=0)
		{
			return -1; 
		}else
		{
			return (int) Math.ceil(totalBuckets);
		}
		
	}



}
