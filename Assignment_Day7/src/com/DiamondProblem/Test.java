package com.DiamondProblem;

public class Test implements First , Second {
	public void show () {
		
		// from the version of jdk above 7 we can usee super to directly get result
		First.super.show();
		Second.super.show();
	}
	
	public static void main(String[] args) {
		
		Test t=new Test();
		t.show();
		
	}

}
