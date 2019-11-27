public class MaxArray {
   public static int max(int[] m) {
     /** For loop solution */
     int max = 0;
     for (int i=0; i< m.length; i += 1) {
       if (max < m[i]) {
         max = m[i];
       }
     }
     return max;
   }

     /** while loop solution
      int i = 0;
      int max = 0;
      while (i < m.length) {
         if (max < m[i]) {
            max = m[i];
         }
         i = i + 1;
       }
       return max;
    }
    */

   public static void main(String[] args) {
      int[] numbers = new int[]{9, 2, 15, 2, 22, 10, 6};
      System.out.println(max(numbers));

   }
}
