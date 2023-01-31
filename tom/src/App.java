import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        float grade;
        char letter = 'A';
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please input a grade between 0 and 100");
        grade = scanner.nextFloat();
        while (grade < 0 || grade > 100) {
            System.out.println("Grade must be between 0 and 100. Please input again");
            grade = scanner.nextFloat();

        }
        scanner.close();
        
       
        }


        System.out.println("Grade = " + grade);
        System.out.println("Letter = " + letter);  
    }
}