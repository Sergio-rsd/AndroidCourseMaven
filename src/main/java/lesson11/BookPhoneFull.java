package lesson11;

import java.util.HashMap;

public class BookPhoneFull {

  private final HashMap<String, PhoneNumber> name;

  public BookPhoneFull() {
    this.name = new HashMap<>();
  }

  public void create(String name) {
    this.name.putIfAbsent(name, new PhoneNumber());
  }

  public void add(String name, String phone) {
    this.name.get(name).addNumberPhone(phone);
  }

  public void get(String nameFind) {
    System.out.printf("%s %s%n", nameFind, name.get(nameFind).toString());
  }
  @Override
  public String toString() {
    return "" + name;
  }
}
