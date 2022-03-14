import oracle.Oracle;

import java.sql.SQLOutput;

import static java.lang.Math.random;

public class EspritDeLaNuit {
    private final String croyant;

    EspritDeLaNuit(String croyant) {

        this.croyant = croyant;
    }

    public void demanderConseil(String request) {
        Oracle.getInstance().getConseilInterface().conseilSurdemande(request, "L'Esprit de la nuit", croyant);
    }

    public void conseilsSansRaison() {
        Oracle.getInstance().getConseilInterface().conseilsSansRaison("L'Esprit de la nuit", croyant);
    }

    public void ecouterSansRepondre(String request) {

        Oracle.getInstance().getEcouteInterface().ecouterSansRepondre(request, "L'Esprit de la nuit", croyant);
    }

    public void ecouterEtRepondre(String request) {
        Oracle.getInstance().getEcouteInterface().ecouterEtRepondre(request, "L'Esprit de la nuit", croyant);
    }

    public void ecouterEtRealiserMiracle(String request) {
        Oracle.getInstance().getEcouteInterface().ecouterEtRealiserMiracle(request, "L'Esprit de la nuit", croyant);
    }

    public void realiserMiracle(String request) {
        System.out.println(croyant + " a une demande : " + request);
        Oracle.getInstance().getMiracleInterface().realiserMiracle("L'Esprit de la nuit", croyant);
    }




}
