import entities.Audio;
import entities.ElementoMultimediale;
import entities.Immagine;
import entities.Video;

import java.util.Scanner;

public class Main {

    // Sezione Costruttori
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome on board!");

        // creo un array che può contenere 5 elementi
        ElementoMultimediale[] elementi = new ElementoMultimediale[5];

        // Inizializzazione degli elementi multimediali con valori letti da tastiera come richiesto dall'esercizio
        for (int i = 0; i < 5; i++) {
            System.out.println("Dimmi cosa vuoi creare,su (1: Immagine, 2: Audio, 3: Video):");
            int tipo = scanner.nextInt();
            scanner.nextLine();

            if (tipo < 1 || tipo > 3) {
                System.out.println(" Svegliati e selezionane uno tra i tre.");
                elementi[i] = null;
                continue;
            }

            System.out.println("Inserisci il titolo:");
            String titolo = scanner.nextLine();

            switch (tipo) {
                case 1: // Immagine
                    System.out.println("Inserisci luminosità:");
                    int luminositaImg = scanner.nextInt();
                    elementi[i] = new Immagine(titolo, luminositaImg);
                    break;
                case 2: // Audio
                    System.out.println("Inserisci durata:");
                    int durataAudio = scanner.nextInt();
                    System.out.println("Inserisci volume:");
                    int volumeAudio = scanner.nextInt();
                    elementi[i] = new Audio(titolo, durataAudio, volumeAudio);
                    break;
                case 3: // Video
                    System.out.println("Inserisci durata:");
                    int durataVideo = scanner.nextInt();
                    System.out.println("Inserisci volume:");
                    int volumeVideo = scanner.nextInt();
                    System.out.println("Inserisci luminosità:");
                    int luminositaVideo = scanner.nextInt();
                    elementi[i] = new Video(titolo, durataVideo, volumeVideo, luminositaVideo);
                    break;
                default:
                    System.out.println("Tipo non valido. Chiudi tutto e vattene a dormire.");
                    elementi[i] = null;
            }
        }

        while (true) {
            // Mostra il menu all'utente
            mostraMenu();

            // Legge l'input dell'utente
            int scelta = scanner.nextInt();

            if (scelta == 0) {
                // esce dal programma se l'utente sceglie "Esci"
                System.out.println("Ciao,passa una buona giornata.");
                scanner.close();
                break;
            } else if (scelta >= 1 && scelta <= 5) {
                // Esegue l'azione basata sulla scelta dell'utente
                ElementoMultimediale elemento = elementi[scelta - 1];
                if (elemento != null) {
                    if (elemento instanceof Immagine) {
                        System.out.println("Ecco l'immagine:");
                        ((Immagine) elemento).show();
                    } else if (elemento instanceof Audio) {
                        System.out.println("Ecco l'audio:");
                        ((Audio) elemento).play();
                    } else if (elemento instanceof Video) {
                        System.out.println("Ecco il video:");
                        ((Video) elemento).play();
                    }
                } else {
                    System.out.println("Dove vuoi andare?");
                }
            } else {
                System.out.println("Scelta non valida. Try againnn.");
            }
        }
    }

    // Sezione Metodi

    // metodo per mostrare il menu all'utente
    private static void mostraMenu() {
        System.out.println("Scegli cosa riprodurre:");
        System.out.println("0. Esci");
        System.out.println("1. Elemento 1");
        System.out.println("2. Elemento 2");
        System.out.println("3. Elemento 3");
        System.out.println("4. Elemento 4");
        System.out.println("5. Elemento 5");

    }
}
