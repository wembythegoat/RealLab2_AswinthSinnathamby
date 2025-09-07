/**
 * The FinalExam class represents a graded final exam.
 * It calculates the numeric score based on the number of questions missed
 * and assigns a letter grade using the GradedActivity superclass.
 *
 * Each question is worth an equal number of points, and the total score is out of 100.
 *
 * @author Aswinth Sinnathamby
 */
public class FinalExam extends GradedActivity {
    private int numQuestions;
    private double pointsEach;
    private int numMissed;

    /**
     * Constructs a FinalExam object with the specified number of questions
     * and number of questions missed. Calculates the score and sets it.
     * @param numQuestions
     * @param numMissed
     */
    public FinalExam(int numQuestions, int numMissed) {
        super(0);
        this.numQuestions = numQuestions;
        this.numMissed = numMissed;

        // Calculate how many points each question is worth
        pointsEach = 100.0 / numQuestions;

        // Calculate the numeric score based on missed questions
        double numericScore = 100.0 - (numMissed * pointsEach);

        // Set the score in the superclass
        setScore(numericScore);
    }

    public int getNumQuestions() {
        return numQuestions;
    }

    public int getNumMissed() {
        return numMissed;
    }

    public double getPointsEach() {
        return pointsEach;
    }
}
