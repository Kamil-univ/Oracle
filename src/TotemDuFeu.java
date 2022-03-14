import oracle.Oracle;

public class TotemDuFeu {

    private final String croyant;

    TotemDuFeu(String croyant) {

        this.croyant = croyant;
    }




    //methode pour la tribu du feu

    public void actionDuFeu() {
        System.out.println(croyant + " danse autour du feu de camp");
        Oracle.getInstance().getMiracleInterface().demanderLaPluie("Totem du Feu",croyant);
        System.out.println(croyant + " part chercher du bois");
        Oracle.getInstance().getRecompenseInterface().ramasserDuBois("Totem du Feu",croyant);



    }

}
