package hausaufgabe1;

public class buch {
    private String titel;
    private String autor;
    private int preis;
    private int seitenanzahl;

    public buch(String titel, String autor, int preis, int seitenanzahl) {
        this.titel = titel;
        this.autor = autor;
        this.preis = preis;
        this.seitenanzahl = seitenanzahl;
    }

    public String getTitel() { return titel; }
    public String getAutor() { return autor; }
    public int getPreis() { return preis; }
    public int getSeitenanzahl() { return seitenanzahl; }

    @Override
    public String toString() {
        return titel + ", " + autor + ", " + preis + " Euro, " + seitenanzahl + " Seiten";
    }
}