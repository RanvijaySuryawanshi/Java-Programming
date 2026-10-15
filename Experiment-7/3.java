public class Program3 {
    static class First extends Thread {
        public void run() {
            for (int i = 10; i <= 20; i++) {
                System.out.println("First: " + i);
                if (i == 11) {
                    try {
                        Thread.sleep(1000);
                    } catch (Exception e) {}
                }
            }
        }
    }

    static class Second extends Thread {
        public void run() {
            for (int i = 20; i >= 1; i--)
                System.out.println("Second: " + i);
        }
    }

    public static void main(String[] args) {
        new First().start();
        new Second().start();
    }
}