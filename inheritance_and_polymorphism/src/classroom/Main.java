package classroom;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);


        Pupil pupil_1 = new ExcellentPupil("Vitalii");

        Pupil pupil_2 = new ExcellentPupil("Viktoriia");

        Pupil pupil_3 = new GoodPupil("Andrei");

        Pupil pupil_4 = new BadPupil("Susanna");


        ClassRoom classRoom_1 = new ClassRoom(pupil_1, pupil_2, pupil_3, pupil_4);


        System.out.println("List pupils of classroom #1: ");

        for (int i = 0; i < classRoom_1.pupils.length; i++) {

            System.out.println(classRoom_1.pupils[i].nameOfPupil);

        }

        System.out.println("========");

        pupil_1.study();
        pupil_1.read();
        pupil_1.write();
        pupil_1.relax();

        System.out.println("========");

        pupil_2.study();
        pupil_2.read();
        pupil_2.write();
        pupil_2.relax();

        System.out.println("========");

        pupil_3.study();
        pupil_3.read();
        pupil_3.write();
        pupil_3.relax();

        System.out.println("========");

        pupil_4.study();
        pupil_4.read();
        pupil_4.write();
        pupil_4.relax();







    }
}
