public class MultPractice implements StudyPractice {
    int firstInteger;
    int secondInteger;

    MultPractice(int firstInteger, int initialSecodIngeger) {
        this.firstInteger = firstInteger;
        this.secondInteger = initialSecodIngeger;
    }

    @Override
    public String getProblem() {
        return String.format("%d TIMES %d", firstInteger, secondInteger);
    }

    @Override
    public void nextProblem() {
        secondInteger++;
    }
}
