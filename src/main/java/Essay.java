public class Essay extends GradedActivity {
    private double grammar;
    private double spelling;
    private double correctLength;
    private double content;

    public Essay(double grammar, double spelling, double correctLength, double content) {
        super(0);

        if (grammar > 30) {
            grammar = 30;
        }

        if (spelling > 20) {
            spelling = 20;
        }

        if (correctLength > 20) {
            correctLength = 20.0;
        }

        if (content > 30) {
            content = 30;
        }

        this.grammar = grammar;
        this.spelling = spelling;
        this.correctLength = correctLength;
        this.content = content;

        double totalScore = grammar + spelling + correctLength + content;
        setScore(totalScore);
    }

    public double getGrammar() {

        return grammar;
    }

    public void setGrammar(double grammar) {
        this.grammar = grammar;
    }

    public double getSpelling() {
        return spelling;
    }

    public void setSpelling(double spelling) {
        this.spelling = spelling;
    }

    public double getCorrectLength() {
        return correctLength;
    }

    public void setCorrectLength(double correctLength) {
        this.correctLength = correctLength;
    }

    public double getContent() {
        return content;
    }

    public void setContent(double content) {
        this.content = content;
    }

    @Override
    public double getScore() {
        return super.getScore();
    }

    @Override
    public void setScore(double score) {
        super.setScore(score);
    }
}
