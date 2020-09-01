package com.heritInternational;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import com.heritInternational.animal.*;

public class AnimalFarm {
    private List<Chicken> chickens;
    private Dog dog;
    private Duck duck;

    public AnimalFarm(List<Chicken> chickens, Dog dog, Duck duck) {
        this.chickens = chickens;
        this.dog = dog;
        this.duck=duck;
    }

    public void doSomethingWithAnimals() {

        List<Animal> animals = new ArrayList<>(chickens);
        animals.add(dog);
        animals.add(duck);

        for (Animal animal : animals){
            System.out.println(animal.toString());
            animal.theBiggestAdvantage();
        }


        //new ChickenPack(Chicken1,);
        //Animal.toString
        //ChickenPack.toString
        //DogPack.toString
    }

    @Override
    public String toString() {
        return "AnimalFarm{" +
                "chicken=" + chickens +
                ", dog=" + dog +
                '}';
    }
}
