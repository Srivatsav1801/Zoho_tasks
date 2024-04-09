class Two_thread extends Thread{
	Two_thread(){
		this.start();
	}
	public void run(){
		try{
			for(int i = 0;i<10;i++){
				System.out.println("i="+i+"Thread Id:"+Thread.currentThread().getId());
				/* Thread.sleep(1000); */
			}
			System.out.println(Thread.currentThread().getId());
			System.out.println(Thread.currentThread().getName());
		}catch(Exception e){
			System.out.println(e.toString());
		}
	}
	public static void main(String[] args){
		Two_thread two = new Two_thread();
		Two_thread three = new Two_thread();
	}
}