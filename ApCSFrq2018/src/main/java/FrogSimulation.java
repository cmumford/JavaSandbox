import java.util.Random;

public class FrogSimulation {
    /** Distance, in inches, from the starting position to the goal. */
    private int goalDistance;

    /** Maximum number of hops allowed to reach the goal. */
    private int maxHops;

    private int maxHopDistance;

    private Random rnd;

    /** Constructs a FrogSimulation where dist is the distance, in inches, from the starting
     * position to the goal, and numHops is the maximum number of hops allowed to reach the goal.
     * Precondition: dist > 0; numHops > 0 */
    public FrogSimulation(int dist, int numHops)
    {
        goalDistance = dist;
        maxHops = numHops;
        maxHopDistance = 2  * dist / numHops;
        rnd = new Random();
    }

    /** Returns an integer representing the distance, in inches, to be moved when the frog hops. */
    private int hopDistance()
    {
        if (rnd.nextBoolean())
            return rnd.nextInt(maxHopDistance);
        else
            return -rnd.nextInt(maxHopDistance / 2);
    }

    /** Simulates a frog attempting to reach the goal as described in part (a).
     * Returns true if the frog successfully reached or passed the goal during the simulation; * false otherwise.
     */
    public boolean simulate()
    {
        int distTravelled = 0;
        for (int hopNum = 0; hopNum < maxHops; hopNum++) {
            distTravelled += hopDistance();
            if (distTravelled >= goalDistance)
                return true;
        }
        return false;
    }

    /** Runs num simulations and returns the proportion of simulations in which the frog
     * successfully reached or passed the goal.
     * Precondition: num > 0 */
    public double runSimulations(int num)
    {
        if (num == 0)
            return 0.0;
        int reachedDistCount = 0;
        for (int simNum = 0; simNum < num; simNum++) {
            if (simulate())
                reachedDistCount++;
        }

        return reachedDistCount / num;
    }
}
