package lesson11;

import java.util.ArrayList;

public class BookPhone {

  private final ArrayList<String> phones;

  public BookPhone() {
    this.phones = new ArrayList<>();
  }

  public void addPhone(String phone) {
    phones.add(phone);
  }

  public String toString() {
    return " имеет телефоны " + phones;
  }
}
