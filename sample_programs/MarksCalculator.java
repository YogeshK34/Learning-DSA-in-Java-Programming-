package sample_programs;

import java.util.Scanner;
public class MarksCalculator {
    public static void main(String[] args) {
        calculateMarks();
    }
    // Program to calculate the negative marking and correct answer
    static void calculateMarks(){
        float correctQues;
        float wrongAns;
        float totalMarks;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the correct answers: ");
        correctQues = sc.nextInt();

        System.out.print("Enter the wrongAnswers: ");
        wrongAns = sc.nextInt();

        totalMarks =  correctQues - (wrongAns / 3);
        System.out.println(totalMarks);
        System.out.print("Each correct answers carries 1 mark whereas each wrong answers deducts 0.75 marks");
    }
}