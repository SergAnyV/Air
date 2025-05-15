package org.example.questions.question4;

import org.example.data.DataProviderFromCSV;

import java.util.Map;

/*Какой аэропорт был самым загруженным с точки зрения количества прибывающих и
вылетающих рейсов? Ответом должен быть идентификатор OriginAirportID */
public class Question4 {
    private String result;

    public Question4(DataProviderFromCSV dataProviderFromCSV) {
        GeneratorMapOfAirportBusy generatorMapOfAirportBusy=new GeneratorMapOfAirportBusy(dataProviderFromCSV);
        result= generatorMapOfAirportBusy.getGeneratorMOAB().entrySet().stream()
                .max(Map.Entry.comparingByValue())
                .map(s->s.getKey()).get();

        this.result = result;
    }

    public String getResult() {
        return result;
    }
}
