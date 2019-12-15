public class Body {
  public double xxPos;
  public double yyPos;
  public double xxVel;
  public double yyVel;
  public double mass;
  public String imgFileName;
  public Body(double xP, double yP, double xV, double yV, double m, String img) {
    xxPos = xP;
    yyPos = yP;
    xxVel = xV;
    yyVel = yV;
    mass = m;
    imgFileName = img;
  }
  public Body(Body b) {
    xxPos = b.xxPos;
    yyPos = b.yyPos;
    xxVel = b.xxVel;
    yyVel = b.yyVel;
    mass = b.mass;
    imgFileName = b.imgFileName;
  }
  public double calcDistance(Body b){
    double dx;
    double dy;
    double r;
    dx = b.xxPos - xxPos;
    dy = b.yyPos - yyPos;
    r = Math.sqrt(dx * dx + dy * dy);
    return r;
  }
  public double calcForceExertedBy(Body b){
    double G = 6.67e-11;
    double r = calcDistance(b);
    double F = G * b.mass * mass/(r*r);
    return F;
  }
  public double calcForceExertedByX(Body b){
    double F = calcForceExertedBy(b);
    double dx = b.xxPos - xxPos;
    double r = calcDistance(b);
    return F * dx/ r;
  }
  public double calcForceExertedByY(Body b){
    double F = calcForceExertedBy(b);
    double dy = b.yyPos - yyPos;
    double r = calcDistance(b);
    return F * dy/ r;
  }
  public double calcNetForceExertedByX(Body[] bodies){
    double Fx = 0;
    for (int i=0; i<bodies.length; i+=1){
      Fx = Fx + calcForceExertedByX(bodies[i]);
      if (this.equals(bodies[i])) {
        Fx = 0;
      }
    }
    return Fx;
  }
  public double calcNetForceExertedByY(Body[] bodies){
    double Fy = 0;
    for (int i=0; i<bodies.length; i+=1){
      Fy = Fy + calcForceExertedByY(bodies[i]);
      if (this.equals(bodies[i])){
        Fy = 0;
      }
    }
    return Fy;
  }
  public void update(double dt,double Fx,double Fy){
    //Fx = b.calcNetForceExertedByX;
    //Fy = b.calcNetForceExertedByY;
    double ax = 0;
    double ay = 0;
    //double vx = 0;
    //double vy = 0;
    //double dt = 0;
    ax =  Fx/mass;
    ay = Fy/mass;
    xxVel = xxVel + dt * ax;
    yyVel = yyVel + dt * ay;
    xxPos += dt * xxVel;
    yyPos += dt * yyVel;
  }
}
