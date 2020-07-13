package com.heritInternational.animal;

import java.util.Date;
import java.util.List;

import com.heritInternational.AnimalBody;
import com.heritInternational.AnimalHierarchy;
import com.heritInternational.Profit;
import com.heritInternational.model.Sex;
import com.heritInternational.model.StatusEating;

public class Dog extends Animal implements Guardable {
    private AnimalBody animalBody;
    private short countOfChildren;

    public Dog(
            String animalName,
            AnimalHierarchy animalHierarchy,
            Date born,
            StatusEating isEatable,
            AnimalBody animalBody,
            short countOfChildren,
            List<Profit> dogProfit) {
        super(animalName, animalHierarchy, born, isEatable, dogProfit, Sex.FEMALE);
        this.animalBody = animalBody;
        this.countOfChildren = countOfChildren;
    }

    @Override
    public void theBiggestAdvantage() {
        System.out.println("The biggest advantage of a dog is SECURITY and FRIENDSHIP");
    }

    @Override
    public void guard() {
        System.out.println("Dog can guard your house and your wealth and CHILDREN");
    }

    @Override
    public String toString() {
        return "Dog{" +
            " animalName " + getAnimalName() +
            " animalHierarchy " + getAnimalHierarchy() +
            " dateOfBirth " + getBorn() +
            " Status Eating " + getIsEatable() +
            "animalBody=" + animalBody +
            ", countOfChildren=" + countOfChildren +
            ", dogProfit=" + getAnimalProfit() +
            ", sex=" + getSex() +
            '}';
    }

    @Override
    public void fight() {
        System.out.println("Dog can guard your house");
    }
}
