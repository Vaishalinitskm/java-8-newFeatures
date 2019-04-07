package com.tutorial.practise.multithreading;

import java.util.concurrent.CountDownLatch;



/**
 * CountDownLatch Example.
 * 
 * With a latch, the waiters wait for the last arriving thread to arrive, 
 * but those arriving threads don't do any waiting themselves.
 * 
 * REAL-LIFE EXAMPLE::::
 * A better real world example would be an exam prompter who waits patiently 
 * for each student to hand in their test. 
 * Students don't wait once they complete their exams and are free to leave. 
 * Once the last student hands in the exam (or the time limit expires), 
 * the prompter stops waiting and leaves with the tests.
 * 
 * @author Vaishali
 *
 */
public class CountDownLatchDemo{
	
	
	public static void main(String args[]) throws InterruptedException {
		System.out.println("Main Thread begins...");
		int numOfThreadsToWait = 3;
		CountDownLatch latch = new CountDownLatch(numOfThreadsToWait);
		
		WorkerThread w1 = new WorkerThread(2, latch, "Worker-1");
		WorkerThread w2 = new WorkerThread(5, latch, "Worker-2");
		WorkerThread w3 = new WorkerThread(8, latch, "Worker-3");
		WorkerThread w4 = new WorkerThread(10, latch, "Worker-4");
		
		//4 threads started
		w1.start();
		w2.start();
		w3.start();
		w4.start();

//		latch.await(5, TimeUnit.SECONDS);
		latch.await();//no timeout.. just execute after 
		
		System.out.println("Main Thread Ends...either bz of timeout/or"
				+ " because all the "+numOfThreadsToWait+ " threads have finished execution.");
	}
	
}

class WorkerThread extends Thread{
	
	private int delayInSec;
	private CountDownLatch latch;

	WorkerThread(final int delayInSec, final CountDownLatch latch,
			final String name){
		super(name);
		this.delayInSec = delayInSec;
		this.latch = latch;
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		try {
			System.out.println("Delaying the thread "+ Thread.currentThread().getName()+ 
					" for "+ delayInSec + " seconds.");
			Thread.sleep(delayInSec*1000);
			System.out.println(Thread.currentThread().getName() + " finished execution.");
			latch.countDown();//this countdown will deduct itself from the threads for 
			//the awaiting thread to wait for one lesser thread
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}