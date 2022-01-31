package com.innerclass;

public class Localinnerclass {
  //Here we will use local inner class for validation of adhar for age group below and above 18
	
	void check (int age)
	{
		if (age>=18)
		{
			class inner {
				void validate()
				{
					System.out.println("Validated");
					
				}
			}
			 inner inner=new inner();
			 inner.validate();
		}
		else
		{
			System.out.println("Not validated");
		}
	}
	public static  void main(String[] args) {
		Localinnerclass outer=new Localinnerclass();
		// Here we will check by giving age as 19
		outer.check(19);
		
		//Now lets check using age 16
		outer.check(16);
		//we get output as not validated
		}
	
	
}

