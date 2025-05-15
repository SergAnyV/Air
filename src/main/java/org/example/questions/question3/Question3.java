package org.example.questions.question3;

import org.example.data.DataProviderFromCSV;

import java.util.Map;

/*Какой именно борт (TailNum) налетал наибольшее число миль? Ответом должен быть полный
номер борта */

public class Question3 {
    private String result;

    public Question3(DataProviderFromCSV dataProviderFromCSV) {
        GeneratorMapTailNumDistance generatorMapTailNumDistance=new GeneratorMapTailNumDistance(dataProviderFromCSV);
        String result= generatorMapTailNumDistance.getMapTailNumDistance().entrySet().stream()
                .max(Map.Entry.comparingByValue()).map(s->s.getKey()).get();
        this.result = result;
    }

    public String getResult() {
        return result;
    }
}
