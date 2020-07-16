package com.custom.threads;

public class CustomThread extends Thread {
	
   @Override
public void run() {
	// TODO Auto-generated method stub
	super.run();
	int index=6;
	
	
		try {
			for(int i=0;i<index;i++)
			{
				
				System.out.println("Thread en execution");
			sleep(2000);
			}
		} 
		catch (InterruptedException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}
	}
	
}
