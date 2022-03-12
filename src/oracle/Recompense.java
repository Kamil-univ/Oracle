package oracle;

class Recompense implements RecompenseInterface{
    
	@Override
    public void PunitionSansRaison(String oracle, String croyant) {
        System.out.println(oracle + " punit " + croyant + " sans raison.");
    }

    public void PunitionMeritee(String oracle, String croyant) {
        System.out.println(oracle + " punit " + croyant + " pour leur mauvaise action.");
    }

    public void echangerMiracleEtPunition(String oracle, String croyant) {
        System.out.println(oracle + " a été demandé d'offrir un miracle et une punition par le " + croyant);
        System.out.println(oracle + " échange un miracle contre une punition avec le " + croyant);
        Oracle.getInstance().getMiracleInterface().realiserMiracle(oracle, croyant);
    }
}
