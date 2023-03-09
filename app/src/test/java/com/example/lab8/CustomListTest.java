package com.example.lab8;


import static org.junit.jupiter.api.Assertions.assertEquals;


//import org.junit.Before;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

public class CustomListTest {

    private CustomList list;
    /**
     * create a mocklist for my citylist
     * @return
     */
    public CustomList MockCityList(){
        list = new CustomList(null,new ArrayList<>());
        return list;
    }

    /**
     * get the size of the list
     * increase the list by adding a new city
     * check if our current size matches the initial size plus
     one
     */
    @Test
    public void addCityTest(){
        list = MockCityList();
        int listSize = list.getCount();
        list.addCity(new City("Estevan", "SK"));
        assertEquals(list.getCount(),listSize + 1);
    }

    /**
     * make city list
     * check if list has city
     * add city
     * check if list has city
     one
     */
    @Test
    public void hasCityTest(){
        list = MockCityList();
        City newCity = new City("Estevan","SK");
        assertEquals(list.hasCity(newCity),false);
        list.addCity(newCity);
        assertEquals(list.hasCity(newCity),true);

    }

    /**
     * make cityList
     * add city
     * check if list has city
     * remove city
     * check if list has city
     */
    @Test
    public void deleteCityTest(){
        list = MockCityList();
        City newCity = new City("Estevan","SK");
        list.addCity(newCity);
        assertEquals(list.hasCity(newCity),true);
        list.deleteCity(newCity);
        assertEquals(list.hasCity(newCity),false);
    }

    /**
     * make cityList
     * add city
     * check size of list
     * add another city
     * check size of list
     */
    @Test
    public void countCityTest(){
        list = MockCityList();
        City newCity = new City("Estevan","SK");
        City newCity2 = new City("Estevan","SK");
        list.addCity(newCity);
        assertEquals(list.countCities(),1);
        list.addCity(newCity2);
        assertEquals(list.countCities(),2);
    }
}
