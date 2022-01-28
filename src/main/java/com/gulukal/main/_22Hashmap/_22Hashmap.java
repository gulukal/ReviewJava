package com.gulukal.main._22Hashmap;

import java.util.HashMap;
import java.util.Map;

public class _22Hashmap {

    public static void main(String[] args) {

        hashMap();

    }

    public static void create(){

        //hashmap work with key and value
        HashMap<String, String> capitalCities = new HashMap<>();
    }


    public static void hashMap(){

        // Create a HashMap object called capitalCities
        HashMap<String, String> capitalCities = new HashMap<String, String>();

        // Add keys and values (Country, City)
        capitalCities.put("England", "London");
        capitalCities.put("Germany", "Berlin");
        capitalCities.put("Norway", "Oslo");
        capitalCities.put("USA", "Washington DC");


        System.out.println(capitalCities);
        System.out.println(capitalCities.size());
        System.out.println(capitalCities.get("England"));


        for (Map.Entry i: capitalCities.entrySet() ) {
            System.out.println(i.getKey()+" "+ i.getValue());

        }
    }
}
