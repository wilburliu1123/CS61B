public class arr{
  public static int[] insert (int[] arr, int item, int position) {
    int[] copy = new int[arr.length + 1] ;
    int remainder = copy.length - 1 - position ;
    System.arraycopy(arr, 0, copy, 0, arr.length);
    //copy and insert the value
    copy[position] = item;
    System.arraycopy(arr, position, copy, position+1, remainder);
    return copy;
  }
/**
  public static void reverse(int[] arr) {
    int[] copy = new int[arr.length];
    System.arraycopy(arr, 0, copy, 0, arr.length) ;
    int i = 1;
    while (i < arr.length) {
      arr[arr.length - i] = copy[i-1];
      i++;
    }
  }
  */
  public static void reverse(int[] arr) {
    for (int i=0; i < arr.length/2; i++){
      int j = arr.length - i - 1;
      int temp = arr[i];
      arr[i] = arr[j];
      arr[j] = temp;
    }
  }
  public static void main(String[] args) {
    int[] w = {1, 2, 3, 4, 5};
    int[] z = insert(w, 6, 3);
    reverse(w);
  }
}
