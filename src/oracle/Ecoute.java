package oracle;

class Ecoute implements EcouteInterface{
	
    @Override
    public void ecouterSansRepondre(String besoins, String oracle, String croyant) {
        System.out.println("Le " + croyant + " prie pour " + oracle);
        System.out.println(oracle + " �coute les pri�res de " + croyant + ", mais ne r�pond pas.");
    }

    @Override
    public void ecouterEtRepondre(String besoins, String oracle, String croyant) {
        System.out.println("Le " + croyant + " prie pour " + oracle);
        System.out.println(oracle + " �coute les pri�res de " + croyant + ".");
        Oracle.getInstance().getAdvice().conseilApresEcoute(oracle, croyant);
    }

    @Override
    public void ecouterEtRealiserMiracle(String besoins, String oracle, String croyant) {
        System.out.println("Le " + croyant + " prie pour " + oracle);
        System.out.println(oracle + " �coute les pri�res de " + croyant + ", et leur r�pond..");
        Oracle.getInstance().getMiracleInterface().realiserMiracle(oracle, croyant);
    }

    @Override
    public void ecouterEtPunir(String confession, String oracle, String croyant) {
        System.out.println("Le " + croyant + " prie pour " + oracle);
        System.out.println(oracle + " �coute la confession " + croyant + ", et pr�pare une punition.");
        Oracle.getInstance().getRecompense().PunitionMeritee(oracle, croyant);
    }
}
