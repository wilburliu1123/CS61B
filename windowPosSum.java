public class windowPosSumDemo {
  public static int windowPosSum(int[] a, int n){
    for (int i=0; i<a.length; i+=1) {
      if (a[i] >= 0){
        for (int j=1; j<n; j+=1){
          if (i==n){
            break;
          }
          if (i+j <= a.length){
          a[i] = a[i] + a[i+j];
          }
        }
      }
      else a[i] = a[i];
    }
  }
  public static void main(String[] args) {
    int[] a = {1, 2, -3, 4, 5, 4};
    int n = 3;
    windowPosSum(a,n);
    System.out.println(java.util.Arrays.toString(a));
  }
}
