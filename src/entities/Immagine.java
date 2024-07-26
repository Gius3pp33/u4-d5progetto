package entities;

// classe per le immagini
public class Immagine extends ElementoMultimediale {
    // Sezione Costruttori
    public Immagine(String titolo) {
        super(titolo);
    }

    // Sezione Metodi
    public void mostra() {
        System.out.println("Immagine: " + getTitolo()); // mostro il titolo dell'immagine
    }
}
