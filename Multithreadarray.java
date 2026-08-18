import java.util.Arrays;
import java.util.Random;

class RandomArray extends Thread {

    static int[] arr = new int[10];

    public void run() {

        Random r = new Random();

        System.out.println("Random Array:");

        for (int i = 0; i < arr.length; i++) {
            arr[i] = r.nextInt(100);
            System.out.print(arr[i] + " ");
        }

        System.out.println();
    }
}

class Ascending extends Thread {

    public void run() {

        Arrays.sort(RandomArray.arr);

        System.out.println("Ascending Order:");

        for (int i : RandomArray.arr) {
            System.out.print(i + " ");
        }

        System.out.println();
    }
}

class Descending extends Thread {

    public void run() {

        System.out.println("Descending Order:");

        for (int i = RandomArray.arr.length - 1; i >= 0; i--) {
            System.out.print(RandomArray.arr[i] + " ");
        }

        System.out.println();
    }
}

public class MultiThreadArray {

    public static void main(String[] args) throws InterruptedException {

        RandomArray t1 = new RandomArray();
        Ascending t2 = new Ascending();
        Descending t3 = new Descending();

        t1.start();
        t1.join();

        t2.start();
        t2.join();

        t3.start();
        t3.join();
    }
}

 