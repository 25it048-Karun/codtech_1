import java.util.Scanner;

public class QuizApplication {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] questions = {
            "1. What is the capital of India?\nA. Mumbai\nB. Delhi\nC. Chennai\nD. Kolkata",
            "2. Which language is used for Android Development?\nA. Python\nB. C\nC. Java\nD. PHP",
            "3. Who is known as the Father of Computers?\nA. Charles Babbage\nB. Newton\nC. Einstein\nD. Edison",
            "4. Which data structure follows FIFO?\nA. Stack\nB. Queue\nC. Tree\nD. Graph",
            "5. What is the extension of Java bytecode files?\nA. .java\nB. .exe\nC. .class\nD. .txt"
        };

        char[] answers = {'B', 'C', 'A', 'B', 'C'};

        int score = 0;

        System.out.println("===== QUIZ APPLICATION =====");

        for (int i = 0; i < questions.length; i++) {
            System.out.println("\n" + questions[i]);
            System.out.print("Your Answer: ");
            char userAnswer = Character.toUpperCase(sc.next().charAt(0));

            if (userAnswer == answers[i]) {
                System.out.println("Correct!");
                score++;
            } else {
                System.out.println("Wrong! Correct Answer: " + answers[i]);
            }
        }

        System.out.println("\n===== RESULT =====");
        System.out.println("Total Questions: " + questions.length);
        System.out.println("Correct Answers: " + score);
        System.out.println("Wrong Answers: " + (questions.length - score));

        double percentage = (score * 100.0) / questions.length;
        System.out.println("Percentage: " + percentage + "%");

        if (percentage >= 80) {
            System.out.println("Grade: A");
        } else if (percentage >= 60) {
            System.out.println("Grade: B");
        } else if (percentage >= 40) {
            System.out.println("Grade: C");
        } else {
            System.out.println("Grade: Fail");
        }

        sc.close();
    }
}
