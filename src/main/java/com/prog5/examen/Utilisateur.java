package com.prog5.examen;

public class Utilisateur {
    private String nom;
    private double solde;

    public Utilisateur(String nom, double solde) {
        this.nom = nom;
        this.solde = solde;
    }

    public boolean payer(Paiement paiement, double montant) {
        if (solde >= montant) {
            System.out.println(nom + " paie " + montant + "AR");
            solde -= montant;
            return paiement.validerPaiement(montant);
        } else {
            System.out.println(nom + " n'a pas assez de solde pour payer " + montant + " euros.");
            return false;
        }
    }

    public String choisirCafe(String typeCafe) {
        System.out.println(nom + " choisit un " + typeCafe + ".");
        return typeCafe;
    }

    public void recevoirCafe(String cafe) {
        System.out.println(nom + " reçoit un " + cafe + ".");
    }

    public double getSolde() {
        return solde;
    }
}
