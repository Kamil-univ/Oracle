package oracle;

public final class Ecoute extends Service implements EcouteInterface{


	public void ecouterSansReponse(){

		Oracle.getInstance().defaultPrint("G");
	}

	public void ecouterAvecReponse(){

		Oracle.getInstance().publicPrint("H");
	}

	public void ecouterAvecMiracle() {
		Oracle.getInstance().publicPrint("");
	}
}