package lesson10;

public class Box<E extends Fruit> {

  private final Object[] data;
  private int currentSize = 0;
  private static final int DEFAULT_SIZE = 8;

  public Box(int size) {
    this.data = new Object[ size ];
  }

  public Box() {
    this(DEFAULT_SIZE);
  }

  public void add(E value) {
    this.data[ this.currentSize ] = value;
    currentSize++;
  }

  public E get(int index) {
    return (E) data[ index ];
  }

  public void display() {
    for (Object datum : data) {
      System.out.print(datum + " ");
    }
    System.out.println();
  }

  public boolean compare(Box<?> el) {
    return this.getWeight() - el.getWeight() == 0;
  }

  public float getWeight() {
    float weightBox = 0.0f;
    if (this.data[ 0 ] != null) {
      for (int i = 0; i < this.currentSize; i++) {
        weightBox += this.get(i).getWeightFruit();
      }
    } else {
      weightBox = 0f;
    }
    return weightBox;
  }

  public void pourOver(Box<? super E> el) {

    for (int i = this.currentSize - 1, j = el.currentSize; i >= 0; i--, j++) {
      el.data[ j ] = this.data[ i ];
      el.currentSize++;
      this.data[ i ] = null;
      this.currentSize--;
    }
    if (this.currentSize < 0) {
      this.currentSize = 0;
    }
  }
}
