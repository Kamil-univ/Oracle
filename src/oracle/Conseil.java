package oracle;

class Conseil implements ConseilInterface {
	
    @Override
    public void conseilsSansRaison(String oracle, String croyant) {
        System.out.println(oracle + " offre un conseil à " + croyant + " sans aucune raison.");
    }

    @Override
    public void conseilSurdemande(String demande, String oracle, String croyant) {
        System.out.println(croyant + " demande un conseil à " + oracle);
        System.out.println(oracle + " offre un conseil à " + croyant + " sur demande.");
    }

    public void conseilApresEcoute(String oracle, String croyant) {
        System.out.println(oracle + " offre un conseil à " + croyant + " après avoir écouté.");
    }
}
