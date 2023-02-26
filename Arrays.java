package Hausaufgaben;

public class Arrays {

    public static void main(String[] args) {
        create();
    }

    public static void create() {
        int[] intArray = new int[10];
        for (int i = 0; i < intArray.length; i++) {
            intArray[i] = i;

            System.out.print(intArray[i]);
        }
        System.out.println("");


        int temp = intArray[0];
        intArray[0] = intArray[9];
        intArray[9] = temp;

        for (int i = 0; i < intArray.length; i++) {

            System.out.print(intArray[i]);
        }

    }
}




