package Hausaufgaben;
import static jsTools.Input.*;
public class KlassenMethoden2 {
    public static void main(String[] args){
        Student a = new Student();
        a.Semester = 2;
        a.setECTS(20);
        a.setECTS(10);
        a.Vorruecken();
        System.out.println(a.toString());

        Student b = new Student("Maria", "Huber", "WI");
        b.Semester = 6;
        b.setECTS(105);
        System.out.println(b.toString());
    }
}

class Student{
    private String Vorname;
    private String Nachname;
    public String Studiengang;
    public int Semester;
    private int ECTS;
    static int AnzahlStudenten = 0;
    final static int MaxSemester = 10;

    public Student(String Vorname, String Nachname, String Studiengang){
        this.Vorname = Vorname;
        this.Nachname = Nachname;
        this.Studiengang = Studiengang;
        AnzahlStudenten++;
    }

    public Student(){
        Vorname = readString("Vorname: ");
        Nachname = readString("Nachname: ");
        Studiengang = readString("Studiengang: ");
        AnzahlStudenten++;
    }

    public String toString(){
        return Vorname + " " + Nachname + " " + Semester + " " + Studiengang;
    }

    public int getAnzahlStudenten(){
        return AnzahlStudenten;
    }

    public void setECTS(int h){
        ECTS += h;
    }

    public boolean Vorruecken(){
        if (Semester == 2 && ECTS >= 30){
            Semester++;
            return true;
        }
        else if (Semester == 4 && ECTS >= 90){
            Semester++;
            return true;
        }
        else if (Semester == 5 && ECTS >= 105){
            Semester++;
            return true;
        }
       return false;
    }

}

