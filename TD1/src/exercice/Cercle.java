package exercice;

public class Cercle {
  private Point centre;
  private double rayon;

  public Cercle(Point centre, double rayon) {
      this.centre = centre;
      this.rayon = rayon;
  }

  public void translate(int dx, int dy) {
      this.centre.translate(dx, dy);
  }

  public double surface() {
      return Math.PI * Math.pow(rayon, 2);
  }

  public boolean contains(Point p) {
      double distance = Math.sqrt(Math.pow(p.getX() - centre.getX(), 2) + Math.pow(p.getY() - centre.getY(), 2));
      return distance <= rayon;
  }

  public static boolean contains(Point p, Cercle... circles) {
      for (Cercle cercle : circles) {
          if (cercle.contains(p)) {
              return true;
          }
      }
      return false;
  }


}

