public class Studente {

    /*
     * TODO:
     * definire variabili:
     * - nome
     * - cognome
     * - matricola (intero)
     * 
     * definire un costruttore
     * 
     * definire metodo per ottenere i dettagli
     * nella forma: nome cognome - matricola: matricola
     * 
     * definire toString per stampare i valori
     */

    private String name;
    private String lastName;

    private int mat;

    private boolean promosso;

    public Studente(String name, String lastname, int mat) {

        setName(name);
        setLastName(lastname);
        setMat(mat);
    }

    public String getName() {

        return name;
    }

    public void setName(String name) {

        this.name = name;
    }

    public String getLastName() {

        return lastName;
    }

    public void setLastName(String lastName) {

        this.lastName = lastName;
    }

    public int getMat() {

        return mat;
    }

    public void setMat(int mat) {

        if (mat <= 0) {

            System.out.println("[mat: " + mat + "] Attenzione: valore mat NON VALIDO!");

            return;
        }

        this.mat = mat;
    }

    public boolean isPromosso() {

        return promosso;
    }

    public void setPromosso(boolean isPromosso) {

        this.promosso = isPromosso;
    }

    public String getDetails() {

        return getName() + " " + getLastName() + " - matricola: " + getMat();
    }

    @Override
    public String toString() {

        return "Studente: " + getDetails();
    }
}
