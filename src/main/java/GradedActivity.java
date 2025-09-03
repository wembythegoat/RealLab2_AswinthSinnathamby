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
