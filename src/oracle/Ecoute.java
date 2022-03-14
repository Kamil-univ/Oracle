package oracle;

public final class Ecoute implements EcouteInterface {

    @Override
    public void ecouterSansRepondre(String besoins, String oracle, String croyant) {
        System.out.println(croyant + " prie pour " + oracle);
        System.out.println("''" + besoins + "''\n");
        System.out.println(oracle + " Ecoute les prieres de " + croyant + ", mais ne repond pas.");
    }

    @Override
    public void ecouterEtRepondre(String besoins, String oracle, String croyant) {
        System.out.println(croyant + " prie pour " + oracle);
        System.out.println("''" + besoins + "''\n");
        System.out.println(oracle + " Ecoute les pri�res de " + croyant + ".");
        Oracle.getInstance().getAdvice().conseilApresEcoute(oracle, croyant);
    }

    @Override
    public void ecouterEtRealiserMiracle(String besoins, String oracle, String croyant) {
        System.out.println(croyant + " prie pour " + oracle);
        System.out.println("''" + besoins + "''\n");
        System.out.println(oracle + " ecoute les prieres de " + croyant + ", et leur repond..");
        Oracle.getInstance().getMiracleInterface().realiserMiracle(oracle, croyant);
    }

    @Override
    public void ecouterEtPunir(String confession, String oracle, String croyant) {
        System.out.println(croyant + " prie pour " + oracle);
        System.out.println("''" + confession + "''\n");

        System.out.println(oracle + " ecoute la confession " + croyant + ", et prepare une punition.");
        Oracle.getInstance().getRecompense().PunitionMeritee(oracle, croyant);
    }


}
