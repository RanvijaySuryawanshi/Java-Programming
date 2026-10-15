public class Program5 {
    static class Table implements Runnable {
        int n;

        Table(int n) {
            this.n = n;
        }

        public void run() {
            for (int i = 1; i <= 10; i++)
                System.out.println(n + " x " + i + " = " + n * i);
        }
    }

    public static void main(String[] args) {
        new Thread(new Table(2)).start();
        new Thread(new Table(5)).start();
    }
}