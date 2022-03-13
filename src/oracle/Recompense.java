package oracle;

class Recompense implements RecompenseInterface{

    private int compteur;
    
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

    //action du feu

    public void ramasserDuBois(String oracle,String croyant){
        int nbBoisRand = 1 + (int) (Math.random() * ((10 - 1) + 1));
        for(int i=1;i<=nbBoisRand;i++){
            ++compteur;
            System.out.println(".."+compteur+" bois");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Fin du ramassage. Bois ramasses : " + compteur);
    }
}
