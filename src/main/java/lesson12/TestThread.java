package lesson12;

import java.util.Arrays;

public class TestThread {


  public static void main(String[] args) {
    final int SIZE = 1_000_000;// 10000000

    oneThread(SIZE);
    twoThread(SIZE);
  }

  private static void oneThread(int SIZE) {
    float[] arr = new float[SIZE];
    for (int i = 0; i < SIZE; i++) {
      arr[i] = 1;
    }
    long start = System.currentTimeMillis();

    for (int i = 0; i < SIZE; i++) {
      arr[i] = (float) (arr[i] * Math.sin(0.2f + (float) i / 5) * Math.cos(0.2f + (float) i / 5)
          * Math.cos(
          0.4f + (float) i / 2));
    }
//    System.out.println(Arrays.toString(arr));
    System.out.println(
        "Время расчета в одном потоке (мс): " + (System.currentTimeMillis() - start));
  }

  private static void twoThread(int SIZE) {

    final int HALF = SIZE / 2;
    float[] arr = new float[SIZE];
    for (int i = 0; i < SIZE; i++) {
      arr[i] = 1;
    }
    float[] arr1 = new float[HALF];
    float[] arr2 = new float[HALF];

    long start = System.currentTimeMillis();

    System.arraycopy(arr, 0, arr1, 0, HALF);
    System.arraycopy(arr, HALF, arr2, 0, HALF);
    Thread t1 = new Thread(() -> {
      for (int i = 0; i < HALF; i++) {
        arr1[i] = (float) (arr1[i] * Math.sin(0.2f + (float) i / 5) * Math.cos(
            0.2f + (float) i / 5) * Math.cos(
            0.4f + (float) i / 2));
      }
    });
    Thread t2 = new Thread(() -> {
      int j;
      for (int i = 0; i < HALF; i++) {
        j = HALF + i;
        arr2[i] = (float) (arr2[i] * Math.sin(0.2f + (float) j / 5) * Math.cos(
            0.2f + (float) j / 5) * Math.cos(
            0.4f + (float) j / 2));
      }
    });
    t1.start();
    t2.start();
    try {
      t1.join();
      t2.join();
    } catch (InterruptedException e) {
      e.printStackTrace();
    }

    System.arraycopy(arr1, 0, arr, 0, HALF);
    System.arraycopy(arr2, 0, arr, HALF, HALF);

//    System.out.println(Arrays.toString(arr));
    System.out.println(
        "Время расчета в двух потоках (мс): " + (System.currentTimeMillis() - start));
  }

}
