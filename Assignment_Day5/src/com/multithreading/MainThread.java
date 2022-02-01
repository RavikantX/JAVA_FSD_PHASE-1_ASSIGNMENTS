package com.multithreading;

// Here we will implement runnable interface
public class MainThread implements Runnable{
	
public static int count=0;
    
    public void run()
    {
        while(MainThread.count<=15)
        {
          // Using try and catch method 
        	try {
                
                System.out.println("My Thread "+ (++MainThread.count));
                
                //making thread sleep for 1 second
                Thread.sleep(1000);
                
            } catch (Exception e) {
                System.out.println("Error Occured "+e);
            }
        }
    }
    //by creating main method
    public static void main(String[] args) {
    	//Let create target runnable interface
    	 MainThread ins=new  MainThread();
    	 Thread mythtread=new Thread(ins);
    	 mythtread.start();
    	 
   
    	 
    	  while(MainThread.count<=15)
          {
              try {
                  
                  System.out.println("Main Thread "+ (++MainThread.count));
                  Thread.sleep(1000);
                  
              } catch (Exception e) {
                  System.out.println("Error Occured "+e);
              }
          }
      }
    	 
    	 
    }

