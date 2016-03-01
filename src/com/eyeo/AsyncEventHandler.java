package com.eyeo;

public class AsyncEventHandler {
	public static void main(String[] args) {
		EventRunner ev = new EventRunner();
		ResultDisplay rd =  new ResultDisplay();
		ev.postEvent("returnSuccess", rd);
		ev.postEvent("returnFailure", rd);
	}
}
