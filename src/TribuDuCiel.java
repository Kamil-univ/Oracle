public class TribuDuCiel {

    private final EspritDeLaNuit espritDeLaNuit;

    public TribuDuCiel(String name) {

        this.espritDeLaNuit = new EspritDeLaNuit(name);
    }

    public EspritDeLaNuit communiquerAvecEspritDeLaNuit() {

        return espritDeLaNuit;
    }
}
