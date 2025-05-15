package org.example;

import org.junit.BeforeClass;
import org.junit.Test;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

import static org.junit.Assert.assertEquals;

/**
 * Used for sanity check for the Data Science with Airlines Project.
 * Ensure your answers are stored in a file called answers.txt.
 */
public class ValidationTest {

    static ArrayList<String> answers;

    @BeforeClass
    public static void setUpBeforeClass() throws Exception {
        answers = new ArrayList<>();
        File inputFile = new File("answers.txt");

        // Reads in the answers from answers.txt
        try (Scanner in = new Scanner(inputFile)) {

            while (in.hasNextLine()) {
                answers.add(in.nextLine());
            }

        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("Check that your file is being written properly!");
        }

    }

    @Test
    public void allQuestionsAnsweredTest() {
        assertEquals("Check that you are answering all 9 questions!", 9, answers.size());
    }

    @Test
    public void questionOneCancelledFlights() {
        String answer = answers.get(0);
        String carrier = answer.split(",")[0];
        Double percent = Double.parseDouble(answer.split(",")[1].substring(0, 4));  // Answer to the nearest 0.1%

        assertEquals("Carrier is wrong, should be AA", ".....", carrier.toUpperCase());
        assertEquals("Percent cancelled is wrong; should be around 1.29%", 1.29, percent, 0.1);
    }

    @Test
    public void questionTwoMostCommonCancellation() {
        String answer = answers.get(0);
        assertEquals("Cancellation code is wrong, should be '....'", ".....", answer.toUpperCase());
    }

    @Test
    public void questionThreeFurthestTailNum() {
        String answer = answers.get(0);
        assertEquals("Not the correct tail number.  Was expected .....", "......", answer.toUpperCase());
    }

    @Test
    public void questionFourBusiestAirport() {
        String answer = answers.get(0);
        assertEquals("Incorrect busiest airport; Expected ......", 0, Integer.parseInt(answer));
    }

    @Test
    public void questionFiveSource() {
        String answer = answers.get(0);
        assertEquals("Incorrect airport; Expected ......", 0, Integer.parseInt(answer));
    }

    @Test
    public void questionSixSink() {
        String answer = answers.get(0);
        assertEquals("Incorrect airport; Expected .....", 0, Integer.parseInt(answer));
    }

    @Test
    public void questionSevenDelays() {
        String answer = answers.get(0);
        assertEquals("Incorrect answer; Expected ......", 0, Integer.parseInt(answer));
    }

    @Test
    public void questionEightMadeupDelay() {
        String answer = answers.get(7);
        String parsed[] = answer.split(",");
        assertEquals("Expected the day of month to be ...", 0, Integer.parseInt(parsed[0]));
        assertEquals("Expected the departure delay to be ...", 0, Integer.parseInt(parsed[1]));
        assertEquals("Expected the tail number to be ....", ".....", parsed[2].toUpperCase());
    }

}
