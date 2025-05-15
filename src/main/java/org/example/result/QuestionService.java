package org.example.result;

import org.example.FormattedOutput;
import org.example.data.DataProviderFromCSV;
import org.example.questions.question1.Question1;
import org.example.questions.question2.Question2;
import org.example.questions.question3.Question3;
import org.example.questions.question4.Question4;
import org.example.questions.question5.Question5;
import org.example.questions.question6.Question6;
import org.example.questions.question7.Question7;
import org.example.questions.question8.Question8;
import org.example.questions.question9.Question9;

//Формирование ответов и добавление их в список
public class QuestionService {


    public static void calculAllResultsAndWriteToTheFile(String filePath) {
        FormattedOutput output = new FormattedOutput();
        DataProviderFromCSV dataProviderFromCSV = new DataProviderFromCSV(filePath);

        Question1 first = new Question1(dataProviderFromCSV);
        String firstQ = first.getNameOfCompany() + "," + first.getPercentOfCancelledFlights();
        output.addAnswer(1, firstQ);


        Question2 secondQ = new Question2(dataProviderFromCSV);
        output.addAnswer(2, secondQ.getResult());


        Question3 thirdQ = new Question3(dataProviderFromCSV);
        output.addAnswer(3, thirdQ.getResult());


        Question4 fourQ=new Question4(dataProviderFromCSV);
        output.addAnswer(4,fourQ.getResult());


        Question5 fiveQ=new Question5(dataProviderFromCSV);
        output.addAnswer(5,fiveQ.getResult());


        Question6 sixQ=new Question6(dataProviderFromCSV);
        output.addAnswer(6,sixQ.getResult());


        Question7 sevenQ= new Question7(dataProviderFromCSV);
        output.addAnswer(7,sevenQ.getResult());


        Question8 eightQ=new Question8(dataProviderFromCSV);
       output.addAnswer(8,eightQ.getResult());


        Question9 nineQ=new Question9(dataProviderFromCSV);
        output.addAnswer(9,nineQ.getResult());
        // запись результатов в файл
        output.writeAnswers();

    }

}
