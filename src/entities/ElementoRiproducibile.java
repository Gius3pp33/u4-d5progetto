package entities;

import interfaces.player;

// Classe astratta per elementi riproducibili
public abstract class ElementoRiproducibile extends ElementoMultimediale implements player {
    // Variabile di istanza
    private int durata; // Durata dell'elemento riproducibile

    // Sezione Costruttori
    public ElementoRiproducibile(String titolo, int durata) {
        super(titolo); // Inizializza il titolo
        if (isDurataValida(durata)) {
            this.durata = durata; // Inizializza la durata
        } else {
            this.durata = 0; // imposto una durata predefinita se non valida
        }
    }

    // Sezione Metodi
    public int getDurata() {
        return durata; // Restituisce la durata
    }

    // Metodo per controllare la validità della durata
    private boolean isDurataValida(int durata) {
        return durata > 0; // Restituisce true se la durata è positiva, altrimenti false
    }
}
