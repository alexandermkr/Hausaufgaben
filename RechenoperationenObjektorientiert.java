package Hausaufgaben;
import static jsTools.Input.*;

public class RechenoperationenObjektorientiert {
    public static void main(String[] args) {

        double a;
        double b;

        a = readDouble("Zahl 1: ");
        b = readDouble("Zahl 2: ");

        calcAndPrint(a, b);
    }

    public static void calcAndPrint(double a, double b) {
        print("Summe: ", summe(a,b));
        print("Differenz: ", differenz(a,b));
        print("Produkt: ", produkt(a,b));
        print("Quotient: ", quotient(a,b));
    }

    public static double summe(double a, double b) {
        return  a + b;
    }
    public static double differenz(double a, double b) {
        return  a - b;

    }
    public static double produkt(double a, double b) {
        return a * b;
    }
    public static double quotient(double a, double b) {
        if (b == 0) {
            return 9999999;
        } else {
            return a / b;
        }
    }
    public static void print(String bezeichnung, double ergebnis ) {
        System.out.println(bezeichnung + ergebnis);
    }
}


