public class Automobile {

    /**
     * TODO:
     * 
     * definire variabili d'istanza private per marca,
     * modello e targa
     * 
     * definire un costruttore che accetti tutti
     * gli argomenti e utilizzi le proprieta'
     * (getter/setter)
     * 
     * definire le proprieta' getter/setter
     * 
     * definire un metodo per ottenere i dettagli
     * nella forma: marca modello - targa: targa
     * 
     * definire toString per stampare i valori
     * 
     * testare adeguatamente il risultato finale
     */

    private String marca;
    private String modello;
    private String targa;

    public Automobile(String marca, String modello, String targa) {

        setMarca(marca);
        setModello(modello);
        setTarga(targa);
    }

    public String getMarca() {

        return marca;
    }

    public void setMarca(String marca) {

        this.marca = marca;
    }

    public String getModello() {

        return modello;
    }

    public void setModello(String modello) {

        this.modello = modello;
    }

    public String getTarga() {

        return targa;
    }

    public void setTarga(String targa) {

        this.targa = targa;
    }

    public String getDetails() {

        return getMarca() + " " + getModello() + " - targa: " + getTarga();
    }

    @Override
    public String toString() {

        return "Automobile: " + getDetails();
    }
}
