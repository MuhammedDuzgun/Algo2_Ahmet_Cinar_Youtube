package Bolum_13_Thread_Kullanimi;

public class MyThread extends Thread{

    private String threadName;
    private Thread thread;

    public MyThread(String threadName) {
        this.threadName = threadName;
    }

    @Override
    public void run() {
        try {
            for (int i = 0; i < 10; i++) {
                System.out.println(threadName +  "   Merhaba Muhammed");
                Thread.sleep(100);
            }
        }catch (InterruptedException e) {
            System.out.println("Hata Olustu : " + e.getMessage());
        }
    }

    public void startMyThread() {
        if(thread == null){
            thread = new Thread(MyThread.this, threadName);
            thread.start();
        }

    }

}
