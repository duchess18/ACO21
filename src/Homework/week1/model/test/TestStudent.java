package Homework.week1.model.test;

import Homework.week1.model.Address;
import Homework.week1.model.Student;
import Homework.week1.model.Subject;
import Homework.week1.model.utils.AddressUtils;
import Homework.week1.model.utils.StudentUtils;
import Homework.week1.model.utils.SubjectUtils;

/**
 * Created by Workstation on 06.09.2017.
 */
public class TestStudent {

    public static void main(String[] args) {

        Student st1 = new Student();

        st1.name = "Ivan";
//        st1.address = new Address();

        System.out.println(StudentUtils.InformationAboutStudent(st1));

    }
}
