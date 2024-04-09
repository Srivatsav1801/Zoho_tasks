class Multi extends Thread{
	Multi(){
		this.start();
	}
	public void run(){
		try{
			System.out.println(Thread.currentThread().getName());
			System.out.println("Java is hot, aromatic, and invigorating "+"Thread Id:"+Thread.currentThread().getId());
			/* Thread.sleep(1000); */
		}catch(Exception e){
			System.out.println(e.toString());
		}
	}
	public static void main(String[] args){
		Multi one = new Multi();
		Multi two = new Multi();
	}
}