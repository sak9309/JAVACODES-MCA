class MyThread extends Thread 
{ 
	public void run() 
	{ 
		System.out.println("Thread Running... "+Thread.currentThread().getName()); 
	} 

	public static void main(String[]args) throws InterruptedException 
	{ 
		MyThread p1 = new MyThread();
		MyThread p2 = new MyThread();
                               MyThread p3= new MyThread();
		
		p1.start();//Thread Initiation
		p2.start();//Thread Initiation
                                p3.start();//Thread Initiation
		
		p1.setPriority(3);// Setting priority
		p2.setPriority(2);//Setting priority
                                p3.setPriority(1);//Setting priority
		
                                int p11 = p1.getPriority();// Getting -priority
		int p22 = p2.getPriority();// Getting -priority
		int p33 = p3.getPriority();// Getting -priority
		System.out.println("First thread priority : " + p11);  
		System.out.println("Second thread priority : " + p22);
                                System.out.println("Third thread priority : " + p33); 
                                p3.sleep(4000);//blocking thread execution for 4 seconds
                                //MyThread.java uses or overrides a depricated API
                                 //p3.stop();
                                  //Inter Thread Communication in java
                                 //stopped.set(true);
                                System.out.println("One thread in non-runnable state!!" ); 
      


                                 
		
	} 
}