package Hausaufgaben;

public class MatrixBerechnungen {

    public static void main(String[] args) {
        final int N = 8;
        long[][] Matrix = new long[N][N];
        for ( int i = 0; i < N; i++){
            Matrix[0][i] = 1l;
            Matrix[i][0] = 1l;
        }
        printMatrix(calcMatrix(Matrix));
        System.out.println(" ");
        System.out.println(fakultaet(2*(N-1))/(fakultaet(((2*(N-1))/2))*fakultaet((2*(N-1)-(2*(N-1))/2))));
    }
    public static void printMatrix(long[][] p){
        for (int i = 0; i < p.length; i++){
            for ( int j = 0; j < p.length; j++) {
                System.out.print(p[i][j]+"\t");

            }
            System.out.println(" ");
        }

    }
    public static long[][] calcMatrix(long[][] e){
        for (int i = 1; i < e.length; i++) {
            for (int j = 1; j < e.length; j++) {
                e[i][j] =  e[i-1][j] + e[i][j-1];
            }
        }
    return e;
    }

    public static long fakultaet(long a){
        long j = 1;
        for (int i = 1; i <= a; i++){
            j = j * i;

        }
    return j;
    }
}
