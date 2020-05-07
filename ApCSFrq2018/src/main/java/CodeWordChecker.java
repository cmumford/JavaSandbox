public class CodeWordChecker implements StringChecker {
    private int minLength;
    private int maxLength;
    private String notInWord;

    public CodeWordChecker(String notInWord) {
        this.minLength = 6;
        this.maxLength = 20;
        this.notInWord = notInWord;
    }

    public CodeWordChecker(int minLength, int maxLength, String notInWord) {
        this.minLength = minLength;
        this.maxLength = maxLength;
        this.notInWord = notInWord;
    }

    @Override
    public boolean isValid(String str) {
        return str.length() >= minLength && str.length() <= maxLength && str.indexOf(notInWord) == -1;
    }
}
