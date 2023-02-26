package Hausaufgaben;

import static jsTools.Input.*;

public class IbanGenerierenUeberpruefen {

    public static void main(String[] args) {
        System.out.println();
        //pruefe Methoden:
        if (700901001234567890l != calcBBAN(70090100, 1234567890)) {
            System.out.println("Fehler:_Berechnung_BBAN:" +
                    "_700901001234567890l_!=_calcBban(_70090100,_1234567890)):" +
                    calcBBAN(70090100, 1234567890));
        } else {
            System.out.println("IBAN_OK");
        }

        if ('A' != toBig('A'))
            System.out.println("Konvertierungsfehler: 'A' != toBig('A')");
        else System.out.println(("toBig('A') OK"));

        if ('A' != toBig('a'))
            System.out.println("Konvertierungsfehler: 'A' != toBig('a')");
        else System.out.println("toBig('a') OK");

        if ('Z' != toBig('z'))
            System.out.println("Konvertierungsfehler: 'Z' != toBig('z')");
        else System.out.println(toBig('z') + "toBig(z) OK");

        if ('K' != toBig('k'))
            System.out.println("Konvertierungsfehler: 'K' != toBig('k')");
        else System.out.println(toBig('k') + "toBig(k) OK");

        if (131400 != calcLandKennung('d', 'e'))
            System.out.println("Fehler: Berechnung Landkennung:" +
                    " 131400 != calcLandKennung( 'd', 'e') :" +
                    calcLandKennung('d', 'e'));
        else System.out.println("Landkennung OK");

        if (!"08".equals(calcPruefziffer('d', 'e', 70090100, 1234567890)))
            System.out.println("Fehler: Berechnung Pruefziffer:" +
                    " 08 != calcPruefziffer('d', 'e', 70090100, 1234567890):" +
                    calcPruefziffer('d', 'e', 70090100, 1234567890));
        else System.out.println("Pruefziffer OK");


           if (! "DE08700901001234567890".equals(calcIBAN('d', 'e', 70090100, 1234567890)))
                System.out.println("Fehler: Berechnung IBAN:" +
                                   "DE08700901001234567890 ungleich"+
                                   calcIBAN('d', 'e',70090100, 1234567890));
           else System.out.println("Berechnung IBAN: OK");


           char land1=readChar("Bitte geben Sie die erste Stelle der Laenderkennung ein :");
           char land2=readChar("Bitte geben Sie die zweite Stelle der Laenderkennung ein :");
           long blz=readInt("Bitte geben Sie die Bankleitzahl ein:");
           long kontoNR=readInt("Bitte geben Sie die Kontonummer ein:");

           //Hier folgt der Aufruf fuer die Berechnung: und die Ausgabe
           System.out.println("IBAN:"+calcIBAN(land1, land2 , blz, kontoNR));
    }

    // berechnet BBAN blz= 8 stellig, ktoNr 10 stellig ggf. mit 0 davor
    public static long calcBBAN(long blz, long ktoNr) {
        return blz * 10000000000l + ktoNr;
    }

    public static char toBig(char c) {
        if ('a' <= c && c <= 'z') {
            return (char) (c - 32);

        } else {
            return c;
        }
    }

    public static long calcLandKennung(char land1, char land2) {
        char a = toBig(land1);
        char b = toBig(land2);
        int a1 = a - 55;      //oder int a=toBig(land1)-55
        int b1 = b - 55;
        return (a1 * 100 + b1) * 100;
    }

    public static String calcPruefziffer(char land1, char land2, long blz, long ktoNr) {
        long pz = (98-(((calcBBAN(blz,ktoNr)%97)*1000000+calcLandKennung(land1,land2))%97));
        if(pz<10){
            return "0"+pz;
        }else{
            return ""+pz;
        }
    }

    public static String calcIBAN(char land1, char land2, long blz, long ktoNr) {
        char a = toBig(land1);
        char b = toBig(land2);
        String c = calcPruefziffer(land1, land2, blz,ktoNr);
        long d = calcBBAN(blz, ktoNr);
        return ""+a+b+c+d;
    }

}
