package com.prog5.examen;

public class MachineACafe {
    private int stockCafe;
    private int stockEau;
    private boolean etatElectrique;

    public MachineACafe(int stockCafe, int stockEau, boolean etatElectrique) {
        this.stockCafe = stockCafe;
        this.stockEau = stockEau;
        this.etatElectrique = etatElectrique;
    }


    public void verifierStock() {
        if (stockCafe < 2) {
            System.out.println("Alerte : Stock de café bas !");
        }
        if (stockEau < 10) {
            System.out.println("Alerte : Stock d'eau bas !");
        }
    }

    public String preparerCafe(String typeCafe) {
        if (!etatElectrique) {
            System.out.println("Erreur : Machine hors tension.");
            return null;
        }
        if (stockCafe <= 0) {
            System.out.println("Erreur : Plus de café disponible.");
            return null;
        }
        if (stockEau <= 0) {
            System.out.println("Erreur : Plus d'eau disponible.");
            return null;
        }

        stockCafe -= 1;
        stockEau -= 10;
        System.out.println("Préparation d'un " + typeCafe + ".");
        return typeCafe;
    }
}
