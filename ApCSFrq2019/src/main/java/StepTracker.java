public class StepTracker {
    private int minStepsPerDayForActive;
    private int totalSteps;
    private int numActiveDays;
    private int numDays;

    public StepTracker(int activeSteps) {
        minStepsPerDayForActive = activeSteps;
        totalSteps = 0;
        numActiveDays = 0;
        numDays = 0;
    }

    public void addDailySteps(int numSteps) {
        numDays++;
        if (numSteps >= minStepsPerDayForActive)
            numActiveDays++;
        totalSteps += numSteps;
    }

    public int activeDays() {
        return numActiveDays;
    }

    public double averageSteps() {
        if (numDays == 0)
            return 0.0;
        return (double)totalSteps / (double)numDays;
    }
}
