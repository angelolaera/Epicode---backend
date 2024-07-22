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


        System.out.println("Esercizio perimetroTriangolo");
        System.out.println("Inserisci primo valore:");
        double val1 = Double.parseDouble(scanner.nextLine());
        System.out.println("Inserisci secondo valore:");
        double val2 = Double.parseDouble(scanner.nextLine());
        System.out.println("Inserisci terzo valore:");
        double val3 = Double.parseDouble(scanner.nextLine());
        System.out.println("L'area del nostro triangoolo è:" + areaTriangolo(val1,val2,val3));

    }

    public static double perimetroRettangolo(double lato1, double lato2){
        return (lato1 + lato2)*2;
    }

    public static int pariDispari (int num1){
        return num1 % 2;
    }

    public static double areaTriangolo(double l1, double l2, double l3) {
        double p = (l1 + l2 + l3) / 2;
        return Math.sqrt(p * (p - l1) * (p - l2) * (p - l3));
    }
}
