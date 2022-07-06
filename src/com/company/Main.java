package com.company;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       Cat cats = new Cat(); // аты ссылкасы = обьект
        cats.age = 1;
        cats.breed = "alabay";
        cats.color = "white";
        cats.name = "masha";
        cats.weight = 0.45d;

        Cat cats2 = new Cat();
        cats2.age = 2;
        cats2.name  = "marya";

        Person personw = new Person();
        personw.age = 25;
        personw.name = "Azamat";
        System.out.println(personw.name);

        Cat.unChygarat();
        Cat.kubalait();
        System.out.println(cats2.name);
        System.out.println("Мышык " + cats.age + " жашта");

    }
}