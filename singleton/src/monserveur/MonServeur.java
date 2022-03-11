package monserveur;

public class MonServeur {

    private static MonServeur instance = new MonServeur();
    private Conseil serviceA;
    private Miracle serviceB;

    private MonServeur() {

        serviceA = new Conseil();
        serviceB = new Miracle();
    }

    public static MonServeur getInstance() {
        return instance;
    }


    void defaultPrint(String m) {

        System.out.println("defaultPrint : " + m);
    }

    public void publicPrint(String m) {

        System.out.println("publicPrint : " + m);
    }

    public ConseilInterface getServiceAInterface() {

        return (ConseilInterface)serviceA;
    }

    public MiracleInterface getServiceBInterface() {

        return (MiracleInterface)serviceB;
    }

    Conseil getServiceA() {

        return serviceA;
    }
}