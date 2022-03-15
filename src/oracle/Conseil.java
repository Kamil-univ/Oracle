package oracle;

public final class Conseil implements ConseilInterface {

    @Override
    public void conseilsSansRaison(String oracle, String croyant) {
        System.out.println(oracle + " offre un conseil pour " + croyant + " sans aucune raison.");
    }

    @Override
    public void conseilSurdemande(String demande, String oracle, String croyant) {
        System.out.println(croyant + " demande un conseil pour " + oracle);
        System.out.println("''" + demande + "''\n");
        System.out.println(oracle + " offre un conseil pour " + croyant + " sur demande.");
    }

    public void conseilApresEcoute(String oracle, String croyant) {
        System.out.println(oracle + " offre un conseil pour " + croyant + " apr�s avoir �cout�.");
    }
}
