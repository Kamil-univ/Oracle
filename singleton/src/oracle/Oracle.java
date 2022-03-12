package oracle;

public class Oracle {

    private static Oracle instance = new Oracle();
    private Conseil conseil;
    private Miracle miracle;
    private Ecoute ecoute;

    private Oracle() {

        conseil = new Conseil();
        miracle = new Miracle();
        ecoute = new Ecoute();
    }

    public static Oracle getInstance() {
        return instance;
    }


    void defaultPrint(String m) {

        System.out.println("defaultPrint : " + m);
    }

    public void publicPrint(String m) {

        System.out.println("publicPrint : " + m);
    }

    public ConseilInterface getConseilInterface() {

        return (ConseilInterface)conseil;
    }

    public MiracleInterface getMiracleInterface() {

        return (MiracleInterface)miracle;
    }


    public EcouteInterface getEcouteInterface() {

        return (EcouteInterface)ecoute;
    }
    
    Conseil getConseil() {

        return conseil;
    }
    
    Miracle getMiracle() {

        return miracle;
    }
    
    Ecoute getEcoute() {

        return ecoute;
    }
    
}