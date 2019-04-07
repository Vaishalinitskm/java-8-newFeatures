package com.tutorial.practise.multithreading;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

public class TestShutdownHook2 {

	public static void main(String[] args) throws InterruptedException {

		// login event
		String event = "login";
		sendMessage(event, getCurrentLogin());
		final CountDownLatch latch = new CountDownLatch(1);

		/*
		 * logout or shutdown event
		 * 
		 * (this is like a background thread, which will after
		 * execute after the current thread execution or if something happens before the 
		 * complete execution of the main thread.) 
		 * 
		 */
		
		Runtime.getRuntime().addShutdownHook(new Thread(new Runnable() {
			@Override
			public void run() {
				String event = "logout";
				sendMessage(event, getCurrentLogin());
				latch.countDown();//this count down is decreased,
				// indicating this thread is executed
			}
		}));
		

		System.out.println("Main Thread is executing now...");
		latch.await(5, TimeUnit.SECONDS);
	}

	private static void sendMessage(String event, Object currentLogin) {
		System.out.println("Sending Message as:  [" + event + "] for  [" + currentLogin + "].");
	}

	private static Object getCurrentLogin() {
		return "VaishaliID";
	}
}
