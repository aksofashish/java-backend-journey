package org.example;
import java.util.ArrayList;

public class GradeCalculator {

    public static double calculateAverage(ArrayList<Integer> scores) {

        int sum = 0;
        for (int score : scores) {
            sum += score;
        }
        return (double) sum / scores.size();
    }

    public static String getLetterGrade(double average) {
        // TODO: Return letter grade based on average
        if (average >= 90) {
            return "A";
        } else if (average >= 80) {
            return "B";
        } else if (average >= 70) {
            return "C";
        } else if (average >= 60) {
            return "D";
        } else {
            return "F";
        }
    }
}