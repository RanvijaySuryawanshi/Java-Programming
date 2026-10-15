public class Program4 {
    static class Numbers extends Thread {
        public void run() {
            for (int i = 1; i <= 5; i++)
                System.out.println(i);
        }
    }

    static class Alphabets extends Thread {
        public void run() {
            for (char c = 'A'; c <= 'E'; c++)
                System.out.println(c);
        }
    }

    static class Special extends Thread {
        public void run() {
            for (char c = '!'; c <= '%'; c++)
                System.out.println(c);
        }
    }

    public static void main(String[] args) {
        new Numbers().start();
        new Alphabets().start();
        new Special().start();
    }
}