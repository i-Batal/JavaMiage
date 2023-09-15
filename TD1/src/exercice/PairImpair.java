package exercice;

import java.util.Scanner;

public class PairImpair {
  public static void main(String[] args) {
    try (Scanner scan = new Scanner(System.in)) {
      int nombre = scan.nextInt();
      System.out.println(nombre >= 0);
    }
  }
}
