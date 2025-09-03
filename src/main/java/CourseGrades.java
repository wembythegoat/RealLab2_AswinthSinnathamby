public class CourseGrades implements Analyzable {
    private GradedActivity[] grades;

    public CourseGrades() {
        grades = new GradedActivity[4];
    }

    public void setLab(GradedActivity Lab) {
        grades[0] = Lab;
    }

    public void setPassFailExam(PassFailExam exam) {
        grades[1] = exam;
    }

    public void setEssay(Essay essay) {
        grades[2] = essay;
    }

    public void setFinalExam(FinalExam finalExam) {
        grades[3] = finalExam;
    }

    @Override
    public double getAverage() {
        double total = 0;
        for (GradedActivity activity : grades) {
            total += activity.getScore();
        }
        return total / grades.length;
    }

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
