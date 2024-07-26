package entities;

// classe astratta per l'elemento  multimediale
public abstract class ElementoMultimediale {
    // Variabile di istanza
    private String titolo;

    // Sezione Costruttori
    public ElementoMultimediale(String titolo) {
        this.titolo = titolo; //inizializzo il titolo
    }

    // Sezione Metodi
    public String getTitolo() {
        return titolo; //restituisco il titolo
    }
}