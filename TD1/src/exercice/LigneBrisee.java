package exercice;

public class LigneBrisee {
  private Point[] points; // Tableau pour stocker les points
  private int capacity;   // Capacité maximale de la ligne brisée
  private int size;       // Nombre de points actuellement sur la ligne brisée

  public LigneBrisee(int capacity) {
      this.capacity = capacity;
      this.points = new Point[capacity];
      this.size = 0;
  }

  public void add(Point point) {
      if (size < capacity) {
          points[size] = point;
          size++;
      } else {
          System.out.println("La ligne brisée est pleine. Impossible d'ajouter plus de points.");
      }
  }

  public int pointCapacity() {
      return capacity;
  }

  public int nbPoints() {
      return size;
  }

  public boolean contains(Point pointToCheck) {
      for (Point point : points) {
          if (point != null && point.isSameAs(pointToCheck)) {
              return true;
          }
      }
      return false;
  }

}

