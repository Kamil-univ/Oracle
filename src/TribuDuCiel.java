public class TribuDuCiel {

    private final Commandante commandante;

    public TribuDuCiel(String name) {

        this.commandante = new Commandante(name);
    }

    public Commandante communiquerAvecCommandante() {

        return commandante;
    }
}
