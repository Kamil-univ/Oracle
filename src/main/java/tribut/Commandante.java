package tribut;

import oracle.Oracle;

public class Commandante {

    private final String croyant;

    Commandante(String croyant) {
        this.croyant = croyant;
    }

    public void actionDuCiel(String request) {

        Oracle.getInstance().getConseilInterface().conseilSurdemande(request, "La commandante", croyant);
        System.out.println(croyant + " va demander un miracle a la commandante, si elle est" +
                " de bonne humeur alors elle va le realiser  ");

        int humeur = 5 + (int) (Math.random() * ((10 - 5) + 1));
        if (humeur % 2 == 0) {
            System.out.println("Une bonne nouvelle semble arriver ...");
            Oracle.getInstance().getMiracleInterface().realiserMiracle("La commandante", croyant);

        } else {
            System.out.println("Mauvaise nouvelle ! La commandante n'est pas de bonne humeur");
        }
    }
}
