package ru.geekbtains.homework6;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        Cat cat1 = new Cat(200,12);
        Cat cat2 = new Cat(30,5);
        Dog dog1 = new Dog(600,50);
        Dog dog2 = new Dog(550,8);
        Dog dog3 = new Dog(300,4);

        cat1.runAnimal();
        cat1.swimAnimal();
        cat2.runAnimal();
        cat2.swimAnimal();
        dog1.runAnimal();
        dog1.swimAnimal();
        dog2.runAnimal();
        dog2.swimAnimal();
        dog3.runAnimal();
        dog3.swimAnimal();
      /*
    Cat [] cat = new Cat[4];
    Dog [] dog = new Dog [3];
    int catCounts = 0;
    int dogCounts = 0;

    for (int i = 1; i <= cat.length ; i++) {
        int k = (int)(Math.random()*300);
        int j = (int)(Math.random()*15);
        cat [i-1] = new Cat (k,  j);
        cat[i-1].runAnimal();
        cat[i-1].swimAnimal();
        System.out.println();
        catCounts +=1;
    }
   for (int i = 1; i<= dog.length; i++) {
       int k = (int)(Math.random()*600);
       int j = (int)(Math.random()*15);
        dog [i-1] = new Dog(k, j);
        dog[i-1].runAnimal();
        dog[i-1].swimAnimal();
       System.out.println();
       dogCounts +=1;
    }
        System.out.println("В Эксперименте учавствовало " + (catCounts + dogCounts) + " животных");
        System.out.println( catCounts + " кошек/кошки");
        System.out.println( dogCounts + " собак/собаки");


    */
        System.out.println("В Эксперименте учавствовало " + (Animal.animalCount) + " животных:");
        System.out.println( Cat.catCount + " кошек/кошки");
        System.out.println( Dog.dogCount + " собак/собаки");


    }
}
