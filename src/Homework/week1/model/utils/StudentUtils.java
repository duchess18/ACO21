package Homework.week1.model.utils;

import Homework.week1.model.Address;
import Homework.week1.model.Student;
import Homework.week1.model.StudentSubject;
import Homework.week1.model.Subject;

import java.util.Scanner;


/**
 * Created by Workstation on 06.09.2017.
 */
public class StudentUtils {

    public static void CompliteSubject(Subject subject, Student student) {

        if (subject.quantityUseTime >= subject.quantityAllTime / 2 && subject.StudentMark >= 3) {
            System.out.print("Subject complite");
        } else {
            System.out.print("Subject not complite");
        }
        System.out.println();

    }
    public static int StudentMarkForThisSubject(Subject subject, Student student) {

        if (subject.quantityUseTime > subject.quantityAllTime) {
            System.out.println("error of input time");
        } else {
            if (subject.quantityUseTime < subject.quantityAllTime / 2) {
                subject.StudentMark = 2;
                System.out.println("student mark is: 2");
            } else {
                if (subject.quantityUseTime == subject.quantityAllTime) {
                    subject.StudentMark = 5;
                    System.out.println("student mark is: 5");
                } else {
                    if (subject.quantityUseTime > subject.quantityAllTime / 2 && subject.quantityUseTime < 0.75 * subject.quantityAllTime) {
                        subject.StudentMark = 3;
                        System.out.println("student mark is: 3");
                    } else {
                        if (subject.quantityUseTime > subject.quantityAllTime * 0.75) {
                            subject.StudentMark = 4;
                            System.out.println("student mark is: 4");
                        }
                    }
                }
            }
        }
        return subject.StudentMark;
    }



    public static String InformationAboutStudent (Student student) {

        if (student == null){
            return "null";
        }

        return String.format(" Name: %s \n Address: %s \n Subject to learning %s", student.name /*SubjectUtils.ShowInformationAboutSubject(student.sj)*/);
    }

    public static Student AddSubject (Student student){

        StudentSubject [] sjlist = new StudentSubject[10];

        return student;
    }



//    public static Student DeleteSubject (Student student) {
//
//    }


}