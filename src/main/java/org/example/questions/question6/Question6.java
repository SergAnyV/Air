package org.example.questions.question6;

import org.example.data.DataProviderFromCSV;
import org.example.questions.question5.GeneratorMapsAiroportDestAndOriginal;

import java.util.Map;

public class Question6 {
 private    String result;

    public Question6(DataProviderFromCSV dataProviderFromCSV) {
        GeneratorMapsAiroportDestAndOriginal mgADO = new GeneratorMapsAiroportDestAndOriginal(dataProviderFromCSV);
        Map<String, Integer> mapAiroprDest = mgADO.getMapAiroportDest();
        Map<String, Integer> mapAiroprtOrig = mgADO.getMapAiroportOriginal();
        int temp = 0;

        for (Map.Entry<String, Integer> dest : mapAiroprDest.entrySet()) {
            String airportKey = dest.getKey();
            if (mapAiroprtOrig.containsKey(airportKey)
                    && temp < dest.getValue() - mapAiroprtOrig.get(airportKey)) {
                temp = dest.getValue() - mapAiroprtOrig.get(airportKey);
                result = airportKey;

            }

        }

    }

    public String getResult() {
        return result;
    }
}
