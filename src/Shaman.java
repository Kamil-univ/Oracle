import oracle.Oracle;

public class Shaman {
    private final String croyant;

    Shaman(String croyant) {
        this.croyant = croyant;
    }

    public void actionDanseurMasque() {
        System.out.println("Le rituel commence..." + croyant + " s'active et danse en chantant autour des totems des animaux sacres");
        System.out.println("Les totems silencieux ecoutent les chants de " + croyant);

        int quelquesFois = 1 + (int) (Math.random() * ((20 - 1) + 1));
        int nombreDeConseil = 1 + (int) (Math.random() * ((5 - 1) + 1));
        String conseils = " conseils";
        if (quelquesFois % 2 == 0) {
            System.out.println("Le shaman entre en trans... \n");
            if (nombreDeConseil == 1) conseils = conseils.substring(0, 8);
            System.out.println("Il semble recevoir " + nombreDeConseil + conseils);
            for (int i = 0; i < nombreDeConseil; i++) {
                Oracle.getInstance().getConseilInterface().conseilsSansRaison("Le shaman", croyant);
            }

        } else {
            System.out.println("En essayant d'entrer en trans le Shaman convulse et fait une crise d'epilepsie... \n");
            System.out.println("Les chants n'ont pas convaincu les totems cette fois-ci... \n");
            System.out.println("Pas de conseil pour cette fois...");
        }
    }
}