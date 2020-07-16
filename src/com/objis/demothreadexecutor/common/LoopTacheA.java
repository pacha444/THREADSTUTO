package com.objis.demothreadexecutor.common;

import java.util.concurrent.TimeUnit;

public class LoopTacheA implements Runnable{
	private static int count=0;
	private int id;



	@Override
	public void run() {
		// TODO Auto-generated method stub
		
		System.out.println("###### DEMARRAGE<TACHE"+id+">#######");
		
		for(int i=10;i>0;i--)
		{
			System.out.println("<TACHE  "+id+ "> TIC TIC"+i);
		}
		try {
			TimeUnit.MILLISECONDS.sleep((long) (Math.random()*1000));
			
		} catch (InterruptedException e) {
			e.printStackTrace();
		
		}
		System.out.println("###### FIN<TACHE"+id+">#######");
	}



	public LoopTacheA(int id) {
		
		this.id = id;
	}



	public LoopTacheA() {
		super();
	}
	
	

}
