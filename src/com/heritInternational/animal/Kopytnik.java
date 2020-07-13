package com.heritInternational.animal;

import java.util.Date;
import java.util.List;

import com.heritInternational.AnimalHierarchy;
import com.heritInternational.model.Sex;
import com.heritInternational.model.StatusEating;

public class Kopytnik extends Animal {
    private boolean isParnoKopytnik;

    public Kopytnik(String animalName, AnimalHierarchy animalHierarchy, Date born, StatusEating isEatable, boolean isParnoKopytnik, Sex sex) {
        super(animalName, animalHierarchy, born, isEatable, List.of(), sex);
        this.isParnoKopytnik = isParnoKopytnik;
    }

    @Override
    public void theBiggestAdvantage() {

    }
}
