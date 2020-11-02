public class Triangle {

  private Point v1;
  private Point v2;
  private Point v3;

  public Triangle (Point a, Point b, Point c) {
    v1 = a;
    v2 = b;
    v3 = c;
  }

  public Triangle (double x1, double y1, double x2, double y2, double x3, double y3) {
    v1 = new Point (x1, y1);
    v2 = new Point (x2, y2);
    v3 = new Point (x3, y3);
  }

  public double getPerimeter() {
    double leg1 = (v1.distanceTo(v2));
    double leg2 = (v2.distanceTo(v3));
    double leg3 = (v3.distanceTo(v1));
    return leg1 + leg2 + leg3;
  }

  public static double getArea( Point a, Point b, Point c) {
    double leg1 = a.distanceTo(b);
    double leg2 = b.distanceTo(c);
    double leg3 = c.distanceTo(a);
    double partPerim = (leg1 + leg2 + leg3) / 2;
    double areaAn = Math.sqrt(
    partPerim * (partPerim - leg1) * (partPerim - leg2) * (partPerim - leg3));
    return areaAn;
  }

  public static String classify ( Point a, Point b, Point c) {
    double leg1 = (Math.round((a.distanceTo(b)) * 1000)) / 1000;
    double leg2 = (Math.round((b.distanceTo(c)) * 1000)) / 1000;
    double leg3 = (Math.round((c.distanceTo(a)) * 1000)) / 1000;



  if ((leg1 == leg2) && (leg2 == leg3)){
    return "Equilateral";
  }
  if ((leg1 == leg2) || (leg2 == leg3)){
    return "Isosceles";
  }
  return "Scalene";
}

}
