import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        double turkishGrade,mathGrade,musicGrade,chemistryGrade,physicGrade;
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter Turkish lesson's Grade:");
        turkishGrade = keyboard.nextDouble();
        System.out.println("Enter Math lesson's Grade:");
        mathGrade = keyboard.nextDouble();
        System.out.println("Enter Music lesson's Grade:");
        musicGrade = keyboard.nextDouble();
        System.out.println("Enter Chemistry lesson's Grade:");
        chemistryGrade = keyboard.nextDouble();
        System.out.println("Enter Physic lesson's Grade:");
        physicGrade = keyboard.nextDouble();

        if (turkishGrade <0 || turkishGrade > 100)
            turkishGrade = 0;
        if (mathGrade <0 || mathGrade > 100)
            mathGrade = 0;
        if (musicGrade <0 || musicGrade > 100)
            musicGrade = 0;
        if (chemistryGrade <0 || chemistryGrade > 100)
            chemistryGrade = 0;
        if (physicGrade <0 || physicGrade > 100)
            physicGrade = 0;
        double average = (turkishGrade+mathGrade+musicGrade+chemistryGrade+physicGrade)/5.0;
        System.out.println("-Dersler-\n1.Turkish:" + turkishGrade + "\n2.Math:" + mathGrade+ "\n3.Music:" + musicGrade);
        System.out.println("Average = "+ average);

        if (average >= 55) {

            System.out.println("Ortalamanız:"+ average + "\t" + "Dersi geçtiniz.");
        }else{
            System.out.println("FAIL!");

        }



    }
}