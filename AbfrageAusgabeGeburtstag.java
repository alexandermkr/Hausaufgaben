package Hausaufgaben;

import static jsTools.Input.*;

public class AbfrageAusgabeGeburtstag {

    public static void main(String[] args) {

        int d;
        int m;
        int y;
        int c;
        int w;

        //Setzen der Variablen
        d = readInteger("An welchem Tag bist du geboren?: ");
        m = readInteger("An welchem Monat bist du geboren?: ");
        y = readInteger("In welchem Jahr wurdest du geboren?: ");


        if (d >= 1 && d <= 31 && m >= 1 && m <= 12 && String.valueOf(y).length() == 4) {

            //Verarbeitung der Monatseingabe
            switch (m) {
                case 1:
                    m = 13;
                    y = y - 1;
                    break;
                case 2:
                    m = 14;
                    y = y - 1;
                    break;
                default:
                    break;
            }

            //Berechnung
            c = y / 100;
            y = y % 100;

            w = (d + (26 * (m + 1) / 10) + ((5 * y) / 4) + (c / 4) + (5 * c) - 1) % 7;

            //Ausgaben
            System.out.print("Jahr im Jahrhundert: " + y + " ");
            System.out.println("Jahrhundert: " + c);
            switch (w) {
                case 0:
                    System.out.println("Du bist an einem Sonntag geboren!");
                    break;
                case 1:
                    System.out.println("Du bist an einem Montag geboren!");
                    break;
                case 2:
                    System.out.println("Du bist an einem Dienstag geboren!");
                    break;
                case 3:
                    System.out.println("Du bist an einem Mittwoch geboren!");
                    break;
                case 4:
                    System.out.println("Du bist an einem Donnerstag geboren!");
                    break;
                case 5:
                    System.out.println("Du bist an einem Freitag geboren!");
                    break;
                case 6:
                    System.out.println("Du bist an einem Samstag geboren!");
                    break;
                default:
                    System.out.println("Das hat leider nicht geklappt! :(");
                    break;
            }
        } else
            System.out.println("Das hat leider nicht geklappt! :(");

    }
}

