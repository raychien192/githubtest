package com.example.model;

import java.util.*;

public class BeerExpert {

    public List getBrands(String color){

        List brands = new ArrayList ();
        if (color.equals("amber")){
            brands.add("Jack Amber");
            brands.add("Red Truck");

        } else {
            brands.add("Jail Pail Ale");
            brands.add("Gout Stout");
        }
        return (brands);
    }
}