package org.example.questions.question2;

import org.example.data.DataProviderFromCSV;
import org.example.objects.FlightsObject;

import java.util.HashMap;
import java.util.Map;

public class GenrateMapCanceledCode {
   private Map<String,Integer> mapCancelledCode=new HashMap<>();

    public GenrateMapCanceledCode(DataProviderFromCSV dataProviderFromCSV) {
        for (FlightsObject fo : dataProviderFromCSV.getData()) {
            if (!fo.getCancellationCode().isEmpty()) {
                mapCancelledCode.merge(fo.getCancellationCode(), 1, Integer::sum);

            }
        }
        this.mapCancelledCode = mapCancelledCode;

    }

    public Map<String, Integer> getMapCancelledCode() {
        return mapCancelledCode;
    }
}
