import java.io.*;
class thread_runnable implements Runnable{
	public void run(){
		for(int i = 0;i<10;i++){
			try{
				Thread.sleep(2000);
				System.out.println("Hello");
			}
			catch(Exception e)
			{
			System.out.println(e.toString());
			}
		}
		
	}
	
	
	public static void main(String[] args){
		thread_runnable thd = new thread_runnable();
		Thread td = new Thread(thd);
		
		td.start();
	}
}