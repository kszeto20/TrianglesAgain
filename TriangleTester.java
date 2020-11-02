public class TriangleTester {
  public static void main (String[] args) {
    Triangle t1 = new Triangle (0.0, 0.0, 3.0, 0.0, 3.0, 4.0);

    Point a = new Point (0.0, 0.0);
    Point b = new Point (6.0, 0.0);
    Point c = new Point (6.0, 8.0);
    Triangle t2 = new Triangle (a, b, c);

    Point d = new Point (0.0, 0.0);
    Point e = new Point (2.0, 0.0);
    Point f = new Point (1.0, 1.732);
    Triangle t3 = new Triangle (d, e, f);

    Point g = new Point (1.0, 1.0);

    System.out.println(t1.getPerimeter());
    System.out.println(t2.getPerimeter());
    System.out.println(t2.getArea());
    System.out.println(t1.classify());
    System.out.println(t3.classify());

    System.out.println(t3.toString());
    System.out.println(t2.toString());
    System.out.println(t1.toString());

    t3.setVertex(0, g);
    System.out.println(t3.toString());
  }
}
