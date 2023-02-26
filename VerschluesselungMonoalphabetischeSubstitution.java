package Hausaufgaben;

import static jsTools.Input.*;

public class VerschluesselungMonoalphabetischeSubstitution {
    public static void main(String[] args) {
        String uncryptedText = "alex";
        String cryptedText = "ucwk";

        System.out.println(cryptText(uncryptedText, cryptedArray));
        System.out.println(decryptText(cryptedText, cryptedArray));
    }

    public static char[] cryptedArray = {
            'u', 'f', 'l', 'p', 'w', 'd', 'r', 'a', 's', 'j',
            'm', 'c', 'o', 'n', 'q', 'y', 'b', 'v', 't', 'e',
            'x', 'h', 'z', 'k', 'g', 'i'
    };
    public static char[] uncryptedArray = {
            'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j',
            'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't',
            'u', 'v', 'w', 'x', 'y', 'z'
    };

    public static int getIndex(char c, char[] someArray) {
        for (int i = 0; i < someArray.length; i++) {
            if (someArray[i] == c) {
                return i;
            }
        }
        return -1;
    }

    public static char crypt(char c, char[] someCryptedArray) {
        if (c == ' ' || c == '-' || c == '.' || c == ',' || c == '?' || c == '!') {
            return c;
        }
        int index = getIndex(c, uncryptedArray);

        return someCryptedArray[index];
    }

    public static char decrypt(char c, char[] someCryptedArray) {
        if (c == ' ' || c == '-' || c == '.' || c == ',' || c == '?' || c == '!') {
            return c;
        }
        int index = getIndex(c, someCryptedArray);

        return uncryptedArray[index];
    }

    public static String cryptText(String s, char[] someCryptedArray) {
        String cryptedText = "";
        //uncryptedText wird eingelesen und daraus wird cryptedText
        for (int i = 0; i < s.length(); i++) {
            cryptedText += crypt(s.charAt(i), someCryptedArray);
        }
        return cryptedText.toUpperCase();
    }

    public static String decryptText(String s, char[] someCryptedArray) {
        String decryptedText = "";
        //cryptedText wird eingelesen und daraus wird uncryptedText
        for (int i = 0; i < s.length(); i++) {
            decryptedText += decrypt(s.charAt(i), someCryptedArray);
        }
        return decryptedText.toUpperCase();
    }
}
