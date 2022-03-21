package com.company;

public class Main {

    public static void main(String[] args) {
        Animal[] animals = {new Eagle(), new Shark(), new Shark(), new Shark(), new Eagle(), new Turtle()};
        for (Animal animal: animals) {
            if (animal.getClass().getName().equals("com.company.Shark")){
                ((Shark)animal).attack();
            }else if (animal.getClass().getName().equals("com.company.Turtle")){
                ((Turtle)animal).layEgg();
            }else {
                ((Eagle)animal).fly();
            }
        }
        System.out.println();

        Shark[] sharks = new Shark[animals.length];
        Turtle[] turtles = new Turtle[animals.length];
        Eagle[] eagles = new Eagle[animals.length];

        int eaglesCount = 0;
        int sharksCount = 0;
        int turtlesCount = 0;

        for (Animal animal: animals){
            if (animal instanceof Eagle) {
                turtles[turtlesCount] = new Turtle();
                eaglesCount++;
            }
            else if (animal instanceof Shark) {
                sharks[sharksCount] = new Shark();
                sharksCount++;
            } else{
                turtles[turtlesCount] = new Turtle();
                turtlesCount++;
            }
        }
        System.out.println("Eagles: " + eaglesCount);
        System.out.println("Sharks: " + sharksCount);
        System.out.println("Turtles: " + turtlesCount);
    }
}
