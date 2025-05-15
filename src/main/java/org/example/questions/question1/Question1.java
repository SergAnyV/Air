package org.example.questions.question1;

import org.example.data.DataProviderFromCSV;

import java.util.Map;

public class Question1 {
  private String NameOfCompany;
  private double percentOfCancelledFlights;

    public String getNameOfCompany() {
        return NameOfCompany;
    }

    public double getPercentOfCancelledFlights() {
        return percentOfCancelledFlights;
    }

   /*У какой авиакомпании наибольший процент отмененных рейсов (Cancelled)? Ответом должен
быть двухбуквенный код авиаперевозчика (UniqueCarrier) и процентная доля отмененных
рейсов (например: AA, 1.22%). Процентная доля вычисляется как отношение отмененных рейсов
к общему числу совершенных рейсов. Ответ надо представить без округления, как есть.*/

public Question1( DataProviderFromCSV dataProviderFromCSV){

  //  DataProviderFromCSV dataProviderFromCSV=new DataProviderFromCSV(filePath);
    Map<String,Integer> cancelledMap=new GenerateMapWithCancelledFlight(dataProviderFromCSV).getCancelledFlightsMap();
    Map<String,Integer> allFlightsMap=new GenerateMapWithAllOfFlightsCompanies(dataProviderFromCSV).getMapAllFlightsCompanies();
    double maxpercentCancelledFlights = 0, temp;
    String company = "";

    for(Map.Entry<String, Integer> entry : cancelledMap.entrySet()){
        temp=((double) entry.getValue()/allFlightsMap.get(entry.getKey()))*100;
        if(maxpercentCancelledFlights<temp){
            maxpercentCancelledFlights=temp;
            company= entry.getKey();
        }
    }
    this.NameOfCompany=company;
    this.percentOfCancelledFlights=maxpercentCancelledFlights;

}

}
