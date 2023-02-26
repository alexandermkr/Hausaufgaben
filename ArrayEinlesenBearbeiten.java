package Hausaufgaben;

import java.io.*;
import java.util.Scanner;

public class ArrayEinlesenBearbeiten {

    static int[][] matrix = new int[3][4];
    public static void main(String[] args){
        try {
            File myObj = new File("Matrix1.txt");
            Scanner myReader = new Scanner(myObj);
            int i = 0;
            while (myReader.hasNextLine()) {
                String line = myReader.nextLine();
                //System.out.println(line);

                String[] parts = line.split(" ");
                matrix[i][0] = Integer.parseInt(parts[0]);
                matrix[i][1] = Integer.parseInt(parts[1]);
                matrix[i][2] = Integer.parseInt(parts[2]);
                matrix[i][3] = Integer.parseInt(parts[3]);
                i += 1;
            }
            myReader.close();
        } catch (Exception e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
        printMatrix();
        System.out.println(" ");
        System.out.println(getMinIndex(matrix));

    }

    public static void printMatrix(){
        System.out.println(matrix[0][0]+" "+matrix[0][1]+" "+matrix[0][2]+" "+matrix[0][3] );
        System.out.println(matrix[1][0]+" "+matrix[1][1]+" "+matrix[1][2]+" "+matrix[1][3] );
        System.out.println(matrix[2][0]+" "+matrix[2][1]+" "+matrix[2][2]+" "+matrix[2][3] );
    }

    public static int getMin(int[][] matrix) {
        int smallestNumber = matrix[0][0];
        for (int i = 0; i < matrix.length; i++){
            for (int j = 0; j < matrix[i].length; j++){
                if (matrix[i][j] < smallestNumber){
                    smallestNumber = matrix[i][j];
                }
            }
        }
        return smallestNumber;
    }

    public static String getMinIndex(int[][] matrix){
        int smallestNumber = matrix[0][0];
        String smallestIndex = "[0][0]";
        for (int i = 0; i < matrix.length; i++){
            for (int j = 0; j < matrix[i].length; j++){
                if (matrix[i][j] < smallestNumber){ //<= für Index der letzten kleinen, gleichen Zahl
                    smallestNumber = matrix[i][j];
                    smallestIndex ="["+i+"]["+j+"]";
                }
            }
        }

        return smallestIndex;
    }
}
