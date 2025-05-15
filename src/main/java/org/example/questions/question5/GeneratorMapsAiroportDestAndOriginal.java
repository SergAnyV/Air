package org.example.questions.question5;

import org.example.data.DataProviderFromCSV;
import org.example.objects.FlightsObject;

import java.util.HashMap;
import java.util.Map;

/*Какой аэропорт был самым активным «источником» (source) рейсов? Этот показатель
вычисляется как разница между прибывающими и вылетающими рейсами. Ответом должен
быть идентификатор OriginAirportID . В ответе на этот вопрос не должны
участвовать отменные рейсы.*/

public class GeneratorMapsAiroportDestAndOriginal {
    private Map<String, Integer> mapAiroportDest = new HashMap<>();
    private Map<String, Integer> mapAiroportOriginal = new HashMap<>();

    // формирование мап в конструкотре ключ- аэропорт(прибытия или отправления) , значение - количество осещений аэропорта

    public GeneratorMapsAiroportDestAndOriginal(DataProviderFromCSV dataProviderFromCSV) {
        for (FlightsObject fo : dataProviderFromCSV.getData()) {
            if (fo.getDestAirportID()!=null&& !fo.getDestAirportID().trim().isEmpty()
                    && fo.getOriginAirportID()!=null&&!fo.getOriginAirportID().trim().isEmpty()) {
                mapAiroportDest.merge(fo.getDestAirportID(), 1, Integer::sum);
                mapAiroportOriginal.merge(fo.getOriginAirportID(), 1, Integer::sum);
            }
        }

    }

    public Map<String, Integer> getMapAiroportDest() {
        return mapAiroportDest;
    }

    public Map<String, Integer> getMapAiroportOriginal() {
        return mapAiroportOriginal;
    }
}
