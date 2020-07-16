package com.custom.threads;

public class Programprinc {
	public  static void main(String args[])
	{
		CustomThread customThread=new CustomThread();
		customThread.start();
		CustomRunnable customRunnable = new CustomRunnable();
		new Thread (customRunnable).start();
		int index=4;
		 try {
		for(int i=0;i<index;i++)
		{
			 System.out.println("Programme Principale");
			
				Thread.sleep(2000);
		}
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				System.out.println(e.getMessage());
			} 
		}
		
	
}
