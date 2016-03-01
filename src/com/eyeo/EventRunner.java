package com.eyeo;

public class EventRunner{

	class RunEvent implements Runnable{
		String event;
		ResultDisplay rd;
		public RunEvent(String event,ResultDisplay rd){
			this.event = event;
			this.rd = rd;
		}
		@Override
		public void run() {
			try {
				Thread.sleep(10000); // Sleep for 10 seconds for simulating some blocking operation.
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			if(this.event == "returnSuccess"){
				this.rd.showResult("Success");	
			}else{
				this.rd.showResult("Failure");
			}
			
		}
	}
	public synchronized void postEvent(String event,ResultDisplay rd){
		System.out.println("Called postevent with event - " + event);
		new Thread(new RunEvent(event,rd)).start();		
	}

}
