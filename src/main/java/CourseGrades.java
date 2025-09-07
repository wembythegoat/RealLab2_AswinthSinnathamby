/**
 * The CourseGrades class implements the Analyzable interface and manages
 * a collection of graded activities for a course. It includes methods to
 * set individual graded components, calculate the average score, and
 * determine the highest and lowest scores.
 *
 * @author Aswinth Sinnathamby
 */
public class CourseGrades implements Analyzable {
    private GradedActivity[] grades;

    public CourseGrades() {
        grades = new GradedActivity[4];
    }

    /**
     * Sets the lab graded activity.
     * @param Lab
     */
    public void setLab(GradedActivity Lab) {
        grades[0] = Lab;
    }

    /**
     * Sets the Pass/Fail Exam graded activity.
     * @param exam
     */
    public void setPassFailExam(PassFailExam exam) {
        grades[1] = exam;
    }

    /**
     * Sets the Essay graded activity.
     * @param essay
     */
    public void setEssay(Essay essay) {
        grades[2] = essay;
    }

    /**
     * Sets the Final Exam graded activity
     * @param finalExam
     */
    public void setFinalExam(FinalExam finalExam) {
        grades[3] = finalExam;
    }

    /**
     * Calculates the returns the average score of all graded activities.
     * @return Average score
     */
    @Override
    public double getAverage() {
        double total = 0;
        for (GradedActivity activity : grades) {
            total += activity.getScore();
        }
        return total / grades.length;
    }

    /**
     * Finds and returns the graded activity with the highest score.
     * @return GradedActivity with the highest score
     */
    @Override
    public GradedActivity getHighest() {
        GradedActivity highest = grades[0];
        for (GradedActivity activity : grades) {
            if (activity.getScore() > highest.getScore()) {
                highest = activity;
            }
        }
        return highest;
    }

    /**
     * Finds and returns the graded activity with the lowest score.
     * @return GradedActivity with the lowest score
     */
    @Override
    public GradedActivity getLowest() {
        GradedActivity lowest = grades[0];
        for (GradedActivity activity : grades) {
            if (activity.getScore() < lowest.getScore()) {
                lowest = activity;
            }
        }
        return lowest;
    }

    /**
     * Returns a formatted string representation of all graded activities.
     * @return String summary of course grades
     */
    @Override
    public String toString() {
        StringBuilder string = new StringBuilder();

        string.append(String.format("Lab Score: %.1f\tGrade: %c%n", grades[0].getScore(), grades[0].getGrade()));
        string.append(String.format("Pass/Fail Exam Score: %.1f\tGrade: %c%n", grades[1].getScore(), grades[1].getGrade()));
        string.append(String.format("Essay Score: %.1f\tGrade: %c%n", grades[2].getScore(), grades[2].getGrade()));
        string.append(String.format("Final Exam Score: %.1f\tGrade: %c%n", grades[3].getScore(), grades[3].getGrade()));
        string.append(String.format("Average score: %.1f%n", getAverage()));
        string.append(String.format("Highest score: %.1f%n", getHighest().getScore()));
        string.append(String.format("Lowest score: %.1f%n", getLowest().getScore()));

        return string.toString();
    }
}
