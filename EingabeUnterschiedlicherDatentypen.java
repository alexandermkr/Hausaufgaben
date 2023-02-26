package Hausaufgaben;

import static jsTools.Input.*;

public class EingabeUnterschiedlicherDatentypen {

    public static void main(String[] args) {
        int i;
        double d;
        char c;
        String s;

        System.out.print("Bitte geben Sie eine Integer-Zahl ein:");
        i = readInteger();
        i = readInteger("Auch so kann man nach einer Integer Zahl fragen:");
        System.out.println("Danke:" + i);

        // Auch so kann man Texte zur Eingabe angeben:
        i = readInteger("Ihre Eingabe fuer ein int:");
        System.out.println("Danke:" + i);

        System.out.print("Bitte geben Sie eine Double-Zahl ein:");
        d = readDouble();
        System.out.println("Danke:" + d);

        System.out.print("Bitte geben Sie einen Character ein:");
        c = readChar();
        System.out.println("Danke:" + c);

        System.out.print("Bitte geben Sie einen Text (String) ein:");
        s = readLine();
        System.out.println("Danke:" + s);

        System.out.println("Ende des Programms");
    }
}
