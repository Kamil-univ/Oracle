package oracle;

import java.util.Random;

public final class Miracle implements MiracleInterface{
    @Override
    public void realiserMiracle(String oracle, String croyant) {
        System.out.println(oracle + " accomplit un miracle pour " + croyant);
    }

    //le croyant va demander la pluie, il va avoir
    //une chance sur deux, grace a un nombre aleatoire
    //d'avoir la pluie qui s'abat sur lui
    public void demanderLaPluie(String oracle, String croyant){
        System.out.println("La danse demande la pluie au " + oracle);
        System.out.println("\nUne chance sur deux que la pluie tombe");
        Random rand = new Random();
        int nombreAleatoire = rand.nextInt(2 - 1 + 1) +1;
        if(nombreAleatoire %2 == 0){
            System.out.println("Hourra ! La pluie tombe sur le camp");
        }else{
            System.out.println("Surement la prochaine fois ...");
        }
    }


}
