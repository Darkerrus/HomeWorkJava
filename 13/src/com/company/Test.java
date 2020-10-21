package com.company;
import java.util.*;

public class Test {

    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<Student>();
        students.add(new Student(11, "Misha",18, 95));
        students.add(new Student(5, "Masha",19, 90));
        students.add(new Student(1, "Jake",20,100));
        students.add(new Student(15, "Lana",18, 85));

        for (Student o: students)
        {
            System.out.println(o.getIDNumber());
        }

        Collections.sort(students);
        System.out.println("******************************************");
        for (Student o: students)
        {
            System.out.println(o.getIDNumber());
        }
        System.out.println("------------------------------------------");
        ArrayList<SortingStudentsByGPA> sortingStudentsByGPAS = new ArrayList<SortingStudentsByGPA>();
        for (int i = 0; i < students.size(); i++)
        {
            SortingStudentsByGPA sortingStudentsByGPA = new SortingStudentsByGPA();
            sortingStudentsByGPA.setScore(students.get(i).getScore());
            sortingStudentsByGPAS.add(sortingStudentsByGPA);
        }
        for (SortingStudentsByGPA o : sortingStudentsByGPAS)
        {
            System.out.println(o.getScore());
        }
        System.out.println("******************************************");
        Comparator<SortingStudentsByGPA> comparator = new Comparator<SortingStudentsByGPA>() {
            @Override
            public int compare(SortingStudentsByGPA o1, SortingStudentsByGPA o2) {
                return o1.getScore() < o2.getScore() ? 1 : -1;
            }
        };

        Collections.sort(sortingStudentsByGPAS, comparator);
        for (SortingStudentsByGPA o: sortingStudentsByGPAS)
        {
            System.out.println(o.getScore());
        }
    }
}
