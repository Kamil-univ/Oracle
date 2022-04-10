package oracle;

import Log.LogThis;

public interface ConseilInterface extends Service{
    void conseilsSansRaison(String oracle, String croyant);
    void conseilSurdemande(String demande, String oracle, String croyant);
}
