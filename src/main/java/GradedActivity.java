/**
 * This class models a general graded activity for a student.
 * It provides methods to retrieve and update the score, and to determine the corresponding letter grade.
 * @author Aswinth Sinnathamby
 */
public class GradedActivity {
    private double score;

    public GradedActivity(double score) {
        this.score = score;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }

    /**
     * Determines the letter grade based on the score.
     * @return The letter grade ('A', 'B', 'C', 'D', or 'F')
     */
    public char getGrade() {
        if (score >= 90) {
            return 'A';
        } else if (80 <= score) {
            return 'B';
        } else if (70 <= score) {
            return 'C';
        } else if (60 <= score) {
            return 'D';
        } else {
            return 'F';
        }
    }
}
