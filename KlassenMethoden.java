package Hausaufgaben;

import static jsTools.Input.*;

public class KlassenMethoden {
    public static void main(String[] args) {
        Auto a = new Auto();
        a.readValues();
        a.print();
        a.driveTo(80,100);

        Auto b = new Auto();
        b.init("Toyota",30,50,25000,2010);
        b.print();
        b.driveTo(100,100);
    }
}

class Auto {
    String hersteller;
    int posX;
    int posY;
    int kmStand;
    int baujahr;

    void init(String hst, int x, int y, int km, int bj) {
        hersteller = hst;
        posX = x;
        posY = y;
        kmStand = km;
        baujahr = bj;
    }

    void readValues() {
        hersteller = readString("Herstellername: ");
        posX = readInteger("1. Position: ");
        posY = readInteger("2. Position: ");
        kmStand = readInteger("KM-Stand: ");
        baujahr = readInteger("Baujahr: ");
    }

    void driveTo(int xNeu, int yNeu) {
        System.out.println("Alte Position: " + posX + "/" + posY);

        System.out.println("Neue Position: " + xNeu + "/" + yNeu);
        int strecke = (int) Math.sqrt((xNeu - posX)^2 + (yNeu - posY)^2);
        kmStand += strecke;

        System.out.println("Neuer KM-Stand: " + kmStand);
        System.out.println("gefahrene Strecke: " + strecke);
    }

    void print() {
        System.out.println("Hersteller: " + hersteller + "\n\r"
                + "Position X: " + posX + "\n\r"
                + "Position Y: " + posY + "\n\r"
                + "KM-Stand: " + kmStand + "\n\r"
                + "Baujahr: " + baujahr);
    }
}
