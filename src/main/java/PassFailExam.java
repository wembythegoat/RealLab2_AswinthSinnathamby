public class PassFailExam extends PassFailActivity {
    private int numQuestions;
    private double pointsEach;
    private int numMissed;

    public PassFailExam(double minPassingScore, int numQuestions, int numMissed) {
        super(minPassingScore);
        this.numQuestions = numQuestions;
        this.numMissed = numMissed;

        pointsEach = 100.0 / numQuestions;
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
