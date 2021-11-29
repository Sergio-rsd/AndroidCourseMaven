package lesson13;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.CyclicBarrier;

public class RallyRacing {

  public static final int CARS_COUNT_RACE = 4;

  public static void main(String[] args) {
    System.out.println("ВАЖНОЕ ОБЪЯВЛЕНИЕ >>> Подготовка!!!");
    Race race = new Race(new Road(60), new Tunnel(), new Road(40));
    Car[] cars = new Car[CARS_COUNT_RACE];
    Runnable announcement = () -> System.out.println("ВАЖНОЕ ОБЪЯВЛЕНИЕ >>> Гонка началась!!!");
    CyclicBarrier cb = new CyclicBarrier(CARS_COUNT_RACE, announcement);
    CountDownLatch cdl = new CountDownLatch(CARS_COUNT_RACE);
    for (int i = 0; i < cars.length; i++) {
      cars[i] = new Car(race, 20 + (int) (Math.random() * 10), cb, cdl);
    }

    for (Car car : cars) {
      new Thread(car).start();
    }

    try {
      cdl.await();
    } catch (InterruptedException e) {
      e.printStackTrace();
    }

    System.out.println("ВАЖНОЕ ОБЪЯВЛЕНИЕ >>> Гонка закончилась!!!");

  }

}
