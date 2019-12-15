public class NBody {
    public static double readRadius(String filename) {
      In in = new In(filename);
      int N = in.readInt();
      double radius =  in.readDouble();
      return radius;
    }
    public static Body[] readBodies(String filename) {
      In in = new In(filename);
      int N = in.readInt();
      double radius =  in.readDouble();
      Body[] bodies = new Body[N];
      for (int i=0; i<5; i++){
          double int_posX = in.readDouble();
          double int_posY = in.readDouble();
          double int_velX = in.readDouble();
          double int_velY = in.readDouble();
          double mass = in.readDouble();
          String imgFileName = in.readString();
           bodies[i] = new Body(int_posX, int_posY, int_posX, int_velY, mass, imgFileName);
        }
        return  bodies;
    }
}
