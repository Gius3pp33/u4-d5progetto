package entities;

import interfaces.player;

// Classe per audio
public class Audio extends ElementoMultimediale implements player {
    private int durata;
    private int volume;

    // Costruttore
    public Audio(String titolo, int durata, int volume) {
        super(titolo);
        this.durata = durata > 0 ? durata : 1;
        this.volume = volume >= 0 ? volume : 0; //imposto i valori di default
    }

    // Metodo per riprodurre l'audio
    @Override
    public void play() {
        for (int i = 0; i < durata; i++) {
            System.out.println(getTitolo() + " " + "!".repeat(volume));
        }
    }
}
