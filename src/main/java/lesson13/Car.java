package lesson13;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.CyclicBarrier;

public class Car implements Runnable {

  private static int CARS_COUNT;
  private Race race;
  private int speed;
  private String name;
  private static volatile boolean finish = true;

  CyclicBarrier cb;
  CountDownLatch cdl;

  public Car(Race race, int speed, CyclicBarrier cb, CountDownLatch cdl) {
    this.race = race;
    this.speed = speed;
    CARS_COUNT++;
    this.name = "Участник #" + CARS_COUNT;
    this.cb = cb;
    this.cdl = cdl;
  }

  public String getName() {
    return name;
  }

  public int getSpeed() {
    return speed;
  }

  @Override
  public void run() {
    try {
      System.out.println(this.name + " готовится");
      Thread.sleep(500 + (int) (Math.random() * 800));
      System.out.println(this.name + " готов");
      cb.await();
    } catch (Exception e) {
      e.printStackTrace();
    }

    for (int i = 0; i < race.getStages().size(); i++) {
      race.getStages().get(i).go(this);
    }
    if (finish) {
      System.out.println(this.name + " --- > ПОБЕДИТЕЛЬ!!!");
      finish = false;
    }

    cdl.countDown();

  }
}
