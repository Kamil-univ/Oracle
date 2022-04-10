package tribut;

public class DanseursMasques {

    private final Shaman shaman;

    public DanseursMasques(String name) {
        this.shaman = new Shaman(name);
    }

    public Shaman communiquerAvecShaman() {
        return shaman;
    }
}
