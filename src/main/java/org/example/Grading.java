package org.example;

public class Grading {

    public Grade getGradingResult(int score){
        if(score > 100) return Grade.ERROR;
        if(score >= 90 && score <= 100) return Grade.A;
        else if(score >= 80) return Grade.B;
        else if(score >= 70) return Grade.C;
        else if(score >= 60) return Grade.D;
        else if(score >= 50) return Grade.E;
        else if(score >= 0) return Grade.F;
        return Grade.ERROR;
    }
}
