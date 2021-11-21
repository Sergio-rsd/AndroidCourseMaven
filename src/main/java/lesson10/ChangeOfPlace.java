package lesson10;

class ChangeOfPlace<E> {

  private E[] data;
  private int currentSize = 0;

  @SuppressWarnings("unchecked")
  public ChangeOfPlace(int size) {
    this.data = (E[]) new Object[ size ];
  }

  public void add(E value) {
    this.data[ this.currentSize ] = value;
    currentSize++;
  }

  public void display() {
    for (E datum : data) {
      System.out.print(datum + " ");
    }
    System.out.println();
  }

  public void exchange(int i, int j) {
    E temp = data[ i ];
    data[ i ] = data[ j ];
    data[ j ] = temp;
  }

}