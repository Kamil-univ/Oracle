import oracle.Oracle;

import java.sql.SQLOutput;

import static java.lang.Math.random;

public class EspritDeLaNuit {
    private final String croyant;

    EspritDeLaNuit(String croyant) {

        this.croyant = croyant;
    }

    public void demanderConseil(String request) {
        Oracle.getInstance().getConseilInterface().conseilSurdemande(request, "L'esprit de la nuit", croyant);
    }

    public void conseilsSansRaison() {
        Oracle.getInstance().getConseilInterface().conseilsSansRaison("L'esprit de la nuit", croyant);
    }

    public void ecouterSansRepondre(String request) {

        Oracle.getInstance().getEcouteInterface().ecouterSansRepondre(request, "L'esprit de la nuit", croyant);
    }

    public void ecouterEtRepondre(String request) {
        Oracle.getInstance().getEcouteInterface().ecouterEtRepondre(request, "L'esprit de la nuit", croyant);
    }

    public void ecouterEtRealiserMiracle(String request) {
        Oracle.getInstance().getEcouteInterface().ecouterEtRealiserMiracle(request, "L'esprit de la nuit", croyant);
    }

    public void realiserMiracle(String request) {
        System.out.println("Le " + croyant + " a une demande : " + request);
        Oracle.getInstance().getMiracleInterface().realiserMiracle("L'esprit de la nuit", croyant);
    }

    //Methode Tribu du ciel

    public void actionDuCiel(String request) {

        Oracle.getInstance().getConseilInterface().conseilSurdemande(request, "La commandante", croyant);
        System.out.println("Le " + croyant + " va demander demander un miracle a la commandante, si elle est" +
                " de bonne humeur alors elle va le realiser  ");

        // Bonne humeur de la commandante
        int humeur = 5 + (int) (Math.random() * ((10 - 5) + 1));
        if (humeur % 2 == 0) {
            System.out.println("Une bonne nouvelle semble arriver ...");
            Oracle.getInstance().getMiracleInterface().realiserMiracle("La commandante", croyant);

        } else {
            System.out.println("Mauvaise nouvelle ! La commandante n'est pas de bonne humeur");
        }


    }


    //methode pour la tribu du feu

    public void actionDuFeu() {
        System.out.println("Le " + croyant + " danse autour du feu de camp");
        Oracle.getInstance().getMiracleInterface().demanderLaPluie("Totem du Feu",croyant);
        System.out.println("Le " + croyant + " part chercher du bois");
        Oracle.getInstance().getRecompenseInterface().ramasserDuBois("Totem du Feu",croyant);



    }


}
