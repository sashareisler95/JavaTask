package com.company;

public class Human {
    private String name;
    private int age;
    static private int count = 0;

    Human(){
        count++;
        this.age = 0;
        this.name = "";
    }

    Human(String name, int age){
        count++;
        this.age = age;
        this.name = name;
    }

    public void setHuman(String name, int age){
        this.age = age;
        this.name = name;
    }

    public void getInfo(){
        System.out.println("Имя: " + this.name);
        System.out.println("Возраст: " + this.age);
    }

    public void getCount(){
        System.out.println("Созданных экземпляров - " + count);
    }


}
