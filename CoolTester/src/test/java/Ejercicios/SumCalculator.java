package Ejercicios;

public class SumCalculator {
	
	private double firstNumber;
    private double secondNumber;
    
    public double getFirstNumber()
    {
    	
        return firstNumber;
    }
    
    public double getSecondNumber()
    {
        return secondNumber;
    }
    
    public void setFirstNumber(double firstNumber)
    {
        this.firstNumber = firstNumber;
    }
    
    public void setSecondNumber(double secondNumber)
    {
        this.secondNumber = secondNumber;
    }
    
    public double getAdditionResult()
    {
    	
        return firstNumber + secondNumber;
    }
    
    public double getSubtractionResult()
    {
        return firstNumber - secondNumber;
    }
    
    public double getMultiplicationResult()
    {
        return firstNumber * secondNumber;
    }
    
  public double getDivisionResult () 
  {

          if (secondNumber == 0) {

             return this.secondNumber = 0;

          } else {

              return firstNumber / secondNumber;

          }

       }

}
