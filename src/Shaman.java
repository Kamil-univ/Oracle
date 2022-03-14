import oracle.Oracle;

import java.sql.SQLOutput;

import static java.lang.Math.random;

public class Shaman {
    private final String croyant;

    Shaman(String croyant) {

        this.croyant = croyant;
    }

    //methode danseurs masques

    public void actionDanseurMasque() {
        System.out.println("Le " + croyant + " ecoute les chants des totems ");
        System.out.println("Le " + croyant + " regarde les rituels autour des totems");

        // quelques fois, le shaman donne des conseils

        // le int donne également le nombre de conseils que le shaman va donner
        int quelquesFois = 1 + (int) (Math.random() * ((10 - 1) + 1));
        if (quelquesFois % 2 == 0) {
            System.out.println("Le shaman va donner "+quelquesFois+" conseil(s)");
            for(int i=0;i<quelquesFois;i++){
                Oracle.getInstance().getConseilInterface().conseilsSansRaison("Le shaman", croyant);

            }

        }else{
            System.out.println("Pas de conseil pour cette fois...");
        }

    }
}