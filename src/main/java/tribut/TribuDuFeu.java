package tribut;

public class TribuDuFeu {

    private final TotemDuFeu totemDuFeu;

    public TribuDuFeu(String name) {
        this.totemDuFeu = new TotemDuFeu(name);
    }

    public TotemDuFeu communiquerAvecTotemDuFeu() {
        return totemDuFeu;
    }
}
