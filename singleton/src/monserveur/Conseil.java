package monserveur;

public final  class Conseil extends Service implements ConseilInterface{

    public Conseil(){
    }

    public void methodeA(){

        MonServeur.getInstance().defaultPrint("A");
    }

    public void methodeB(){

        MonServeur.getInstance().publicPrint("B");
    }
}