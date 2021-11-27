package lesson11;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class PhoneBook {

  public static void main(String[] args) {
    System.out.println("Вариант 1");
    Map<String, BookPhone> namePhoneOwners = new HashMap<>();
    namePhoneOwners.putIfAbsent("Вася", new BookPhone());
    namePhoneOwners.putIfAbsent("Маша", new BookPhone());

    System.out.println(namePhoneOwners);

    namePhoneOwners.get("Вася").addPhone("54");
    namePhoneOwners.get("Вася").addPhone("101");
    namePhoneOwners.get("Маша").addPhone("911");

    System.out.println(namePhoneOwners);

    namePhoneOwners.putIfAbsent("John", new BookPhone());
    namePhoneOwners.get("John").addPhone("1374");
    System.out.println(namePhoneOwners);

    System.out.println("Вариант 2");
    BookPhoneFull peoples = new BookPhoneFull();
    peoples.create("Петя");
    peoples.add("Петя", "03123");
    peoples.add("Петя", "03");
    peoples.add("Петя", "890");
    peoples.get("Петя");
    peoples.create("Tomas");
    peoples.add("Tomas", "05400");
    peoples.get("Tomas");
    peoples.create("Масяня");
    peoples.get("Масяня");
    System.out.println(peoples);

    System.out.println("Вариант 3");
    Map<String, ArrayList<String>> namePeoples = new HashMap<>();
    namePeoples.computeIfAbsent("Иванов", k -> new ArrayList<>());
    namePeoples.get("Иванов").add("123");
    namePeoples.get("Иванов").add("001");

    namePeoples.computeIfAbsent("Петров", k -> new ArrayList<>());
    namePeoples.get("Петров").add("923");
    namePeoples.get("Петров").add("6001");
    namePeoples.get("Петров").add("199999");
    System.out.println(namePeoples);
    System.out.println("Петров: "+namePeoples.get("Петров"));

  }

}
