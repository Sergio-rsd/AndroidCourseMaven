package lesson8;

public class Cat implements ParticipantAction {
  String name;

  public Cat(String name) {
    this.name = name;
  }
  private int maxDistance = 80;
  private int maxHeight = 2;
  @Override
  public int runes() {
    return maxDistance;
  }

  @Override
  public int jumps() {
    return maxHeight;
  }

  @Override
  public String nameParticipant() {
    return name;
  }
}
