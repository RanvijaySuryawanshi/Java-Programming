public class Program7 {
    static class MyThread extends Thread {
        public void run() {
            System.out.println(getName() + " Priority: " + getPriority());
        }
    }

    public static void main(String[] args) {
        MyThread t1 = new MyThread();
        MyThread t2 = new MyThread();

        t1.setPriority(3);
        t2.setPriority(8);

        t1.start();
        t2.start();
    }
}