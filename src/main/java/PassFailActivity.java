/**
 * This class extends GradedActivity and represents
 * an activity that is graded on a pass/fail basis. A minimum passing
 * score is required to earn a 'P' (pass); otherwise, the grade is 'F' (fail).
 *
 * @author Aswinth Sinnathamby
 */
public class PassFailActivity extends GradedActivity {
    private double minPassingScore;

    public PassFailActivity(double minPassingScore) {
        super(0);
        this.minPassingScore = minPassingScore;
    }

    /**
     * Returns the grade based on whether the score meets the minimum passing score.
     * @return 'P' if score is passing, 'F' otherwise
     */
    @Override
    public char getGrade() {
        if (getScore() >= minPassingScore) {
            return 'P';
        } else {
            return 'F';
        }
    }
}
