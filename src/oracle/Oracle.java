package oracle;

public final class Oracle {
    private static final Oracle instance = new Oracle();
    private final Conseil conseil;
    private final Ecoute ecoute;
    private final Miracle miracle;
    private final Recompense recompense;
    private String name;

    private Oracle() {
        this.conseil = new Conseil();
        this.ecoute = new Ecoute();
        this.miracle = new Miracle();
        this.recompense = new Recompense();
    }

    public static Oracle getInstance() {
        return instance;
    }

    Conseil getAdvice() {
        return conseil;
    }

    Recompense getRecompense() {
        return recompense;
    }

    public ConseilInterface getConseilInterface() {
        return conseil;
    }

    public EcouteInterface getEcouteInterface() {
        return ecoute;
    }

    public MiracleInterface getMiracleInterface() {
        return miracle;
    }

    public RecompenseInterface getRecompenseInterface() {
        return recompense;
    }


}
