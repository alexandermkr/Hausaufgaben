package Hausaufgaben;

public class BerechnungEinkommenssteuerGrundtarif {

    public static void main(String[] args){
        //System.out.println(zvE(280000));
        //System.out.println(zvE2(50000,50000));
        printEstTabelle(5000,50000,1000);
    }
    static void printEstTabelle(int von, int bis, int increment){
        System.out.println("|\tzvE\t\t|\tESt\t\t|");
        System.out.println("-------------------------");
        for(int x=von;x<=bis;x+=increment){
            System.out.println("|\t"+x+"\t|\t"+zvE(x)+"\t\t|");
        }
    }
    public static int zvE(double a){
        if(a<=9408){
            return 0;
        } else if(9409<= a && a<=14532){
            double y=(a-9408)/10000;
            return (int) ((972.87*y+1400)*y);
        } else if(14533<=a && a<=57051){
            double z=(a-14532)/10000;
            return (int) ((212.02*z+2397)*z+972.79);
        } else if(57052<=a && a<=270500){
            return (int) (0.42*a-8963.74);
        } else {
            return (int) (0.45*a-17078.74);
        }
    }
    public static int zvE2(double a, double b){
        return (zvE((a+b))/2);
    }

    /*zvE = zvE(Person1+Person2)/2

    zvE <= 9.408 Euro dann ESt=0

    9.409 Euro <= zvE <= 14.532 Euro
        y=(zvE-9.408)/10.000
        ESt=(972,87*y+1.400)*y

      14.533 Euro <= zvE <= 57.051 Euro
        z=(zvE-14.532)/10.000
        ESt=(212,02*z+2.397)*z+972,79

      57.052 Euro <= zvE <= 270.500 Euro
        ESt=0,42*zvE-8.963,74

      270.501 Euro <= zvE
        ESt=0,45*zvE-17.078,74

      2 Personen = 2*ESt
        */
}
