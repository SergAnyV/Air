package org.example.data;

import org.example.objects.FlightObjectBuilderFromStringArray;
import org.example.objects.FlightsObject;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class DataProviderFromCSV {
    private List<FlightsObject> data = new ArrayList<>();

// конструктор формирует лист с отфильтрованными объектами типа FlightObject,фильтрация от грязи происходит с
// помощью класса DataChecker и формирование и добавление в лист (строка 23)
    public DataProviderFromCSV(String filePath) {
        try(BufferedReader reader=new BufferedReader(new FileReader(filePath));) {

            String line;
            reader.readLine();//убираем первую строку с названием колонок( можно использовать для поиска номеров столбцов)
            while ((line=reader.readLine())!=null){
            String[] fields=line.split(",");
            if (DataChecker.checkFlightLine(fields)) data.add(FlightObjectBuilderFromStringArray.createFO(fields)); //стр 23
            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }


    public List<FlightsObject> getData() {
        return data;
    }



}

