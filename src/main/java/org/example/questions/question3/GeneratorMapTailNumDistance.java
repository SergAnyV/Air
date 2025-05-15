package org.example.questions.question3;

import org.example.data.DataProviderFromCSV;
import org.example.objects.FlightsObject;

import java.util.HashMap;
import java.util.Map;

public class GeneratorMapTailNumDistance {
    private Map<String, Integer> mapTailNumDistance = new HashMap<>();

    public GeneratorMapTailNumDistance(DataProviderFromCSV dataProviderFromCSV) {
        for (FlightsObject fo : dataProviderFromCSV.getData()) {
            if (!fo.getTailNum().isEmpty() && !fo.getTailNum().equals(" ")) {
                mapTailNumDistance.merge(fo.getTailNum(), Integer.parseInt(fo.getDistance()), Integer::sum);
            }
        }

    }

    public Map<String, Integer> getMapTailNumDistance() {
        return mapTailNumDistance;
    }
}
