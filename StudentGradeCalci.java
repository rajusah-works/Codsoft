
import java.util.*;
public class StudentGradeCalci {

    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Hello,Please specify the total count of subjects.: ");
        int tot = scanner.nextInt();

        int[] marks = new int[tot];
        int sum = 0;

        for (int i = 0; i < tot; i++){
            System.out.print("We need the marks obtained in each subject,specify it.For Subject" + (i + 1) + ": ");
            marks[i] = scanner.nextInt();
            sum += marks[i];
        }
        scanner.close();
        double averagePercentage = (double) sum / (tot * 100) * 100;

        System.out.println("Your result has been generated.:");
        System.out.println("The total marks you obtained is: " + sum);
        System.out.println("Your Average Percentage is: " + averagePercentage + "%");

        System.out.print("Your Final Grade is: ");
        if (averagePercentage >= 90) 
        {
            System.out.println("A+");
        }
        else if (averagePercentage >= 80)
        {
            System.out.println("A");
        }
        else if (averagePercentage >= 70)
        {
            System.out.println("B");
        }
        else if (averagePercentage >= 60)
        {
            System.out.println("C");
        } 
        else if (averagePercentage >= 50) 
        {
            System.out.println("D");
        } 
        else 
        {
            System.out.println("F");
        }
    }
    
}
