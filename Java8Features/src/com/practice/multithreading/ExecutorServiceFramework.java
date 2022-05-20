package com.practice.multithreading;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class ExecutorServiceFramework {

	ExecutorService service = Executors.newCachedThreadPool();

	Future<String> taskFuture1 = service.submit(new Callable<String>() {

		@Override
		public String call() throws Exception {
			return "Kartik";
		}
	});
}