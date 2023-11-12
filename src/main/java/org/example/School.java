package org.example;

import java.util.Iterator;
import java.util.List;
import java.util.Objects;

public class School {
    private List<Student> students;

    public School(List<Student> students) {
        this.students = students;
    }

    public void addStudent(Student student){
        students.add(student);

    }
    public void findStudent(String id){
        for(Student i:students){
            String number = i.getMatrikelnummer();
            if(Objects.equals(number, id)){

                System.out.println("The Student is found: " + i);
            }
        }
    }


    public void deleteStudent(String id){
        Iterator<Student> iterator = students.iterator();
        while(iterator.hasNext()){
            Student student=iterator.next();
            if(student.getMatrikelnummer().equals(id)){

                iterator.remove();
                System.out.println("The Student is delete.");
            }
        }


/*  v.2
    Iterator<Student> iterator = students.iterator();
    while (iterator.hasNext()) {
        Student student = iterator.next();
        if (student.getName().equals("某个名字")) {
            iterator.remove(); // 安全地移除元素的方式
        }
    }

 */


        /* v.1
        for(Student i:students){

            String number = i.getMatrikelnummer();
            if(Objects.equals(number, id)){
                students.remove(i);
                System.out.println("The Student is delete");
            }
        }
        */
    }

    @Override
    public String toString() {
        return "School{" +
                "students=" + students +
                '}';
    }
}
