package Hausaufgaben;

import jsTools.Wand;

public class ZeichnenKoordinatensystem {
    public static String[][] Wand = new String[24][24];


    public static void main (String[] args) {
        create();
        //paintDiagonale("R");
        //paintGegenDiagonale("S");
        //paintHor(10, "G");
        //paintVer(10, "F");
        //paintHor2(10,5,5, "Z");
        //paintVer2(10,5,5, "L");
        //paintRe(5,5,5,5,"M");
        printAll();
    }

    public static void create() {
        for (int i = 0; i < 24; i++) {
            for (int j = 0; j < 24; j++) {
                Wand[i][j] = "[0]";
            }
        }
    }

    public static void printAll() {
        for (int i = 0; i < 24; i++) {
            for (int j = 0; j < 24; j++) {
                System.out.print(Wand[i][j]);
            }
            System.out.println("");
        }
    }

    public static void paintDiagonale(String color) {
        for ( int i =0; i < 24; i++){
            Wand[i][i] = "["+color+"]";
        }
    }

    public static void paintGegenDiagonale(String color) {
        for (int i = 0; i < 24; i++) {
            for (int j = 0; j < 24; j++) {
                Wand[23-i][i] = "["+color+"]";
            }
        }
    }

    public static void paintHor(int zeile, String color) {
        for (int j = 0; j < 24; j++) {
            Wand[zeile][j] = "["+color+"]";
        }
    }

    public static void paintVer(int spalte, String color) {
        for (int i = 0; i < 24; i++) {
            Wand[i][spalte] = "["+color+"]";
        }
    }

    public static void paintHor2(int zeile, int from, int lge, String color) {
        for (int j = from - 1; j < from + lge; j++) {
            Wand[zeile][j] = "["+color+"]";
        }
    }

    public static void paintVer2(int spalte, int from, int lge, String color) {
        for (int i = from - 1; i < from + lge; i++) {
            Wand[i][spalte] = "["+color+"]";
        }
    }

    public static void paintRe(int z0, int s0, int breite, int hoehe, String color) {
        for (int i = z0 - 1; i < z0 + breite; i++) {
            for (int j = s0 - 1; j < s0 + hoehe; j++) {
                Wand[i][j] = "["+color+"]";
            }
        }
    }
}
