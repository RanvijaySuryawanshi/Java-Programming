public class Program8 {
    static class ArraySum extends Thread {
        int[] arr;

        ArraySum(int[] arr) {
            this.arr = arr;
        }

        public void run() {
            int sum = 0;
            for (int n : arr)
                sum += n;

            System.out.println("Sum = " + sum);
        }
    }

    public static void main(String[] args) {
        new ArraySum(new int[]{1, 2, 3, 4, 5}).start();
        new ArraySum(new int[]{6, 7, 8, 9, 10}).start();
    }
}