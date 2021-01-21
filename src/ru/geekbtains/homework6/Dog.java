package ru.geekbtains.homework6;

public class Dog extends Animal{
    static int dogCount;

    public Dog (int runDistance, int swimDistance) {
        super(runDistance, swimDistance);
        dogCount +=1;
        }


    @Override
    public void runAnimal() {
        if (getRunDistance() > 500) {
            System.out.println("Собака пробежала 500 метров и остановилась отдохнуть");
        } else {
            System.out.println("Собака пробежала " + getRunDistance() + " метров");
        }
    }

    @Override
    public void swimAnimal() {
        if (getSwimDistance() > 10) {
            System.out.println("Собака проплыла 10 метров и развернулась назад");
        } else {
            System.out.println("Собака проплыла " + getSwimDistance() + " метров");
        }
        System.out.println();
    }
}
