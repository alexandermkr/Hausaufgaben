package Hausaufgabe;

public class MultiplikationstabelleAusgeben {
    public static void main(String[] args){

        int i; int j;

        System.out.println("____|___________________________________________|");
        System.out.println("\t|\t1\t2\t3\t4\t5\t6\t7\t8\t9\t10\t|");
        System.out.println("____|___________________________________________|");

        //Zeilen
        for (i = 1; i <= 10; i++){
            //Ausgabe des Zeilenanfangs
            System.out.print(i + "\t|\t");

            //Spalten
            for (j = 1; j <= 10; j++) {
                //Ausgabe der Werte pro Zeile
                System.out.print(i * j + "\t");
            }
            //Ende der Spalte mit Zeilenumbruch
            System.out.println("|");
        }
        System.out.println("____|___________________________________________|");
    }
}