package Hausaufgaben;

import static jsTools.Input.*;

public class ObjekteZeichnenObjektorientiert {
    public static void main(String[] args) {
        quadrat(8);
        dreieck(8);
        raute(5);
    }



    static void paintStars(int offset, int anz) {
        for (int i = 0; i < offset; i++) {
            System.out.print(" ");
        }
        for (int i = 0; i < anz; i++) {
            System.out.print("*");
        }
        System.out.println("");
    }

    static void paintStarBlanksStar(int offset, int anz) {
        for (int i = 0; i < offset; i++) {
            System.out.print(" ");
        }
        System.out.print("*");
        for (int i = 0; i < anz; i++) {
            System.out.print(" ");
        }
        System.out.println("*");
    }
    static void quadrat(int size) {
        paintStars(0,size);
        for (int i = 0; i < size-2; i++) {
            paintStarBlanksStar(0,size-2);
        }
        paintStars(0,size);
    }
    static void dreieck(int size) {
        paintStars(0,1);
        for (int i = 0; i < size-2; i++) {
            paintStarBlanksStar(0,i);
    }
        paintStars(0,size);
    }
    static void raute(int size) {
        paintStars(size,1);
        for (int i = 0; i < size-2; i++){
            paintStarBlanksStar(size-i-1,2*i+1);
        }
        paintStarBlanksStar(1,size+2);
        for (int i = 0; i < size-2; i++){
            paintStarBlanksStar(i+2,size-2*i);
        }
        paintStars(size,1);
    }


}