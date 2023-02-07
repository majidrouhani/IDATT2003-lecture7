package edu.ntnu.idatt2001.lectures.generics;

import java.util.ArrayList;
import java.util.List;

import edu.ntnu.idatt2001.lectures.interfaces.animal.Exocoetidae;
import edu.ntnu.idatt2001.lectures.interfaces.animal.Fish;

public class GenericOperatorSuper {
    
    static void processWalkable(List<? super Exocoetidae> a) {
        for (Object element : a) {
             System.out.println(element.toString());
        }
    }

    public static void main(String[] args) {

        List<Fish> fish = new ArrayList<>(); 
        Fish fish1 = new Fish("salmon");
        Exocoetidae flyingFish1 = new Exocoetidae("exocoetidae");
    
        fish.add(fish1);
        fish.add(flyingFish1);

        processWalkable(fish);

    }
}
