package impiccato;
import java.util.Scanner;

public class Play {
	    
	    private HangMan h;
	    private Scanner s;

	    public Play() {
	        h = new HangMan();
	        s = new Scanner(System.in);
	    }

	    public void input() {
	        while (h.getTentativi() > 0) {
	            output();
	            System.out.println("Inserisci una lettera:");
	            String in = s.nextLine();

	            if (in.length() == 1) {
	                char c = in.toLowerCase().charAt(0);

	                if (h.aggiornaMaschera(c) == false) {
	                    h.decrementaTentativi();
	                    System.out.println("Lettera errata! Tentativi rimasti: " + h.getTentativi());
	                }
	            }

	            if (h.parolaCompletata()) {
	                output();
	                System.out.println("Hai vinto!");
	                return;
	            }
	        }
	        System.out.println("Hai perso! La parola era: " + h.getParola());
	    }

	    public void output() {
	        for (int i = 0; i < h.getParola().length(); i++) {
	            if (h.getMask()[i] == 1) {
	            	
	                System.out.print(h.getParola().charAt(i));
	            } else {
	            	
	                System.out.print("_");
	            }
	        }
	        
	        System.out.println();
	    }
	}		
