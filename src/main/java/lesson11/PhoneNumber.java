package lesson11;

import java.util.ArrayList;

public class PhoneNumber {

  private final ArrayList<String> phones;

  public PhoneNumber() {
    this.phones = new ArrayList<>();
  }

  public void addNumberPhone(String phone) {
    phones.add(phone);
  }
  public String toString() {
    return " имеет телефоны с номерами " + phones;
  }
}
