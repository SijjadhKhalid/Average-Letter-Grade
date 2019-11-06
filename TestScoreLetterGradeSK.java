//Sijjad Khalid
//11-20/17
//Test Score Average

import java.util.*;
public class TestScoreLetterGradeSK {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int score1, score2, score3, score4, score5, average;
        String letterGrade, score1Grade, score2Grade, score3Grade, score4Grade, score5Grade;

        //Directions
        System.out.println("This program will ask you to enter five test scores and give you");
        System.out.println(" back the average and the letter grade corresponding to your scores.");

        //User Input
        System.out.println("Enter your first score.");
        score1 = input.nextInt();
        System.out.println("Enter your Second Score.");
        score2 = input.nextInt();
        System.out.println("Enter your third score.");
        score3 = input.nextInt();
        System.out.println("Enter your fourth score.");
        score4 = input.nextInt();
        System.out.println("Enter your fifth score.");
        score5 = input.nextInt();

        //Send Scores to calcAverage method and return an average
        average = calcAverage(score1, score2, score3, score4, score5);

        //send average to determine grade method and return letter grade
        letterGrade = determineGrade(average);

        //send scores to method and receive letter grade
        score1Grade = determineGrade(score1);
        score2Grade = determineGrade(score2);
        score3Grade = determineGrade(score3);
        score4Grade = determineGrade(score4);
        score5Grade = determineGrade(score5);

        //Display
        System.out.println("    Score             Letter Grade");
        System.out.println("____________________________________\n");
        System.out.println("Test 1 =   "+score1+"                   "+score1Grade);
        System.out.println("Test 2 =   "+score2+"                   "+score2Grade);
        System.out.println("Test 3 =   "+score3+"                   "+score3Grade);
        System.out.println("Test 4 =   "+score4+"                   "+score4Grade);
        System.out.println("Test 5 =   "+score5+"                   "+score5Grade);
        System.out.println("Average =  "+average+"                   "+letterGrade);


    }

    private static int calcAverage(int firstSc, int secondSc, int thirdSc, int fourthSC, int fifthSc) {
        //calculate the average
        int totalAverage = (firstSc + secondSc + thirdSc + fourthSC + fifthSc) / 5;
        return (totalAverage);
    }//End Method

    private static String determineGrade(int grade) {
        String letter = "";
        if (grade >= 90 && grade <= 100) {
            letter = "A"; }
        if (grade >= 80 && grade <= 89) {
            letter = "B"; }
        if (grade >= 70 && grade <= 79) {
            letter = "C"; }
        if (grade >= 60 && grade <= 69) {
            letter = "D"; }
        if (grade < 60) {
            letter = "F"; }
        return (letter);

        }
    }