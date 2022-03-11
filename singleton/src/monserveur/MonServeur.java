package monserveur;

public class MonServeur {

    private static MonServeur instance = new MonServeur();
    private ServiceA serviceA;
    private ServiceB serviceB;

    private MonServeur() {

        serviceA = new ServiceA();
        serviceB = new ServiceB();
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

    public ServiceAInterface getServiceAInterface() {

        return (ServiceAInterface)serviceA;
    }

    public ServiceBInterface getServiceBInterface() {

        return (ServiceBInterface)serviceB;
    }

    ServiceA getServiceA() {

        return serviceA;
    }
}