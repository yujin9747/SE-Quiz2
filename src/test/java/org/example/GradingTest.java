package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GradingTest {

    @Test
    void getGrading_A() {
        // given
        Grading grading = new Grading();
        int score = 90;

        // when
        Grade grade = grading.getGradingResult(score);

        //then
        assertEquals(Grade.A, grade);
    }

    @Test
    void getGrading_B() {
        // given
        Grading grading = new Grading();
        int score = 80;

        // when
        Grade grade = grading.getGradingResult(score);

        //then
        assertEquals(Grade.B, grade);
    }

    @Test
    void getGrading_C() {
        // given
        Grading grading = new Grading();
        int score = 70;

        // when
        Grade grade = grading.getGradingResult(score);

        //then
        assertEquals(Grade.C, grade);
    }

    @Test
    void getGrading_D() {
        // given
        Grading grading = new Grading();
        int score = 60;

        // when
        Grade grade = grading.getGradingResult(score);

        //then
        assertEquals(Grade.D, grade);
    }

    @Test
    void getGrading_E() {
        // given
        Grading grading = new Grading();
        int score = 50;

        // when
        Grade grade = grading.getGradingResult(score);

        //then
        assertEquals(Grade.E, grade);
    }

    @Test
    void getGrading_F() {
        // given
        Grading grading = new Grading();
        int score = 49;

        // when
        Grade grade = grading.getGradingResult(score);

        //then
        assertEquals(Grade.F, grade);
    }

    @Test
    void getGrading_exeed() {
        // given
        Grading grading = new Grading();
        int score = 101;

        // when
        Grade grade = grading.getGradingResult(score);

        //then
        assertEquals(Grade.ERROR, grade);
    }

    @Test
    void getGrading_negative() {
        // given
        Grading grading = new Grading();
        int score = -1;

        // when
        Grade grade = grading.getGradingResult(score);

        //then
        assertEquals(Grade.ERROR, grade);
    }
}