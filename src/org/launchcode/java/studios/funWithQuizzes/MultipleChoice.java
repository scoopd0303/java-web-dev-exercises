package org.launchcode.java.studios.funWithQuizzes;

import java.util.ArrayList;

public class MultipleChoice extends Question {
    private ArrayList<String> choices;
    private int answer;



    public MultipleChoice(String aQuestionTest, ArrayList<String> choices, int answer) {
        super(aQuestionTest);
        this.choices = choices;
        this.answer = answer;
    }

    public ArrayList<String> getChoices() { return choices; }
    public void setChoices(ArrayList<String> choices) { this.choices = choices; }

    public int getAnswer() { return answer; }
    public void setAnswer(int answer) { this.answer = answer; }

}
