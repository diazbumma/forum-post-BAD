package com.diazbumma;

import java.util.ArrayList;
import java.util.List;

public class CollectionList {

    static void checkPlanets(List<String> planets) {
        System.out.println(planets.size() == 8 ? "Solar System" : "Uh oh, there is an impostor among us!");
    }

    public static void main(String[] args) {
        List<String> magnificentObject = new ArrayList<>();

        magnificentObject.add("mercury");
        magnificentObject.add("venus");
        magnificentObject.add("earth");
        magnificentObject.add("mars");
        magnificentObject.add("jupiter");
        magnificentObject.add("saturn");
        magnificentObject.add("uranus");
        magnificentObject.add("neptune");

        List<String> planets = new ArrayList<>(magnificentObject);

        planets.add("pluto");

        checkPlanets(planets);
    }
}
