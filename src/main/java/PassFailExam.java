/**
 * This class represents an exam graded on a pass/fail basis.
 * It calculates the numeric score based on the number of questions missed
 * and determines whether the score meets the minimum passing threshold.
 *
 * It extends PassFailActivity, which handles the pass/fail grading logic.
 * @author Aswinth Sinnathamby
 */
public class PassFailExam extends PassFailActivity {
    private int numQuestions;
    private double pointsEach;
    private int numMissed;

    /**
     * Constructs a PassFailExam object with the specified minimum passing score,
     * total number of questions, and number of questions missed.
     * @param minPassingScore
     * @param numQuestions
     * @param numMissed
     */
    public PassFailExam(double minPassingScore, int numQuestions, int numMissed) {
        super(minPassingScore);
        this.numQuestions = numQuestions;
        this.numMissed = numMissed;

        // Calculate how many points each question is worth
        pointsEach = 100.0 / numQuestions;

        // Calculate the numeric score based on missed questions
        double numericScore = 100.0 - (numMissed * pointsEach);

        setScore(numericScore);

    }

    public double getPointsEach() {
        return pointsEach;
    }

    public int getNumMissed() {
        return numMissed;
    }

    public int getNumQuestions() {
        return numQuestions;
    }
}
