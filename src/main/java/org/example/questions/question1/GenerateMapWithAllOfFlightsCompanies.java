package org.example.questions.question1;

import org.example.data.DataProviderFromCSV;
import org.example.objects.FlightsObject;

import java.util.HashMap;
import java.util.Map;

// класс предназначен для преобразования (отфильтрованного листа с объектами)-> в мапу где ключ-название компании ,
// значение- количество рейсов которые совершила компания


public class GenerateMapWithAllOfFlightsCompanies {
    private  Map<String,Integer> mapAllFlightsCompanies= new HashMap<>();

//конструктор собирает мапу с именами компаний и количеством совершенных рейсов


    public GenerateMapWithAllOfFlightsCompanies(DataProviderFromCSV dataProviderFromCSV) {
        for (FlightsObject fo:dataProviderFromCSV.getData()){
            mapAllFlightsCompanies.merge(fo.getUniqueCarrier(), 1, Integer::sum);

        }

    }

    public Map<String, Integer> getMapAllFlightsCompanies() {
        return mapAllFlightsCompanies;
    }
}
