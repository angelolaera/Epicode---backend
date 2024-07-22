import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("---------- Esercizio 1 ----------");
        System.out.println("Ciao Utente, facciamo insieme una moltiplicazione!!");
        System.out.println("Per favore inserisci un numero:");
        int num1 = Integer.parseInt(scanner.nextLine());
        System.out.println("Ora per favore inseriscine un altro:");
        int num2 = Integer.parseInt(scanner.nextLine());
        System.out.println("Il prodotto fra i due numeri è: " + prodotto(num1, num2));

        System.out.println("---------- Esercizio 2 ----------");
        System.out.println("Ciao Utente, inserisci del testo:");
        String string = scanner.nextLine();
        System.out.println("Ciao Utente, inserisci un numero:");
        int num3 = Integer.parseInt(scanner.nextLine());
        System.out.println("Ecco cosa hai scritto: " + string + " " + num3);



    }


    public static int prodotto(int num1, int num2) {
        return num1 * num2;

    }

}



