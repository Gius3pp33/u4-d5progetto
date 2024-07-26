import entities.Audio;
import entities.Immagine;

import java.util.Scanner;

public class Main {

    // Sezione Costruttori
    public static void main(String[] args) {
        // Scanner per leggere l'input dell'utente
        Scanner scanner = new Scanner(System.in);

        // creazione degli oggetti
        Immagine img = new Immagine("Immagine");
        Audio audio = new Audio("Ciaooo", 3, 5);

        while (true) {
            // mostra il menu all'utente
            mostraMenu();

            // legge l'input dell'utente
            int scelta = scanner.nextInt();

            // esegue l'azione basata sulla scelta dell'utente
            eseguiScelta(scelta, img, audio);

            // esce dal programma se l'utente sceglie "Esci"
            if (scelta == 0) {
                System.out.println("Uscita dal programma.");
                scanner.close();
                break;
            }
        }
    }

    // Sezione Metodi

    // Metodo per mostrare il menu all'utente
    private static void mostraMenu() {
        System.out.println("Scegli cosa riprodurre:");
        System.out.println("0. Esci");
        System.out.println("1. Immagine");
        System.out.println("2. Audio");

    }

    // Metodo per eseguire l'azione basata sulla scelta dell'utente
    private static void eseguiScelta(int scelta, Immagine img, Audio audio) {
        switch (scelta) {
            case 0:
                // Esci dal programma
                break;

            case 1:
                img.mostra(); // Mostra l'immagine
                break;
            case 2:
                audio.play(); // Riproduce l'audio
                break;

            default:
                System.out.println("Scelta non valida. Try againnn.");
        }
    }
}
