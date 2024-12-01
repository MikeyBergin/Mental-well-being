/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package groupproject;


/**
 *
 * @author tenhe
 */
import java.util.ArrayList;

public class healthyQuiz {
    private ArrayList<String> questionList = new ArrayList<>();
    private ArrayList<String> userAnswers = new ArrayList<>();
    private int score;

    public void addQuestion(String question) {
        questionList.add(question);
    }

    public int startQuiz() {
        // Simulate starting a quiz and return a score
        score = 10; // Example score
        return score;
    }

    public int getResults() {
        return score;
    }
}



