package impiccato;

public class HangMan {
    
    private String parola = "negracci";
    private int[] mask;
    private int tentativi;

    public HangMan() {
        mask = new int[parola.length()];
        tentativi = 6;
    }

    public String getParola() {
        return parola;
    }

    public int getTentativi() {
        return tentativi;
    }

    public void decrementaTentativi() {
        tentativi--;
    }

    public int[] getMask() {
        return mask;
    }

    public boolean aggiornaMaschera(char c) {
        boolean trovato = false;
        for (int i = 0; i < parola.length(); i++) {
            if (parola.charAt(i) == c) {
                mask[i] = 1;
                trovato = true;
            }
        }
        return trovato;
    }

    public boolean parolaCompletata() {
        for (int i : mask) {
            if (i == 0) 
            	return false;
        }
        return true;
    }
}

