package com.company;

public class TestBook {

    public static void main(String[] args) {
        Book war = new Book();
        war.setAuthor("Adolf Peaceful");
        war.setName("Painting");
        war.setYear(1488);
        System.out.println(war.ToString());
    }
}
