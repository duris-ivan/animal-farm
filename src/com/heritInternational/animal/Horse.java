package com.heritInternational.animal;

import java.util.Date;
import java.util.List;

import com.heritInternational.AnimalBody;
import com.heritInternational.AnimalHierarchy;
import com.heritInternational.Profit;
import com.heritInternational.model.Sex;
import com.heritInternational.model.StatusEating;

public class Horse extends Kopytnik implements Soundable{
    private AnimalBody animalBody;
    private short countOfChildren;
    private List<Profit> chickenProfit;

    public Horse(String animalName, AnimalHierarchy animalHierarchy, Date born, StatusEating isEatable, AnimalBody animalBody, List<Profit> chickenProfit) {
        super(animalName, animalHierarchy, born, isEatable, true, Sex.MALE);
        this.animalBody = animalBody;
        this.chickenProfit = chickenProfit;
        //this.countOfChildren=countOfChildren;
    }

    public Horse(String animalName, AnimalHierarchy animalHierarchy, Date born, StatusEating isEatable, AnimalBody animalBody, short countOfChildren, List<Profit> chickenProfit) {
        super(animalName, animalHierarchy, born, isEatable, true, Sex.FEMALE);
        this.animalBody = animalBody;
        this.countOfChildren = countOfChildren;
        this.chickenProfit = chickenProfit;
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
            ", chickenProfit=" + chickenProfit +
            ", sex=" + getSex() +
            '}';
    }

    @Override
    public void makeSound() {
        System.out.println("---Horse's Voice:--- Pffffrrrrr !!!");
    }
}
