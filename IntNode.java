public class IntNode {
  public int item;
  public IntNode next;
  public IntNode(int i, IntNode n) {
    item = i;
    next = n;
  }
  public static int[] insert (int[] arr, int item, int position) {
    int[] copy = int[] arr;
    copy[position] = item; //insert the value
    int newLenth = copy.length + 1 ;
    int remainder = newLenth - position ;
    if (position < newLenth) {
      System.arraycopy(arr, position, copy, position+1, remainder);
    }
    return copy;
  }
  public static void main(String[] args) {
    int [] w = {1, 2, 3, 4, 5};
    w.insert(w, 6, 3);
  }
}
