
import org.example.GradeCalculator;
import java.util.ArrayList;
/**
 * Main method - demonstrates usage of the GradeCalculator
 */
public static void main(String[] args) {
    // Create sample scores
    ArrayList<Integer> scores = new ArrayList<>();
    scores.add(85);
    scores.add(92);
    scores.add(78);
    scores.add(90);
    scores.add(88);

    // Calculate and display results
    System.out.println("=== Grade Calculator ===");
    System.out.println("Scores: " + scores);
    System.out.println();

    GradeCalculator calc =  new GradeCalculator();

    double average = calc.calculateAverage(scores);
    System.out.println("Average Score: " + String.format("%.2f", average));

    String grade = calc.getLetterGrade(average);
    System.out.println("Letter Grade: " + grade);
    System.out.println();

    int highest = calc.findHighestScore(scores);
    System.out.println("Highest Score: " + highest);

    int lowest = calc.findLowestScore(scores);
    System.out.println("Lowest Score: " + lowest);

    int passingCount = calc.countPassing(scores);
    System.out.println("Students Passing: " + passingCount + " out of " + scores.size());
    System.out.println("Pass Rate: " + String.format("%.1f%%", (passingCount * 100.0 / scores.size())));

    // Test edge cases
    System.out.println("\n=== Testing Edge Cases ===");

    // Test with boundary scores
    ArrayList<Integer> boundaryScores = new ArrayList<>();
    boundaryScores.add(90);  // A
    boundaryScores.add(80);  // B
    boundaryScores.add(70);  // C
    boundaryScores.add(60);  // D
    boundaryScores.add(59);  // F

    System.out.println("Boundary Scores: " + boundaryScores);
    for (int score : boundaryScores) {
        System.out.println("Score " + score + " = Grade " + calc.getLetterGrade(score));
    }

    // Test error handling (uncomment to test)
    // System.out.println("\n=== Testing Error Handling ===");
    // try {
    //     ArrayList<Integer> emptyList = new ArrayList<>();
    //     calculateAverage(emptyList);  // Should throw exception
    // } catch (IllegalArgumentException e) {
    //     System.out.println("Caught expected exception: " + e.getMessage());
    // }
}