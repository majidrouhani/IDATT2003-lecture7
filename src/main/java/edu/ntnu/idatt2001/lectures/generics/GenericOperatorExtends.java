package edu.ntnu.idatt2001.lectures.generics;

import java.util.ArrayList;
import java.util.List;

import edu.ntnu.idatt2001.lectures.interfaces.animal.Bird;
import edu.ntnu.idatt2001.lectures.interfaces.animal.Cat;
import edu.ntnu.idatt2001.lectures.interfaces.animal.Fish;
import edu.ntnu.idatt2001.lectures.interfaces.animal.Walkable;

public class GenericOperatorExtends {
    
    static void processWalkable(List<? extends Walkable> a) {
        for (Object element : a) {
             System.out.println(element.toString());
        }
    }

    public static void main(String[] args) {
        List<Cat> cats = new ArrayList<>(); 
        Cat cat1 = new Cat("Luna",4);
        Cat cat2 = new Cat("Rose",4);
        cats.add(cat1);
        cats.add(cat2);

        processWalkable(cats);

        List<Fish> fish = new ArrayList<>(); 
        Fish fish1 = new Fish("salmon");
        Fish fish2 = new Fish("cod");
        fish.add(fish1);
        fish.add(fish2);

        //processWalkable(fish);

        List<Bird> birds = new ArrayList<>(); 
        Bird bird1 = new Bird("Silkie Rooster",2);
        Bird bird2 = new Bird("budgie",2);
        birds.add(bird1);
        birds.add(bird2);

        processWalkable(birds);

    }
}
