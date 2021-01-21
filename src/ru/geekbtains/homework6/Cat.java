package ru.geekbtains.homework6;

public class Cat extends Animal{
    static int catCount;

    public Cat(int runDistance, int swimDistance) {
        super(runDistance, swimDistance);
        catCount +=1;


    }

    @Override
    public void runAnimal(){
        if ( getRunDistance() > 200) {
            System.out.println("Кошка пробежала 200 метров и остановилась отдохнуть");
        } else {
            System.out.println("Кошка пробежала " + getRunDistance() + " метров");
        }
    }

    @Override
    public void swimAnimal() {
        System.out.println("Кошка не умеет плавать");
        System.out.println();
    }

}
