package monserveur;

public final class Miracle extends Service implements MiracleInterface{

    public Miracle(){
    }

    public void methodeC(){

        MonServeur.getInstance().defaultPrint("C");
    }

    public void methodeD(){

        MonServeur.getInstance().publicPrint("D");
    }

    public void methodeE(){

        MonServeur.getInstance().getServiceAInterface().methodeA();
    }

    public void methodeF(){

        MonServeur.getInstance().getServiceA().methodeB();
    }
}
