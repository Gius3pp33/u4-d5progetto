package entities;

// Classe per registrazioni audio
public class Audio extends ElementoRiproducibile {

    // Variabile di istanza
    private int volume; // Volume dell'audio

    // Sezione Costruttori
    public Audio(String titolo, int durata, int volume) {
        super(titolo, durata); // Inizializza titolo e durata
        if (isVolumeValido(volume)) {
            this.volume = volume; // Inizializza il volume
        } else {
            this.volume = 1; // imposto un volume predefinito se non valido
        }
    }

    // Sezione Metodi
    public int getVolume() {
        return volume; // Restituisce il volume
    }

    public void alzaVolume() {
        volume++; // Aumenta il volume
    }

    public void abbassaVolume() {
        if (volume > 1) volume--; // Abbassa il volume se maggiore di 1
    }

    @Override
    public void play() {
        // Ripete la stampa del titolo per la durata specificata
        for (int i = 0; i < getDurata(); i++) {
            System.out.println(getTitolo() + " " + "!".repeat(volume)); // Stampa il titolo con punti esclamativi
        }
    }

    // Metodo per controllare la validità del volume
    private boolean isVolumeValido(int volume) {
        return volume > 0; // restituisce true se il volume è positivo, altrimenti false
    }
}
