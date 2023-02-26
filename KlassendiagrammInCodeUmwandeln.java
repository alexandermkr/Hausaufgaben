package Hausaufgaben;

class MainClass {
    public static void main(String[] args) {
        Spx h = new Spx(5);
    }
}

class Spx {
    int[] arr;
    static int counter = 0;

    public Spx(int lge) {
        arr = new int[lge];
        int temp = lge;
        counter++;

        for (int i = 0; i < lge; i++) {
            arr[i] = temp;
            System.out.println(i+" "+temp);
            temp--;
        }
    }
}
