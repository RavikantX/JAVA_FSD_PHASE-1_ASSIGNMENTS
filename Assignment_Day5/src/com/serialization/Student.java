package com.serialization;

import java.io.Serializable;

// Here we have use plain java class for serialization
public class Student implements Serializable {
	
	private int id;
	private String name;
	private String email;
	private String password;
	
	 public Student(int id ,String name , String email , String password)//changed to constructor
	  {
		  this.id=id;
		  this.name=name;
		  this.password=password;
	  }
	  public static void main(String[] args) {
		  Student s1=new Student(1, "Ravikant", "ravikant97087@gmail.com","Ravi@123");
		  
	  }
	
	

}
