package Homework.week1.model.test;

import Homework.week1.model.Subject;
import Homework.week1.model.utils.SubjectUtils;

/**
 * Created by Workstation on 06.09.2017.
 */
public class TestSubject {

    public static void main(String[] args) {

        Subject sj;
        sj = new Subject();
        sj = SubjectUtils.GenerateSubject();


        System.out.println(SubjectUtils.ShowInformationAboutSubject(sj));


//        Subject sj = new Subject();
//
//        sj.name  = "History";
//        sj.quantityAllTime = 149;
//        sj.quantityUseTime = 150;
//
//        SubjectUtils.StudentMarkForThisSubject(sj);
//
//        SubjectUtils.CompliteSubject(sj);
//
//        System.out.println(SubjectUtils.ShowInformationAboutSubject(sj));


    }

}
