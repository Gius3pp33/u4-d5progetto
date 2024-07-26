package entities;

import interfaces.player;

public class Video extends ElementoMultimediale implements player {
    private int durata;
    private int volume;
    private int luminosita;

    // Costruttore
    public Video(String titolo, int durata, int volume, int luminosita) {
        super(titolo);
        this.durata = durata > 0 ? durata : 1; //do valore di default a tutto
        this.volume = volume >= 0 ? volume : 0;
        this.luminosita = luminosita >= 0 ? luminosita : 1;
    }

    // Metodo per riprodurre il video
    @Override
    public void play() {
        for (int i = 0; i < durata; i++) {
            System.out.println(getTitolo() + " " + "!".repeat(volume) + "*".repeat(luminosita)); // stampo il titolo con punti esclamativi e asterischi
        }
    }
}
