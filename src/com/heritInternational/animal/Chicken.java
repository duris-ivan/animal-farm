package com.heritInternational.animal;

import java.util.Date;
import java.util.List;

import com.heritInternational.AnimalBody;
import com.heritInternational.AnimalHierarchy;
import com.heritInternational.Profit;
import com.heritInternational.model.Sex;
import com.heritInternational.model.StatusEating;

public class Chicken extends Animal implements Flyable, Moveable, Soundable {
    private AnimalBody animalBody;
    private short countOfChildren;

    public Chicken(String animalName, AnimalHierarchy animalHierarchy, Date born, StatusEating isEatable, AnimalBody animalBody, List<Profit> chickenProfit) {
        super(animalName, animalHierarchy, born, isEatable, chickenProfit, Sex.MALE);
        this.animalBody = animalBody;
    }

    public Chicken(String animalName, AnimalHierarchy animalHierarchy, Date born, StatusEating isEatable, AnimalBody animalBody, short countOfChildren, List<Profit> chickenProfit) {
        super(animalName, animalHierarchy, born, isEatable, chickenProfit, Sex.FEMALE);
        this.animalBody = animalBody;
        this.countOfChildren = countOfChildren;
    }



    @Override
    public void theBiggestAdvantage() {
        System.out.println("The biggest advantage of chickens is to produce meat and eggs");
    }

    @Override
    public String toString() {
        return "Chicken{" +
            " animalName " + getAnimalName() +
            " animalHierarchy " + getAnimalHierarchy() +
            " dateOfBirth " + getBorn() +
            " Status Eating " + getIsEatable() +
            ", animalBody =" + animalBody +
            ", countOfChildren=" + countOfChildren +
            ", chickenProfit=" + getAnimalProfit() +
            ", sex=" + getSex() +
            '}';
    }

    @Override
    public void fly() {
        System.out.println("Chicken can fly?");

    }

    @Override
    public void letiet() {
        System.out.println("chicken can letiet");
    }

    @Override
    public void move() {
        System.out.println("Chicken can move");
    }

    @Override
    public void makeSound() {System.out.println("---Chicken Voice:--- Kikiriki"); }
}
