
public class Calculatemark {
	
	double mark1;
	double mark2;
	double mark3;
	String result1="A+", result2="A",grade1,grade2;
    double totalmark=0, avgmark=0;
	public double markcalculation(double mark1,double mark2,double mark3)
	{
		totalmark =mark1*0.2 + mark2*0.2 + mark3*0.2;
		return totalmark;

   }
	
	double averagemark(double avgmark,double totalmark)
	{
		avgmark= (totalmark)/3;
		return avgmark;
	}
	
	String finalgrade (String result1,String result2)
	{
		if(totalmark>=90)
		{
			return result1;
		}
		else if(totalmark>=80 && totalmark<=70 )
		{
			return result2;
		}
		return null;
		
	
}
	
}