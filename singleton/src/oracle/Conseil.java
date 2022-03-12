package oracle;

public final  class Conseil extends Service implements ConseilInterface{

    public Conseil(){
    }

    public void conseilSansRaison(){

        Oracle.getInstance().defaultPrint("A");
    }

    public void conseilEnFonctionDeLaDemande(){

        Oracle.getInstance().publicPrint("B");
    }
}