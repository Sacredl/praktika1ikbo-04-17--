package com.company;

import java.lang.*;
public class TestAuthor {
    public static void main(String[] args) {
        Author at = new Author("Ivan-1", "ivan-1@mail.ru", 'A');
        System.out.println(at.toString());
        at = new Author("Ivan-2", "ivan-2@mail.ru", 'M');
        System.out.println(at.toString());
    }
}
