package com.heritInternational.animal;

import java.util.Date;
import java.util.List;

import com.heritInternational.AnimalHierarchy;
import com.heritInternational.Profit;
import com.heritInternational.model.Sex;
import com.heritInternational.model.StatusEating;

public abstract class Animal {
    private String animalName;
    private AnimalHierarchy animalHierarchy;
    private Date born;
    private StatusEating isEatable;
    private List<Profit> animalProfit;
    private Sex sex;

    public Animal(String animalName, AnimalHierarchy animalHierarchy, Date born, StatusEating isEatable, List<Profit> animalProfit, Sex sex) {
        this.animalName = animalName;
        this.animalHierarchy = animalHierarchy;
        this.born = born;
        this.isEatable = isEatable;
        this.animalProfit = animalProfit;
        this.sex = sex;
    }

    public abstract void theBiggestAdvantage();

    public String getAnimalName() {
        return animalName;
    }

    public AnimalHierarchy getAnimalHierarchy() {
        return animalHierarchy;
    }

    public Date getBorn() {
        return born;
    }

    public StatusEating getIsEatable() {
        return isEatable;
    }

    public List<Profit> getAnimalProfit() {
        return animalProfit;
    }

    public Sex getSex() {
        return sex;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "animalName='" + animalName + '\'' +
                ", animalHierarchy=" + animalHierarchy +
                ", born=" + born +
                ", isEatable=" + isEatable +
                '}';
    }
}
