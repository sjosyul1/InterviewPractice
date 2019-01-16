package com.practice.interview;

public class DeadLock {

	String str1="srinath";
	String str2= "Amisha";
	
	Thread t1= new Thread("My thread 1") {
	public void run() 
	{
		while(true)
		{
			synchronized (str1)
			{
			synchronized (str2)
			{
				System.out.println(str1+ str2);
				
			}	
			}
		}
	}
	};
	Thread trd2 = new Thread("My Thread 2"){
        public void run(){
            while(true){
                synchronized(str2){
                    synchronized(str1){
                        System.out.println(str2 + str1);
                    }
                }
            }
        }
    };
	public static void main(String[] args)
	{
		
		DeadLock mdl = new DeadLock();
        mdl.t1.start();
        mdl.trd2.start();
		

	}

}
