package com.Stack;

public class Stack {
	

	static final int MAX = 1000;
	int top;
	int a[] = new int[MAX];

	boolean isEmpty() {
		
		return top<0;
	}

	Stack() {
		top = -1; //default stack is empty
	}

	boolean push(int x) {
		if (top >= (MAX - 1)) {
			System.out.println("Stack Overflow");
			return false;
		} else {
			a[++top] = x;
			System.out.println(x + " pushed into stack");
			return true;
		}
	}

	int pop() {
		if (top < 0) {
			System.out.println("Stack Underflow");
			return 0;
		} else {
			int x = a[top--];
			return x;
		}
	}

	public static void main(String args[]) {
		Stack s = new Stack();
		
		// Now to push the value means to add we write
		s.push(60);
		s.push(20);
		s.push(13);
		
		//If we want to POP means remove then we use 
		System.out.println(s.pop() + " Popped from stack");

}
}