package oracle;

public final class Miracle extends Service implements MiracleInterface{

    public Miracle(){
    }

    public void realiserMiracle(){

        Oracle.getInstance().defaultPrint("C");
    }
}
