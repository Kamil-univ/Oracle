public class TribuDuFeu {

    private final EspritDeLaNuit espritDeLaNuit;

    public TribuDuFeu(String name) {

        this.espritDeLaNuit = new EspritDeLaNuit(name);
    }

    public EspritDeLaNuit communiquerAvecEspritDeLaNuit() {

        return espritDeLaNuit;
    }
}
