package ru.geekbtains.homework6;

public abstract class Animal {

    private int runDistance;
    private int swimDistance;
    static int animalCount;

    public Animal (int runDistance, int swimDistance) {
        this.runDistance = runDistance;
        this.swimDistance = swimDistance;
        animalCount +=1;
    }



    public void runAnimal () {
            System.out.println("Живаотное может пробежать " + runDistance + " метров");
        }

        abstract void swimAnimal ();


    public int getRunDistance() {

        return runDistance;
    }

    public void setRunDistance(int runDistance) {
        this.runDistance = runDistance;
    }

    public int getSwimDistance() {

        return swimDistance;
    }

    public void setSwimDistance(int swimDistance) {

        this.swimDistance = swimDistance;
    }
}
