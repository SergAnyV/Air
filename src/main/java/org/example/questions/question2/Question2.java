package org.example.questions.question2;

import org.example.data.DataProviderFromCSV;

import java.util.Map;

public class Question2 {
    private String result;

    public String getResult() {
        return result;
    }
    /* По какой причине рейсы отменялись чаще всего? Ответом должен быть однобуквенный код.*/

    public Question2(DataProviderFromCSV dataProviderFromCSV) {
        Map<String, Integer> mcc = new GenrateMapCanceledCode(dataProviderFromCSV).getMapCancelledCode();
        String result = mcc.entrySet().stream().max(Map.Entry.comparingByValue())
                .map(s -> s.getKey()).get();
        this.result = result;
    }

}
