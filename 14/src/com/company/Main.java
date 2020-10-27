package com.company;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;




class Student
{
    double afk;

    Student(double afk)
    {
        this.afk = afk;
    }
}


class SortingStudentsByGPA implements Comparator<Student>
{
    @Override
    public int compare(Student o1, Student o2)
    {
        return Double.compare(o1.afk, o2.afk);
    }


    void mergeSort(ArrayList<Student> students, int first_index, int last_index)
    {
        if(last_index <= first_index) return;
        int middle_index = (first_index + last_index) / 2;
        mergeSort(students, first_index, middle_index);
        mergeSort(students, middle_index + 1, last_index);
        merge(students, first_index, middle_index, last_index);
    }


    void merge(ArrayList<Student> students, int first_index, int middle_index, int last_index)
    {
        int length_left = middle_index - first_index + 1;
        int length_right = last_index - middle_index;
        ArrayList<Student> left_students = new ArrayList<Student>();
        for(int i = 0; i < students.size(); i++)
        {
            left_students.add(null);
        }
        ArrayList<Student> right_students = new ArrayList<Student>();

        for(int i = 0; i < students.size(); i++)
        {
            right_students.add(null);
        }
        left_students.set(4, null);

        for(int i = 0; i < length_left; i++)
        {
            left_students.set(i, students.get(first_index + i));
        }
        for(int i = 0; i < length_right; i++)
        {
            right_students.set(i, students.get(middle_index + i + 1));
        }
        int left_index = 0;
        int right_index = 0;

        for(int i = first_index; i < last_index + 1; i++)
        {
            if(left_index < length_left && right_index < length_right)
            {
                if (compare(left_students.get(left_index), right_students.get(right_index)) > 0)
                {
                    students.set(i, left_students.get(left_index));
                    left_index++;
                }
                else
                {
                    students.set(i, right_students.get(right_index));
                    right_index++;
                }
            }
            else if(left_index < length_left)
            {
                students.set(i, left_students.get(left_index));
                left_index++;
            }
            else if(right_index < length_right)
            {
                students.set(i, right_students.get(right_index));
                right_index++;
            }
        }
    }


    void quickSort(ArrayList<Student> students, int first_index, int last_index)
    {
        if(students.size() == 0) return;
        if(first_index >= last_index) return;
        int middle_index = first_index + (last_index - first_index) / 2;
        Student middle_student = students.get(middle_index);
        int i = first_index, j = last_index;
        while(i <= j){
            while(compare(students.get(i), middle_student) > 0)
            {
                i++;
            }
            while(compare(students.get(j), middle_student) < 0)
            {
                j--;
            }
            if(i <= j)
            {
                Student temp = students.get(i);
                students.set(i, students.get(j));
                students.set(j, temp);
                i++;
                j--;
            }
            if(first_index < j)
            {
                quickSort(students, first_index, j);
            }
            if(last_index > i)
            {
                quickSort(students, i, last_index);
            }
        }
    }


    Student binarySearch(ArrayList<Student> students, Student element_to_search){
        int first_index = 0;
        int last_index = students.size() - 1;

        while(first_index <= last_index)
        {
            int middle_index = (first_index + last_index) / 2;

            if(compare(students.get(middle_index), element_to_search) == 0)
            {
                return students.get(middle_index);
            }
            else if(compare(students.get(middle_index), element_to_search) < 0)
            {
                first_index = middle_index + 1;
            }
            else if(compare(students.get(middle_index), element_to_search) > 0)
            {
                last_index = middle_index - 1;
            }
        }
        return null;
    }


    Student recursiveBinarySearch(ArrayList<Student> students, int first_index, int last_index, Student element_to_search)
    {
        if(last_index >= first_index)
        {
            int middle_index = first_index + (last_index - first_index) / 2;

            if(compare(students.get(middle_index), element_to_search) == 0)
            {
                return students.get(middle_index);
            }
            else if(compare(students.get(middle_index), element_to_search) < 0)
            {
                return recursiveBinarySearch(students, middle_index + 1, last_index, element_to_search);
            }
            else if(compare(students.get(middle_index), element_to_search) > 0)
            {
                return recursiveBinarySearch(students, first_index, middle_index - 1, element_to_search);
            }
        }
        return null;
    }


