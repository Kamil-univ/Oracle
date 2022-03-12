public class PiedsNoirs {

    private final EspritDeLaNuit espritDeLaNuit;

    public PiedsNoirs(String name) {
        this.espritDeLaNuit = new EspritDeLaNuit(name);
    }

    public EspritDeLaNuit communiquerAvecEspritDeLaNuit() {
        return espritDeLaNuit;
    }
}
