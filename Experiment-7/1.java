public class Program1 {
    static class First extends Thread {
        public void run() {
            for (int i = 1; i <= 10; i++) {
                System.out.println(i);
                if (i == 2)
                    Thread.yield();
            }
        }
    }

    static class Second extends Thread {
        public void run() {
            for (int i = 10; i >= 1; i--)
                System.out.println(i);
        }
    }

    public static void main(String[] args) {
        new First().start();
        new Second().start();
    }
}