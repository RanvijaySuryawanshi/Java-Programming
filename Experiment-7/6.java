public class Program6 {
    static class First extends Thread {
        public void run() {
            for (int i = 1; i <= 5; i++)
                System.out.println(i);
        }
    }

    public static void main(String[] args) throws Exception {
        First t = new First();
        t.start();
        t.join();

        System.out.println("Main thread completed");
    }
}