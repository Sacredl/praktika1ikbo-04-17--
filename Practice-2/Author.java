package com.company;

public class Author {
    private String name;
    private String email;
    private char gender;
    Author(String name, String email, char gender){
        this.name = name;
        this.email = email;
        if(gender == 'M')
        {
            gender = 'M';
        }
        else if(gender == 'F') {
            gender = 'F';
        }
        else {
            gender = 'U';
        }
        this.gender = gender;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getName() {
        return name;
    }
    public String getEmail() {
        return email;
    }
    public char getGender() {
        return gender;
    }
    @Override
    public String toString() {
        return "Author: " + getName() + " (" + getGender() + "), " + getEmail();
    }
}
