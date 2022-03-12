import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        boolean start = true;

        while (start) {
            Scanner sc = new Scanner(System.in);
            System.out.println("\n///////////////  Choisissez la tribut /////////////// "
            					+ "\n"
            			    	+ "\n*****************  1- Pieds Noirs ***************** "
            			    	+ "\n*****************  2- Danseurs masqués  *****************" 
            			    	+ "\n*****************  3- Tribut 3   *****************" 
            					+ "\n*****************  4- Tribut 4   *****************" );
            
            int choix = sc.nextInt();
        	switch(choix) 
        	{
        		case 1: 
	        	
        			PiedsNoirs pn = new PiedsNoirs("Pieds Noirs");
        			pn.communiquerAvecEspritDeLaNuit().demanderConseil("Puis-je gagner la guerre ?");
        			pn.communiquerAvecEspritDeLaNuit().ecouterEtRepondre("J'aimerais être protégé.");
        			pn.communiquerAvecEspritDeLaNuit().ecouterSansRepondre("Je suis ici juste pour parler.");
        			pn.communiquerAvecEspritDeLaNuit().ecouterEtRealiserMiracle("Je veux pouvoir voler.");
        			pn.communiquerAvecEspritDeLaNuit().realiserMiracle("Je veux pouvoir voler.");
		

		            break;
	            
        		case 2: 
	
		            break;

        		 case 3: 
        			 
		           break;
		           
        		 case 4: 
        			 
  		           break;
        	}
        	
        	
        }
    }
}

