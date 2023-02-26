package Hausaufgaben;

import static jsTools.Graph.*;

public class SchachbrettMusterKoordinatensystem {

    public static void main(String[] args) {
        initWindow();
        //paintSchach(8, 8);
        paintSchach800(5,7);
    }

    static void paintSchach(int n, int m) {
        addRect(45,45,n*40+10,m*40+10,brown);
        addRect(48,48,n*40+4,m*40+4,white);
        boolean switchColor = false;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (switchColor == true) {
                    switchColor = false;
                    addRect(50+i * 40, 50+j * 40, 40, 40, black);
                } else {
                    addRect(50+i * 40, 50+j * 40, 40, 40, white);
                    switchColor = true;
                }
            }
            if (m%2 == 0) {
                switchColor = !switchColor;
            }
        }
    }

    static void paintSchach800(int n, int m) {
        addRect(45,45,800+10,800+10,brown);
        addRect(48,48,800+4,800+4,white);
        boolean switchColor = false;

        int breite = 800;
        int hoehe = 800;
        int feldbreite = breite / n;
        int feldhoehe = hoehe / m;


        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (switchColor == true) {
                    switchColor = false;
                    addRect(50+i * feldbreite, 50+j * feldhoehe, feldbreite, feldhoehe, black);
                } else {
                    addRect(50+i * feldbreite, 50+j * feldhoehe, feldbreite, feldhoehe, white);
                    switchColor = true;
                }
            }
            if (m%2 == 0) {
                switchColor = !switchColor;
            }
        }
    }
}
