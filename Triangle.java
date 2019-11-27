public class Triangle{
  public static void main(String[] args) {
    int col = 0;
    int row = 0;
    int SIZE = 5;
    while (row < SIZE) {
      while (col <= row) {
        col = col + 1;
        System.out.print('*');
      }
    System.out.println();
    row = row + 1;
    col = 0;
    }
  }
}
