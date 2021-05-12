package org.launchcode.java.studios.funWithQuizzes;

public class Question {

    // question to
    private String questionText;
    private int pointValue;

    public Question(String questionText, int pointValue) {
        this.questionText = questionText;
        this.pointValue = pointValue;
    }

    public void displayQuestion() {
        System.out.println(questionText);
    }

    public int getPointValue() { return pointValue; }
    public void setPointValue(int pointValue) { this.pointValue = pointValue; }



//    public String getQuestionText() { return questionText; }
//    public void setQuestionText(String questionText) { this.questionText = questionText; }

}
