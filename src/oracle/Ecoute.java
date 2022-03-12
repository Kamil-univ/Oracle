package oracle;

class Ecoute implements EcouteInterface{
	
    @Override
    public void ecouterSansRepondre(String besoins, String oracle, String croyant) {
        System.out.println("Le " + croyant + " prie pour " + oracle);
        System.out.println(oracle + " écoute les prières de " + croyant + ", mais ne répond pas.");
    }

    @Override
    public void ecouterEtRepondre(String besoins, String oracle, String croyant) {
        System.out.println("Le " + croyant + " prie pour " + oracle);
        System.out.println(oracle + " écoute les prières de " + croyant + ".");
        Oracle.getInstance().getAdvice().conseilApresEcoute(oracle, croyant);
    }

    @Override
    public void ecouterEtRealiserMiracle(String besoins, String oracle, String croyant) {
        System.out.println("Le " + croyant + " prie pour " + oracle);
        System.out.println(oracle + " écoute les prières de " + croyant + ", et leur répond..");
        Oracle.getInstance().getMiracleInterface().realiserMiracle(oracle, croyant);
    }

    @Override
    public void ecouterEtPunir(String confession, String oracle, String croyant) {
        System.out.println("Le " + croyant + " prie pour " + oracle);
        System.out.println(oracle + " écoute la confession " + croyant + ", et prépare une punition.");
        Oracle.getInstance().getRecompense().PunitionMeritee(oracle, croyant);
    }
}
