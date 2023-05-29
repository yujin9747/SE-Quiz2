package org.example;

public class Main {
    public static void main(String[] args) {
        int score = 90;

        Grading grading = new Grading();
        Grade grade = grading.getGradingResult(score);

        System.out.println("Score : " + score + ", Grade : " + grade);
    }
}