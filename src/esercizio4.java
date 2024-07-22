import java.util.Scanner;
public class esercizio4 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("---------- Esercizio 4 ----------");
        System.out.println("Ciao Utente,inserisci la prima stringa:");
        String stringa1 = scanner.nextLine();
        System.out.println("Ciao Utente,inserisci la seconda stringa:");
        String stringa2 = scanner.nextLine();
        System.out.println("Ciao Utente,inserisci la terza stringa:");
        String stringa3 = scanner.nextLine();

        System.out.println("Ciao Utente, in ordine di inserimento ecco le tue stringhe: " + stringa1 + " " + stringa2 + " " + stringa3);
        System.out.println("Ciao Utente, in ordine inverso ecco le tue stringhe: " + stringa3 + " " + stringa2 + " " + stringa1);
    }

}
