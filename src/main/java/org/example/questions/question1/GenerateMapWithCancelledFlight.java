package org.example.questions.question1;

import org.example.data.DataProviderFromCSV;
import org.example.objects.FlightsObject;

import java.util.HashMap;
import java.util.Map;

// класс предназначен для преобразования (отфильтрованного листа с объектами)-> в мапу где ключ-название компании ,
// значение- количество ОТМЕНЕННЫХ рейсов для данной компания

public class GenerateMapWithCancelledFlight {
    private Map<String, Integer> cancelledFlightsMap = new HashMap<>();

    //конструктор собирает мапу с именами компаний и количеством ОТМЕНЕННЫХ рейсов

    public GenerateMapWithCancelledFlight(DataProviderFromCSV dataProviderFromCSV) {
        for (FlightsObject fo : dataProviderFromCSV.getData()) {
            if (fo.getCancelled().equals("1")) {
                cancelledFlightsMap.merge(fo.getUniqueCarrier(), 1, Integer::sum);

            }
        }

    }

    public Map<String, Integer> getCancelledFlightsMap() {
        return cancelledFlightsMap;
    }
}
