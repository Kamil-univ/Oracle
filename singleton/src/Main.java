import oracle.*;

public class Main {

    public static void main(String args[]){

        Oracle.getInstance().publicPrint("main");
        Oracle.getInstance().getServiceAInterface().conseilSansRaison();
        Oracle.getInstance().getServiceBInterface().realiserMiracle();
        Oracle.getInstance().getServiceBInterface().methodeD();
        Oracle.getInstance().getServiceBInterface().methodeE();
        Oracle.getInstance().getServiceBInterface().methodeF();
    }
}


