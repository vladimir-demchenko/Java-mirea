package com.company.prac12;

public class ex1 {
    private String name;
    private String middleName;
    private String surname;

    ex1(String name, String middleName, String surname){
        this.middleName = middleName;
        this.name = name;
        this.surname = surname;
    }

    ex1() {}

    public void setName(String name){
        this.name = name;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void getName(){
        if (name!=null | surname!= null | middleName!=null){
            System.out.println(surname + " " + name + " " + middleName);
        }else System.out.println("Update person's info");
    }
}
