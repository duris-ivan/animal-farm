package com.heritInternational;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import com.heritInternational.animal.Animal;
import com.heritInternational.animal.Chicken;
import com.heritInternational.animal.Dog;
import com.heritInternational.animal.Flyable;

public class AnimalFarm {
    private List<Chicken> chickens;
    private Dog dog;

    public AnimalFarm(List<Chicken> chickens, Dog dog) {
        this.chickens = chickens;
        this.dog = dog;
    }

    public void doSomethingWithAnimals() {

        List<Animal> animals = new ArrayList<>(chickens);
        animals.add(dog);

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
