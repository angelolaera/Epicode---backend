import java.util.Scanner;

public class Esercizio5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Inserisci il primo valore:");
        double baseRettangolo = Double.parseDouble(scanner.nextLine());
        System.out.println("Inserisci il secondo valore:");
        double altezzaRettangolo = Double.parseDouble(scanner.nextLine());
        System.out.println("Il perimetro del rettangolo è: " + perimetroRettangolo(baseRettangolo,altezzaRettangolo));


        System.out.println("Esercizio pariDispari");
        System.out.println("Inserisci un numero: ");
        int numero = Integer.parseInt(scanner.nextLine());
        if (pariDispari(numero)==0){
            System.out.println("Il numero è pari");
        }else{
            System.out.println("Il numero è dispari");
        }
    }

    public static double perimetroRettangolo(double lato1, double lato2){
        return (lato1 + lato2)*2;
    }

    public static int pariDispari (int num1){
        return num1 % 2;
    }

    
}
