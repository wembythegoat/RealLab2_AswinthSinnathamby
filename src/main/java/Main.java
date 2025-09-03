public class Main {
    public static void main(String[] args) {
        CourseGrades course = new CourseGrades();

        GradedActivity lab = new GradedActivity(85.0);
        course.setLab(lab);

        PassFailExam passFailExam = new PassFailExam(70, 10, 2);

        PassFailExam simulatedFailExam = new PassFailExam(70,10, 2);
        course.setPassFailExam(passFailExam);

        Essay essay = new Essay(25, 15, 20, 20);
        course.setEssay(essay);

        FinalExam finalExam = new FinalExam(50, 10);
        course.setFinalExam(finalExam);

        System.out.println(course.toString());

    }
}
