package exercice;

import java.util.Random;

public class NbPremier {
    private int[] entiers;  // Tableau pour stocker les entiers
    private int capacity;   // Capacité maximale de la collection
    private int size;       // Nombre d'entiers actuellement dans la collection

    public NbPremier(int capacity) {
        this.capacity = capacity;
        this.entiers = new int[capacity];
        this.size = 0;
    }

    public void add(int entier) {
        if (size < capacity) {
            entiers[size] = entier;
            size++;
        } else {
            System.out.println("La collection est pleine. Impossible d'ajouter plus d'entiers.");
        }
    }

    public void initRandom(int n, int m) {
        Random rand = new Random();
        for (int i = 0; i < n; i++) {
            int randomEntier = rand.nextInt(m) + 1; // Génère un entier aléatoire entre 1 et m
            add(randomEntier);
        }
    }

    private boolean isPrime(int p) {
        if (p <= 1) {
            return false;
        }
        if (p == 2) {
            return true;
        }
        if (p % 2 == 0) {
            return false;
        }
        for (int i = 3; i * i <= p; i += 2) {
            if (p % i == 0) {
                return false;
            }
        }
        return true;
    }

    public void printPrimes() {
        for (int i = 0; i < size; i++) {
            if (isPrime(entiers[i])) {
                System.out.print(entiers[i] + " ");
            }
        }
        System.out.println(); // Pour sauter une ligne à la fin
    }

    public static void main(String[] args) {
        NbPremier collection = new NbPremier(100);

        collection.initRandom(100, 100); // Initialise avec 100 entiers aléatoires entre 1 et 100

        System.out.println("Nombres premiers dans la collection :");
        collection.printPrimes();
    }
}

