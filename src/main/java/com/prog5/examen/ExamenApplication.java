package com.prog5.examen;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class ExamenApplication {

    public static void main(String[] args) {
        SpringApplication.run(ExamenApplication.class, args);
    }

    @Bean
    public CommandLineRunner run() {
        return args -> {

            Utilisateur utilisateur = new Utilisateur("Fifaliana", 50.0);

			MachineACafe machineACafe = new MachineACafe(4, 80, true);

            Paiement paiement = new PaiementImpl();

            String typeCafe = utilisateur.choisirCafe("Café au lait ");

            machineACafe.verifierStock();

            String cafePrepare = machineACafe.preparerCafe(typeCafe);

            if (cafePrepare != null) {
                boolean paiementReussi = utilisateur.payer(paiement, 2.5);

                if (paiementReussi) {
                    utilisateur.recevoirCafe(cafePrepare);
                }
            }
        };
    }
}
