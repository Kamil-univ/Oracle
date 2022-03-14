import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        boolean start = true;

        while (start) {
            Scanner sc = new Scanner(System.in);
            System.out.println("\n///////////////  Choisissez la tribu /////////////// "
                    + "\n"
                    + "\n*****************  1- Pieds Noirs ***************** "
                    + "\n*****************  2- Danseurs masqu�s  *****************"
                    + "\n*****************  3- Tribu du Ciel   *****************"
                    + "\n*****************  4- Tribu du Feu   *****************"
                    + "\n*****************  5- Quittez   *****************");

            int choix = sc.nextInt();
            switch (choix) {
                case 1:

                    PiedsNoirs pn = new PiedsNoirs("Pied Noir");
                    pn.communiquerAvecEspritDeLaNuit().demanderConseil("Puis-je gagner la guerre ?");
                    pn.communiquerAvecEspritDeLaNuit().ecouterEtRepondre("J'aimerais �tre prot�g�.");
                    pn.communiquerAvecEspritDeLaNuit().ecouterSansRepondre("Je suis ici juste pour parler.");
                    pn.communiquerAvecEspritDeLaNuit().ecouterEtRealiserMiracle("Je veux pouvoir voler.");
                    pn.communiquerAvecEspritDeLaNuit().realiserMiracle("Je veux pouvoir voler.");


                    break;

                case 2:

                    DanseursMasques danseursMasques = new DanseursMasques("Danseur Masque");
                    danseursMasques.communiquerAvecShaman().actionDanseurMasque();

                    break;

                case 3:

                    TribuDuCiel tribuDuCiel = new TribuDuCiel("Representant du ciel");
                    tribuDuCiel.communiquerAvecEspritDeLaNuit().actionDuCiel("Nous voulons la paix");


                    break;

                case 4:

					TribuDuFeu tribuDuFeu = new TribuDuFeu("Representant du feu");
					tribuDuFeu.communiquerAvecEspritDeLaNuit().actionDuFeu();

                    break;

                case 5:
                    return;

            }


        }
    }
}

