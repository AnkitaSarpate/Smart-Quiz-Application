package application;

import java.util.List;
import java.util.Collections;

public class Question {

    private String questionText;
    private List<String> options;
    private int correctAnswerIndex;

    public Question(String questionText, List<String> options, int correctAnswerIndex) {
        this.questionText = questionText;
        this.options = options;
        this.correctAnswerIndex = correctAnswerIndex;
    }

    public String getQuestionText() {
        return questionText;
    }

    public List<String> getOptions() {
        return options;
    }

    public int getCorrectAnswerIndex() {
        return correctAnswerIndex;
    }
    public void shuffleOptions() {
        String correctAnswer = options.get(correctAnswerIndex);

        Collections.shuffle(options);

        correctAnswerIndex = options.indexOf(correctAnswer);
    }
}
