/**
 * 
 */
package com.basicsdatastructures;

/**
 * @author roshni
 *
 */
public class Queue {
	int capacity;
	int R[];
	int Front=0;
	int Rear=-1;
	int currentsize=0;
	void enque(int item) {
 if (Queuefull()) {
	 System.out.println("Overflow");
 }
 else {
	 Rear++;
 }
	
	if (Rear ==capacity-1) {
		Rear=0;
	
	R[Rear]= item;
	System.out.println("elements found");}}
	
	    void dequeue (int item) {
		if (Queueempty()) {
			System.out.println("underflow");
		}else
		{
		
	}
	




	}
	


	private boolean Queueempty() {
		// TODO Auto-generated method stub
		return false;
	}



	private boolean Queuefull() {
		// TODO Auto-generated method stub
		return false;
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
