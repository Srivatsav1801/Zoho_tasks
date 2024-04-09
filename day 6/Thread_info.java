class Thread_info extends Thread{
	public void run(){
		try{
			for(int i = 0;i<10;i++){
				System.out.println("i="+i);
				Thread.sleep(1000);
			}
		}catch(Exception e){
			System.out.println(e.toString());
		}
	}
	public static void main(String[] args){
		Thread_info info = new Thread_info();
		info.start();
		System.out.println("Thread ID:"+info.getId());
		System.out.println("Thread Name:"+info.getName());
	}
}