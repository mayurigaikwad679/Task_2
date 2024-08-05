import java.util.Scanner;

public class StudentGrades {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the number of subjects:");
        int numSubjects = sc.nextInt();
        
        int marks = 0;
        int totalMarks = 0;
        
        System.out.println("Enter the marks for each subject out of 100:");
        for (int i = 0; i < numSubjects; i++) {
            System.out.print("Subject " + (i + 1) + ": ");
            marks = sc.nextInt();
            totalMarks = totalMarks + marks;
        }
        
        double averagePercentage = (double) totalMarks / numSubjects;
        char grade = calculateGrade(averagePercentage);
        
        System.out.println("\nTotal Marks: " + totalMarks);
        System.out.println("Average Percentage: " + averagePercentage + "%");
        System.out.println("Grade: " + grade);
        
        sc.close();
    }
    
    public static char calculateGrade(double percentage) {
        if (percentage >= 90) {
            return 'A';
        } else if (percentage >= 80) {
            return 'B';
        } else if (percentage >= 70) {
            return 'C';
        } else if (percentage >= 60) {
            return 'D';
        } else {
            return 'F';
        }
    }
}
