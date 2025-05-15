package org.example.questions.question4;

import org.example.data.DataProviderFromCSV;
import org.example.objects.FlightsObject;

import java.util.HashMap;
import java.util.Map;
// формирование мапы ключ- аэропорт , значение - количество осещений аэропорта

public class GeneratorMapOfAirportBusy {
 private    Map<String,Integer> generatorMOAB=new HashMap<>();

    public GeneratorMapOfAirportBusy(DataProviderFromCSV dataProviderFromCSV) {
        for (FlightsObject fo:dataProviderFromCSV.getData()){
            generatorMOAB.merge(fo.getOriginAirportID(), 1, Integer::sum);
        }
        this.generatorMOAB = generatorMOAB;
    }


    public Map<String, Integer> getGeneratorMOAB() {
        return generatorMOAB;
    }
}
