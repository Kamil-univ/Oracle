package oracle;

class Conseil implements ConseilInterface {
	
    @Override
    public void conseilsSansRaison(String oracle, String croyant) {
        System.out.println(oracle + " offre un conseil � " + croyant + " sans aucune raison.");
    }

    @Override
    public void conseilSurdemande(String demande, String oracle, String croyant) {
        System.out.println(croyant + " demande un conseil � " + oracle);
        System.out.println(oracle + " offre un conseil � " + croyant + " sur demande.");
    }

    public void conseilApresEcoute(String oracle, String croyant) {
        System.out.println(oracle + " offre un conseil � " + croyant + " apr�s avoir �cout�.");
    }
}
