public class windowPosSumDemo {
  public static void windowPosSum(int[] a, int n){
    int tmp = 0;
    for (int i=0; i<a.length; i+=1) {
      tmp = a[i];
      if (a[i] < 0){
        continue;
      }
        for (int j=i+1; j<=i+n; j+=1){
          if (j > a.length-1){
            break;
          }
          tmp = tmp + a[j];
        }
      a[i] = tmp;
    }
  }
  public static void main(String[] args) {
    int[] a = {1, 2, -3, 4, 5, 4};
    int n = 3;
    windowPosSum(a,n);
    System.out.println(java.util.Arrays.toString(a));
  }
}
