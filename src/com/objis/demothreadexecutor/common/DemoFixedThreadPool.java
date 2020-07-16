package com.objis.demothreadexecutor.common;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;


public class DemoFixedThreadPool {
	
	public  static void main(String args[])
	{
		System.out.println("THREAD PRINCIPAL: DEBUT");
		int id=0;
		id++;
		ExecutorService execService= Executors.newFixedThreadPool(3);
		execService.execute(new LoopTacheA(id));
		execService.execute(new LoopTacheA(id));
		execService.execute(new LoopTacheA(id));
		execService.shutdown();
		System.out.println("THREAD PRINCIPAL: FIN");
	}

}
