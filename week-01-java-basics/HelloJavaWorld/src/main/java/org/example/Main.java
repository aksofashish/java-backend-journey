
import org.example.HelloWorld;
import org.example.GradeCalculator;
import java.util.ArrayList;

public static void main(String[] args) {

    HelloWorld hello  = new HelloWorld();
    String message = hello.greet("Java Developer");
    System.out.println(message);
    ArrayList<Integer> numbers = new ArrayList<>();
    numbers.add(1);
    numbers.add(2);
    numbers.add(3);
    numbers.add(4);  // ✅ Can grow!
    numbers.remove(Integer.valueOf(2));  // Can shrink
    System.out.println(numbers);

    ArrayList<Integer> scores = new ArrayList<>();
    scores.add(85);
    scores.add(92);
    scores.add(78);
    scores.add(90);
    scores.add(88);

    GradeCalculator grade =  new GradeCalculator();

    double average = grade.calculateAverage(scores);
    String grd = grade.getLetterGrade(average);

    System.out.println("Average: " + average);
    System.out.println("Letter Grade: " + grd);




}