package entities;

// classe padre
public abstract class ElementoMultimediale {
    // Variabile di istanza privata
    private String titolo;

    // Sezione Costruttori
    public ElementoMultimediale(String titolo) {
        this.titolo = titolo;
    }

    // Getter per il titolo
    public String getTitolo() {
        return titolo;
    }


}
