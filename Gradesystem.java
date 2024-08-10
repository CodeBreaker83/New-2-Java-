// Identifying grade of a student

import java.util.Scanner;
class Gradesystem
{
  public static void main (String[] args)
  {
    double avg;
	Scanner sc=new Scanner(System.in);
	
	System.out.print("Enter Average Marks : ");
	avg=sc.nextDouble();
	
	if(avg>=60)
	  System.out.println("First grade...");
	else 
        if(avg>=50)
		    System.out.println("Second grade..");
       else 
		   if(avg>=40)
               System.out.println("Third grate..");
		   else
	            System.out.println("No grade..Fail");
	}			
	
}