package com.custom.threads;

public class CustomRunnable implements Runnable{

	@Override
	public void run() {
		int index=6;
		
		
		try {
			for(int i=0;i<index;i++)
			{
				
				System.out.println("Runnable en execution");
			Thread.sleep(2000);
			}
		} 
		catch (InterruptedException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}
		
	}

}
