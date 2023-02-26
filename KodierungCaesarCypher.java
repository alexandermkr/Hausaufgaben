package Hausaufgaben;

public class KodierungCaesarCypher {
    public static String alph="abcdefghijklmnopqrstuvwxyz";

    public static void main(String[] args){

            System.out.println(cryptText("hallo wie geht es dir",5));
            for(int i=0; i<25; i++ ){
                System.out.println(decryptText("hpc sle kfpcde old clpedpw rpwzpde - pc dnscptmp xtc mteep ptyp xltw",i));
            }
            //System.out.println(decryptText(cryptText("hallo wie geht es dir",5),5));
    }

    public static char crypt(char c, int n){
        if (c==' '||c=='-') {
            return c;
        }
        int i = alph.indexOf(c);
        return alph.charAt((i+n)%alph.length());
    }

    public static char decrypt(char c, int n){
        if (c==' '||c=='-') {
            return c;
        }
        int i = alph.indexOf(c);
        /*
        if ((i-n)%alph.length() < 0) {
            return alph.charAt(alph.length()+((i-n)%alph.length()));
        } else {
            return alph.charAt((i-n)%alph.length());
        }
         */
        // magic
        return alph.charAt(((((i-n) % alph.length()) + alph.length()) % alph.length()));
    }

    public static String cryptText(String s, int n){
        String test="";
        for (int i=0; i<s.length(); i++){
            char c=s.charAt(i); //gibt den "i-sten"-Buchstaben von dem String s aus
            char ct=crypt(c,n); //der verschlüsselte Buchstabe

            test=test+ct;
        }
        return test;
    }

    public static String decryptText(String s, int n){
        String test="";
        for (int i=0; i<s.length(); i++){
            char c=s.charAt(i); //gibt den "i-sten"-Buchstaben von dem String s aus
            char ct=decrypt(c,n);

            test=test+ct;
        }
        return test;
    }
}
