package Homework.week1.model;

import Homework.week1.model.utils.SubjectUtils;

/**
 * Created by Workstation on 06.09.2017.
 */
public class Subject {

    public String name;

    public int quantityAllTime;
    public int quantityUseTime;
    public int StudentMark;

    public Subject() {

    }

    public Subject(String name, int quantityAllTime, int quantityUseTime, int studentMark) {

        this.name = name;
        this.quantityAllTime = quantityAllTime;
        this.quantityUseTime = quantityUseTime;
        StudentMark = studentMark;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getQuantityAllTime() {
        return quantityAllTime;
    }

    public void setQuantityAllTime(int quantityAllTime) {
        this.quantityAllTime = quantityAllTime;
    }

    public int getQuantityUseTime() {
        return quantityUseTime;
    }

    public void setQuantityUseTime(int quantityUseTime) {
        this.quantityUseTime = quantityUseTime;
    }

    public int getStudentMark() {
        return StudentMark;
    }

    public void setStudentMark(int studentMark) {
        StudentMark = studentMark;
    }
}
