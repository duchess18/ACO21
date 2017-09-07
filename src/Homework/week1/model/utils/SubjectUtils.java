package Homework.week1.model.utils;


import Homework.week1.model.Subject;

/**
 * Created by Workstation on 06.09.2017.
 */
public class SubjectUtils {

    public static Subject GenerateSubject() {

        String name = generateName();
        int quantityAllTime = generateTime();



        return new Subject(name,quantityAllTime,0,0);

    }

    private static int generateNum(int lower, int hight) {
        return lower + (int) (Math.random() * (hight - lower));
    }



    private static int generateTime() {
        return generateNum(50, 200);
    }


    private static String generateName() {

        String[] subjects = {"History", "Math", "English", "Physics", "OBG", "Sport"};

        return subjects[(int) (Math.random() * subjects.length)];
    }


    public static String ShowInformationAboutSubject(Subject subject) {

        if (subject.name == null) {
            return "null";
        }
        return String.format("name %s, quantity of all time %d",
                subject.name, subject.quantityAllTime);
    }
}

