package entities;

public class Immagine extends ElementoMultimediale {
    private int luminosita;

    // Costruttore
    public Immagine(String titolo, int luminosita) {
        super(titolo); // inizializzo il titolo dell'immagine
        this.luminosita = luminosita > 0 ? luminosita : 1; // Imposto la luminosità di default
    }

    // Metodo per mostrare l'immagine
    public void show() {
        System.out.println(getTitolo() + " " + "*".repeat(luminosita));
    }
}
