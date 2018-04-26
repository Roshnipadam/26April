/**
 * 
 */
package com.basicsdatastructures;

/**
 * @author roshni
 *
 */
public class Stack {
	 final int MAX=1000;
	 int top;
	 int a[]=new int [MAX];
	
	 Stack()
	 {
		 top=-1;
	 }
	  void push (int x)
	 {
		 if (top>=MAX)
		 {
			 System.out.println("stack overflow");
			
		 }
		 else
		 {
			 a[++top]=x;
			 System.out.println(x);
			 
			 
		 }
		 
		 
	 }
	 void pop() {
		 if (top<0)
		 {
			 System.out.println("stack underflow");
			 
			 
		 }else {
			 int x=a[top--];
			 System.out.println(x);
		 }
		 
	 }
			 
		 

	 
	 
	

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		
		Stack s= new Stack();
		s.push(1);
		s.push(2);
		s.push(3);
		s.pop();
		System.out.println("after pop");
		s.pop();
		
		
	

	}

}
