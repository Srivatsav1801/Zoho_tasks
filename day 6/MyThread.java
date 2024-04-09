class MyThread extends Thread {
    public MyThread() {
        super();
    }

    public void run() {
        try {
            Thread.sleep(500);
        } catch (Exception e) {
            System.out.println(e.toString());
        }
        System.out.println("Child thread is running.");
    }

    public static void main(String[] args) {
        MyThread childThread = new MyThread();
        childThread.start();
        System.out.println("Main thread is running concurrently.");
    }
}
