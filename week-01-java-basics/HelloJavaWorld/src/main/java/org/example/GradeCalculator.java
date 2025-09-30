package org.example;

import java.util.ArrayList;

/**
 * GradeCalculator - Calculates average scores and determines letter grades
 *
 * @author Ashish
 * @version 1.0
 */
public class GradeCalculator {

    /**
     * Calculates the average of a list of scores
     *
     * @param scores ArrayList of Integer scores
     * @return average as a double
     * @throws IllegalArgumentException if scores list is null or empty
     */
    public static double calculateAverage(ArrayList<Integer> scores) {
        // Input validation - handle edge cases
        if (scores == null || scores.isEmpty()) {
            throw new IllegalArgumentException("Scores list cannot be null or empty");
        }

        // Validate individual scores are in valid range
        for (int score : scores) {
            if (score < 0 || score > 100) {
                throw new IllegalArgumentException("Score must be between 0 and 100: " + score);
            }
        }

        int sum = 0;
        for (int score : scores) {
            sum += score;
        }
        return (double) sum / scores.size();
    }

    /**
     * Determines letter grade based on average score
     *
     * Grading scale:
     * A: 90-100
     * B: 80-89
     * C: 70-79
     * D: 60-69
     * F: 0-59
     *
     * @param average the average score as a double
     * @return letter grade as a String
     * @throws IllegalArgumentException if average is not in range 0-100
     */
    public static String getLetterGrade(double average) {
        // Input validation
        if (average < 0 || average > 100) {
            throw new IllegalArgumentException("Average must be between 0 and 100");
        }

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

    /**
     * Finds the highest score in the list
     *
     * @param scores ArrayList of Integer scores
     * @return the highest score
     * @throws IllegalArgumentException if scores list is null or empty
     */
    public static int findHighestScore(ArrayList<Integer> scores) {
        if (scores == null || scores.isEmpty()) {
            throw new IllegalArgumentException("Scores list cannot be null or empty");
        }

        int highest = scores.get(0);
        for (int score : scores) {
            if (score > highest) {
                highest = score;
            }
        }
        return highest;
    }

    /**
     * Finds the lowest score in the list
     *
     * @param scores ArrayList of Integer scores
     * @return the lowest score
     * @throws IllegalArgumentException if scores list is null or empty
     */
    public static int findLowestScore(ArrayList<Integer> scores) {
        if (scores == null || scores.isEmpty()) {
            throw new IllegalArgumentException("Scores list cannot be null or empty");
        }

        int lowest = scores.get(0);
        for (int score : scores) {
            if (score < lowest) {
                lowest = score;
            }
        }
        return lowest;
    }

    /**
     * Counts how many students passed (score >= 60)
     *
     * @param scores ArrayList of Integer scores
     * @return count of passing scores
     */
    public static int countPassing(ArrayList<Integer> scores) {
        if (scores == null || scores.isEmpty()) {
            return 0;
        }

        int passingCount = 0;
        for (int score : scores) {
            if (score >= 60) {
                passingCount++;
            }
        }
        return passingCount;
    }

}