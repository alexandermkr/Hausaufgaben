package Hausaufgaben;

import static jsTools.Input.*;

public class GeometrischeFormenKonsoleZeichnen {
    public static void main(String[] args) {

        int e;
        int i;
        int j;
        String tab = "\t";

        e = readInteger("Größe: ");

        System.out.println("Quadrat:");

        for (i = 1; i <= e; i++) {
            System.out.print("*" + tab);

            if (i > 1 && i < e) { // Zwischenzeilen
                for (j = 1; j < e-1; j++) {
                    System.out.print(tab);
                }
                System.out.println("*");

            } else { // Erste und letzte Zeile
                for (j = 1; j < e; j++) {
                    System.out.print("*" + tab);
                }
                System.out.println();
            }
        }

        // ** DREIECK

        System.out.println("Dreieck:");

        for(i = 1; i <= e; i++) {
            for(j = 1; j <= e-i; j++) {
                System.out.print(tab);
            }

            if(i==1) { // Erste Zeile
                System.out.println("*");
            }

            else if(i == e) { // Letzte Zeile
                for(j = 1; j <= 2*e-1; j++) {
                    System.out.print("*" + tab);
                }

            } else { // Zwischenzeilen
                System.out.print("*");
                for(j = 1; j <= 2*i-2; j++) {
                    System.out.print(tab);
                }
                System.out.println("*");
            }
        }

        // ** RAUTE

        System.out.println("\nRaute:");

        for(i = 1; i <= e; i++) {
            for(j = 1; j <= e-i; j++) {
                System.out.print(tab);
            }

            if(i == 1) { // Erste Zeile
                System.out.println("*");
            } else { // Zwischenzeilen
                System.out.print("*");
                for(j = 1; j <= 2*i-2; j++) {
                    System.out.print(tab);
                }
                System.out.println("*");
            }
        }
        // Erneutes Dreieck nur geflippt
        for(i = 1; i < e; i++) {
            for(j = 1; j <= i; j++) {
                System.out.print(tab);
            }

            if(i == e-1) { // Letzte Zeile, -1, da Basis zum oberen Teil gehört
                System.out.println("*");
            } else { // Zwischenzeilen
                System.out.print("*");
                for(j = 1; j <= 2*(e-i)-2; j++) { // (2*e)-(2*i)-2
                    System.out.print(tab);
                }
                System.out.println("*");
            }
        }
    }
}
