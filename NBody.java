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
    public static void main(String[] args) {
      double T = Double.parseDouble(args[0]);
      double dt = Double.parseDouble(args[1]);
      String filename = args[2];
      double radius = readRadius(filename);
      Body[] bodies = readBodies(filename);
      int N = bodies.length;
      StdDraw.setScale(-radius, radius);
      StdDraw.clear();
      StdDraw.picture(0, 0, "images/starfield.jpg");
      for (Body b:bodies){
          b.draw();
      }
      StdDraw.enableDoubleBuffering();

      double time = 0;
      while (time < T) {
        double[] xForces = new double[N];
        double[] yForces = new double[N];
        for (int i = 0; i < N; i++) {
          xForces[i] = bodies[i].calcNetForceExertedByX(bodies);
          yForces[i] = bodies[i].calcNetForceExertedByY(bodies);
        }
        for (int i = 0; i < N; i++) {
          bodies[i].update(dt, xForces[i], yForces[i]);
        }
        StdDraw.picture(0, 0, "images/starfield.jpg");
        for (Body b: bodies) {
          b.draw();
        }
        StdDraw.show();
        StdDraw.pause(10);
        time += dt;
      }
      StdOut.printf("%d\n", bodies.length);
      StdOut.printf("%.2e\n", radius);
      for (int i = 0; i < bodies.length; i++) {
		    StdOut.printf("%11.4e %11.4e %11.4e %11.4e %11.4e %12s\n",
		                  bodies[i].xxPos, bodies[i].yyPos, bodies[i].xxVel,
		                  bodies[i].yyVel, bodies[i].mass, bodies[i].imgFileName);
		}


    }
}
