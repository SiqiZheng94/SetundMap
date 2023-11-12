package org.example;

import java.util.ArrayList;
import java.util.List;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        List<Student> list = new ArrayList<>();


        Student student1 = new Student("Siqi", "Zheng", "111");
        Student student2 = new Student("Christ", "Lee", "222");
        Student student3 = new Student("Bob", "Wolf", "333");
        list.add(student1);
        list.add(student2);
        list.add(student3);

        School school = new School(list);

        school.addStudent(new Student("Anna","Klein","444"));
        System.out.println(school);

        school.findStudent("111");
        school.deleteStudent("111");

        List<String> courseList = new ArrayList<String>();
        Course course1 = new Course("JAVA", "Sara", "zoom");
        student2.addCourse(course1);
        System.out.println(student2.getCourse());


        Pharmacy pharmacy = new Pharmacy();
        Medication med1 = new Medication("med1", 10.84, true);
        Medication med2 = new Medication("med2", 98.90, false);

        pharmacy.save(med1);
        pharmacy.save(med2);

        System.out.println("===getCount===");
        System.out.println("There are "+pharmacy.getCount()+" kinds of medication.");


        System.out.println("===find===");
        pharmacy.find("med1");
        pharmacy.find("med3");
        System.out.println("===find1===");
        System.out.println(pharmacy.find1("med1"));
        System.out.println(pharmacy.find1("med3"));
        System.out.println("===find2===");
        System.out.println(pharmacy.find2("med1"));
        System.out.println(pharmacy.find2("med3"));


        System.out.println("===delete===");
        //pharmacy.delete("med1");
        //pharmacy.delete1("med1");
        System.out.println(pharmacy);

        System.out.println("===print===");
        pharmacy.printAll();
        System.out.println("===print1===");
        pharmacy.printAll1();
        System.out.println("===print2===");
        pharmacy.printAll2();
        System.out.println("===print3===");
        pharmacy.printAll3();
        System.out.println("===print4===");
        pharmacy.printAll4();


    }
}