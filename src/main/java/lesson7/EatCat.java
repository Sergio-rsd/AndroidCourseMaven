package lesson7;

import java.util.Scanner;

public class EatCat {

  public static void main(String[] args) throws InterruptedException {
//    int addEat = 35;
    boolean allCatFullness = false;
    int numbersHungryCats = 0;
    Scanner scanner = new Scanner(System.in);
    Cat cat = new Cat("Барсик", 15);
    Cat cat1 = new Cat("Пушок", 20);
    Cat cat2 = new Cat("Мурзик", 25);
    Cat[] catTeam = {cat, cat1, cat2};
    Plate plate = new Plate();

    System.out.print("Насыпьте еды в тарелку: ");
    plate.setFood(scanner.nextInt());

    plate.info();

    while (!allCatFullness) {
      for (Cat catHungry : catTeam) {
        System.out.printf("%s ест из тарелки%n", catHungry.getName());
        Thread.sleep(1000);
        catHungry.eat(plate);
        catHungry.info();
        allCatFullness = catHungry.isFullnessCat();
        if (!catHungry.isFullnessCat()) {
          ++numbersHungryCats;
        }
      }
      plate.info();
      if (numbersHungryCats == 0) {
        System.out.println("Все котов накормили!!");
        break;
      }
      System.out.printf("Осталось голодных котов %d шт, Еще кормить будем? (1 - да, 0 - нет) ",
          numbersHungryCats);
      numbersHungryCats = 0;
      if (scanner.nextInt() != 0) {
        System.out.printf("Добавьте в тарелку еще еды (тарелка вмещает не больше %d еды): ",
            plate.getVolumePlate());
        plate.setFood(scanner.nextInt());
      } else {
        System.out.println("Вы ЖАДИНА! Коты остануться голодные!!!");
        break;
      }
    }
    scanner.close();
  }

}
