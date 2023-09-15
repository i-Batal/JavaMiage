package exercice;

public class Point {
  private int x;
  private int y;
  private static int count = 0;

  public Point() {
      this(0, 0); // Appelle le constructeur avec des valeurs par défaut
  }

  public Point(int x, int y) {
      this.x = x;
      this.y = y;
      count++;
  }

  public Point(Point other) {
      this.x = other.x;
      this.y = other.y;
      count++;
  }

  public void affichePoint() {
      System.out.println("(" + x + ", " + y + ")");
  }

  public boolean isSameAs(Point other) {
      return this.x == other.x && this.y == other.y;
  }

  public void translate(int dx, int dy) {
      this.x += dx;
      this.y += dy;
  }

  public int getX() {
      return x;
  }

  public int getY() {
      return y;
  }

  public static int getCount() {
      return count;
  }


}

