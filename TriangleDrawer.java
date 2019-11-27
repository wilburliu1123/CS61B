public class TriangleDrawer {
   public static void drawTriangle(int N) {
     int SIZE = N;
     int col = 0;
     int row = 0;
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

   public static void main(String[] args) {
     drawTriangle(20);
   }
}


/**
public class TriangleDrawer {
  public static int SIZE;
  public static void drawTriangle(int N) {
    N = 10;
   }
   public static main(String[] args) {
       int col = 0;
       int row = 0;
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
*/
