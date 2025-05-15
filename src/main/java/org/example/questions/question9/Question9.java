package org.example.questions.question9;

import org.example.data.DataProviderFromCSV;

import java.util.Map;
import java.util.stream.Collectors;

/* В какой день недели совершается наибольшее количество вылетов*/
public class Question9 {
    String result;

    public Question9(DataProviderFromCSV dataProviderFromCSV) {
        result = dataProviderFromCSV.getData().parallelStream()
                .collect(Collectors.groupingBy(
                        fo -> fo.getDayOfWeek(),
                        Collectors.counting()
                )).entrySet().stream().max(Map.Entry.comparingByValue()).get().getKey().toString();
        System.out.println(result);
        this.result = result;
    }

    public String getResult() {
        return result;
    }
}
