package com.company;
import java.util.Comparator;

public class SortingStudentsByGPA implements Comparator {

    private  int score;

    public SortingStudentsByGPA (int score)
    {
        this.score = score;
    }
    public SortingStudentsByGPA () {};

    public void setScore(int score) {
        this.score = score;
    }

    public int getScore() {
        return score;
    }

    @Override
    public int compare(Object o1, Object o2) {
        return 0;
    }
}
