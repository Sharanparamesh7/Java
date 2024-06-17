class MyThread extends Thread {
  public void run() {
    for (int i = 1; i <= 5; i++) {
      System.out.println(Thread.currentThread().getName() + " " + i);
    }
  }
}

public class mt{
  public static void main(String[] args) {
    MyThread t1 = new MyThread();
    t1.setName("Thread 1");

    MyThread t2 = new MyThread();
    t2.setName("Thread 2");

    t1.start();
    t2.start();
  } 
}