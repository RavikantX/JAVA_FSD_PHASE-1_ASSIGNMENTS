package com.exceptionhandling;

public class MultipleCatch_demo {

	public static void main(String[] args) {
	
		try
		{
			//Code for Arithmetic Exception
			int result=10/6;
			System.out.println("Result "+result);
			
			//Code for ArrayIndexOutOfBoundsException 
			int a[]= {1 , 5, 6, 8 ,2};
			System.out.println("Value at index 4 is "+a[4]);
			
			//code for Null pointer Exception
			String name=null;
			name.equals("user");
			
			//Code for Interrupted Exception
			Thread.sleep(100);
		}
		// catch method for handling Arithmetic Exception
          catch (ArithmeticException e) {
        	  System.out.println("Arithmetic Exception "+e.getMessage());
        	  
        //catch method for handling ArrayIndexOutOfBoundsException	  
          }
		catch(ArrayIndexOutOfBoundsException e ) {
			System.out.println("Aray Index issue "+e.getMessage());
			
		//catch method for handling	 NullPointerException
		}
		catch(NullPointerException e)
		{
			System.out.println("Object is null  "+e.getMessage());
			
			//catch method for handling	InterruptedException 
		}
		catch (InterruptedException e)
		{
	System.out.println("Error working with thread  "+e.getMessage());
	
	//catch method for handling exception which is not known means general exception handling
		}
	catch(Exception e)
	{
		System.out.println("Error occured"+e.getLocalizedMessage());
	}
	
	}
}



