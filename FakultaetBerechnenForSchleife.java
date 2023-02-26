package Hausaufgaben;

import static jsTools.Input.*;

public class FakultaetBerechnenForSchleife {
    public static void main(String[] args){

        int i;
        int j = 1;
        int eingabe;

        eingabe = readInteger("Berechne die Fakultät von: ");

        for(i = 1; i <= eingabe; i++){ // Von 1 bis Eingabe jeweils + 1
            j = j * i;
        }
        System.out.println("Die Fakultät von " + eingabe + " ist: " + j);
    }
}
