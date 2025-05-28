package com.prog5.examen;

import org.springframework.stereotype.Component;

@Component
public class PaiementImpl implements Paiement {
    @Override
    public boolean validerPaiement(double montant) {
        System.out.println("Paiement validé avec succès avec le montant de  " + montant+ "AR");
        return true;
    }
}
