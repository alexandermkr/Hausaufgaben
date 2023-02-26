package Hausaufgaben;

public class QuadratzahlenBerechnen {
    public static void main(String[] args){

        int i;
        int j;
        int k = 0;

        System.out.println("Zahl\tQuadrat\t\tSummeDerZahlen\t\tSummeDerQuadratzahlen");

        for (i = 1; i <= 100; i++){
            j = i;
            k = i*i+k;
            System.out.println(i + "\t\t" + i*i + "\t\t\t" + j*(j+1)/2 + "\t\t\t\t\t" + k);
        }
    }
}
