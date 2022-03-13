public class DanseursMasques {

    private final EspritDeLaNuit espritDeLaNuit;

    public DanseursMasques(String name) {

        this.espritDeLaNuit = new EspritDeLaNuit(name);
    }

    public EspritDeLaNuit communiquerAvecEspritDeLaNuit() {

        return espritDeLaNuit;
    }
}
