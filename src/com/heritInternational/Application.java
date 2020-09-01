package com.heritInternational;

import java.util.Date;
import java.util.List;
import java.util.Scanner;

import com.heritInternational.animal.*;
import com.heritInternational.model.Beak;
import com.heritInternational.model.Lip;
import com.heritInternational.model.Phylum;
import com.heritInternational.model.Sex;
import com.heritInternational.model.StatusEating;
import com.heritInternational.model.UnitOfProfit;
import com.heritInternational.model.Voice;
import com.heritInternational.model.Wings;

public class Application {

    public static void main(String[] args) {

        List<Profit> dogProfit = List.of(
            new Profit("Security", 24, UnitOfProfit.hoursPerDay)
        );

        List<Profit> cattleProfit = List.of(
            new Profit("Milk",4,UnitOfProfit.LitersPerDay)
        );

        List<Profit> chickenProfit = List.of(
            new Profit("Eggs",5 )
        );

        AnimalBody chickenBodyFemale = new AnimalBody(Beak.yes, Wings.Long, Sex.FEMALE, (byte) 2, (byte) 3, Voice.KOTKOTKODAAAK);
        AnimalBody chickenBodyMale = new AnimalBody(Beak.yes,Wings.Short,Sex.MALE, (byte) 2, (byte) 3,Voice.KIKIRIKI);

        AnimalBody dogBodyFemale = new AnimalBody(Lip.yes,Sex.FEMALE,(byte) 4, (byte)4,Voice.VUFF,(short) 30);
        AnimalBody dogBodyMale = new AnimalBody(Lip.yes,Sex.MALE,(byte) 4, (byte)4,Voice.VUFF, (short) 45);


        AnimalHierarchy chickenHierarchy = new AnimalHierarchy(
            "Gallus gallus domesticus", Phylum.CHORDATA,"Phasianidae"
        );
        AnimalHierarchy dogHierarchy = new AnimalHierarchy(
            "DogusNameLatinus", Phylum.CHORDATA,"DogusFamily"
        );

        /*Animal[] animals = {

                new Chicken("Beta Kotkot s deťmi",chickenHierarchy,new Date(),StatusEating.isEatable,chickenBodyFemale, (short) 30, chickenProfit),
                new Dog("Nera Somorcikova", dogHierarchy,new Date(), StatusEating.isNotEatable,dogBodyFemale,(short) 0,dogProfit),
        };
                 */
        List<Chicken> chickens = List.of(
            new Chicken("Kristian Kohút",chickenHierarchy,new Date(),StatusEating.isEatable,chickenBodyMale,chickenProfit),
            new Chicken("Beta Kotkot s deťmi",chickenHierarchy,new Date(),StatusEating.isEatable,chickenBodyFemale, (short) 30, chickenProfit)

        );

        Dog dogNeraSom = new Dog("Nera Somorcikova", dogHierarchy,new Date(), StatusEating.isNotEatable,dogBodyFemale,(short) 0,dogProfit);
        Chicken chicken = new Chicken("Beta Kotkot s deťmi",chickenHierarchy,new Date(),StatusEating.isEatable,chickenBodyFemale, (short) 30, chickenProfit);

        Flyable falco = chicken;
        //falco.fly();
        Moveable falco2 = chicken;
        //falco2.move();
        Chicken falco3 = chicken;

        Moveable moveableFalco = chicken;
        //moveableFalco.move();
        //falco.fly();
        //chicken.theBiggestAdvantage();
        //chicken.fly();

        Flyable falco_4= chicken;
        //falco_4.letiet();
        Moveable falco_5= chicken;
        //falco_5.move();


        Horse horse1 = new Horse(null, null, null, null, null, null);
        Kopytnik kopytnik1 = horse1;

        Dog dog = new Dog(null, null, null, null, null, (byte) 0, List.of());

        Duck duck28 = new Duck("Kacka",chickenHierarchy,new Date(),StatusEating.isEatable,chickenBodyFemale, (short) 30, chickenProfit);

        //canFly(duck28);

        //new AnimalFarm(chickens, dogNeraSom, duck28).doSomethingWithAnimals();
        Scanner sc = new Scanner(System.in);

        while (true){
            System.out.println("Enter the animal whom sound you wanna hear.../chicken / dog / duck / horse /");
            String animal_choice = sc.nextLine().toLowerCase();




            switch(animal_choice){
                case "chicken":
                    chicken.makeSound();
                    break;
                case "dog":
                    dog.makeSound();
                    break;
                case "duck":
                    duck28.makeSound();
                    break;
                case "horse":
                    horse1.makeSound();
                    break;
                default:
                    System.out.println("animal not recognised");
                    break;
            }
        }



    }

    private static void canFly(Flyable flyable) {
        flyable.fly();
    }

}