    Student linearSearch(ArrayList<Student> students, Student element_to_search)
    {
        for (Student student : students)
        {
            if (compare(student, element_to_search) == 0)
            {
                return student;
            }
        }
        return null;
    }


    Student recursiveLinearSearch(ArrayList<Student> students, Student element_to_search, int index)
    {
        if(compare(students.get(index), element_to_search) == 0)
        {
            return students.get(index);
        }
        index++;
        if(students.size() == index)
        {
            return null;
        }
        return recursiveLinearSearch(students, element_to_search, index);
    }
}


public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Student> my_students = new ArrayList<Student>();
        System.out.println("Введите количество элементов массива");
        int length = sc.nextInt();
        System.out.println("Какое число вы хотели бы найти? Введите число от 2 до 10 в формате #,#");
        double num = sc.nextDouble();
        for(int i = 0; i < length; i++)
        {
            double rand = (Math.random()* 8) + 2;
            my_students.add(new Student((Math.round(rand*10))/ 10.0));
        }
        SortingStudentsByGPA sorting_comparator = new SortingStudentsByGPA();
        System.out.println("Неотсортированный массив:");
        for (Student my_student : my_students) System.out.print(my_student.afk + " ");

        System.out.println("\nQuick sort:");
        ArrayList<Student> array_copy = new ArrayList<Student>(my_students);
        long start = System.nanoTime();
        sorting_comparator.quickSort(array_copy, 0, array_copy.size()-1);
        long finish = System.nanoTime();
        System.out.println("Время работы Quick Sort: " + TimeUnit.SECONDS.convert(finish - start, TimeUnit.NANOSECONDS) + " секунд\nОтсортированный массив:");
        for (Student my_student : array_copy) System.out.print(my_student.afk+ " ");

        System.out.println("\nMerge sort:");
        array_copy = new ArrayList<Student>(my_students);
        start = System.nanoTime();
        sorting_comparator.mergeSort(array_copy, 0, array_copy.size()-1);
        finish = System.nanoTime();
        System.out.println("Время работы Merge Sort: " + TimeUnit.SECONDS.convert(finish - start, TimeUnit.NANOSECONDS) + " секунд\nОтсортированный массив:");
        for (Student my_student : array_copy)
        {
            System.out.print(my_student.afk + "\t");
        }

        /*array_copy.sort(sorting_comparator);
        сортировка массива для б.п.*/

        try
        {
            start = System.nanoTime();
            System.out.print("\nИтеративный бинарный поиск " + sorting_comparator.binarySearch(array_copy, new Student(num)).afk);
            finish = System.nanoTime();
            System.out.println("\nВремя работы: " + TimeUnit.SECONDS.convert(finish - start, TimeUnit.NANOSECONDS) + " секунд");

            start = System.nanoTime();
            System.out.print("\nРекурсивный бинарный поиск " + sorting_comparator.recursiveBinarySearch(array_copy, 0, length, new Student(num)).afk);
            finish = System.nanoTime();
            System.out.println("\nВремя работы: " + TimeUnit.SECONDS.convert(finish - start, TimeUnit.NANOSECONDS) + " секунд");

            start = System.nanoTime();
            System.out.print("\nИтеративный линейный поиск " + sorting_comparator.linearSearch(my_students, new Student(num)).afk);
            finish = System.nanoTime();
            System.out.println("\nВремя работы: " + TimeUnit.SECONDS.convert(finish - start, TimeUnit.NANOSECONDS) + " секунд");

            start = System.nanoTime();
            System.out.print("\nРекурсивный линейный поиск " + sorting_comparator.recursiveLinearSearch(my_students, new Student(num), 0).afk);
            finish = System.nanoTime();
            System.out.println("\nВремя работы: " + TimeUnit.SECONDS.convert(finish - start, TimeUnit.NANOSECONDS) + " секунд");
        }
        catch (NullPointerException e)
        {
            System.out.println("Число не найдено!");
        }
    }
}
