package com.annynomousInner;

public class AnnynomousInner {
	
public static void main(String[] args) {
		
		car bmwCustomModel= new car() {

			public void stop() {
				System.out.println("Special Implementation of stop");
				
			}
			
			public void start() {
				System.out.println("Special Implementation of start");
				
			}
		};
		
		bmwCustomModel.start();
		bmwCustomModel.stop();

}
}