package org.example;

import java.util.ArrayList;
import java.util.List;

public class Student {
    private String vorname;
    private String nachname;
    private String matrikelnummer;
    private List<Course> course=new ArrayList<>();


    public Student(String vorname, String nachname, String matrikelnummer, List<Course> course) {
        this.vorname = vorname;
        this.nachname = nachname;
        this.matrikelnummer = matrikelnummer;
        this.course = course;
    }

    public Student(String vorname, String nachname, String matrikelnummer) {
        this.vorname = vorname;
        this.nachname = nachname;
        this.matrikelnummer = matrikelnummer;
    }

    public List<Course> getCourse() {
        return course;
    }

    public void setCourse(List<Course> course) {
        this.course = course;
    }

    public String getVorname() {
        return vorname;
    }

    public void setVorname(String vorname) {
        this.vorname = vorname;
    }

    public String getNachname() {
        return nachname;
    }

    public void setNachname(String nachname) {
        this.nachname = nachname;
    }

    public String getMatrikelnummer() {
        return matrikelnummer;
    }

    public void setMatrikelnummer(String matrikelnummer) {
        this.matrikelnummer = matrikelnummer;
    }
    public void addCourse(Course coursrObj){
        course.add(coursrObj);
    }

    @Override
    public String toString() {
        return "Student{" +
                "vorname='" + vorname + '\'' +
                ", nachname='" + nachname + '\'' +
                ", matrikelnummer='" + matrikelnummer + '\'' +
                '}';
    }
}
