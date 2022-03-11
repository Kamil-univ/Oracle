package monserveur;

public final class Ecoute extends Service implements EcouteInterface{


public void methodeG(){

    MonServeur.getInstance().defaultPrint("G");
}

public void methodeH(){

    MonServeur.getInstance().publicPrint("H");
}
}