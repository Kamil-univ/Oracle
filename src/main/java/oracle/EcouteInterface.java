package oracle;

public interface EcouteInterface extends Service {
    void ecouterSansRepondre(String besoins, String oracle, String croyant);
    void ecouterEtRepondre(String besoins, String oracle, String croyant);
    void ecouterEtRealiserMiracle(String besoins, String oracle, String croyant);
    void ecouterEtPunir(String besoins, String oracle, String croyant);
}
