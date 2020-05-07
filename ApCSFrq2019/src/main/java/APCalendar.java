import java.util.GregorianCalendar;

public class APCalendar
{
    /** Returns true if year is a leap year and false otherwise. */
    public static boolean isLeapYear(int year)
    {
        // Leap years are every four years, but not every 100, unless every 400.
        // https://en.wikipedia.org/wiki/Leap_year
        boolean divisible_by_4 = (year % 4) == 0;
        boolean divisible_by_100 = (year % 100) == 0;
        boolean divisible_by_400 = (year % 400) == 0;

        return divisible_by_4 && (!divisible_by_100 || divisible_by_400);
    }

    /** Returns the number of leap years between year1 and year2, inclusive.
     * Precondition: 0 <= year1 <= year2
     */
    public static int numberOfLeapYears(int year1, int year2)
    {
        int count = 0;
        for (int year = year1; year <= year2; year++) {
            if (isLeapYear(year))
                count++;
        }
        return count;
    }

    /** Returns the value representing the day of the week for the first day of year,
     * where 0 denotes Sunday, 1 denotes Monday, ..., and 6 denotes Saturday.
     */
    public static int firstDayOfYear(int year)
    {
        GregorianCalendar cal = new GregorianCalendar(year, GregorianCalendar.JANUARY, 1);
        switch (cal.get(GregorianCalendar.DAY_OF_WEEK)) {
            case GregorianCalendar.SUNDAY:
                return 0;
            case GregorianCalendar.MONDAY:
                return 1;
            case GregorianCalendar.TUESDAY:
                return 2;
            case GregorianCalendar.WEDNESDAY:
                return 3;
            case GregorianCalendar.THURSDAY:
                return 4;
            case GregorianCalendar.FRIDAY:
                return 5;
            case GregorianCalendar.SATURDAY:
                return 6;
        }
        return 0;
    }

    /** Returns n, where month, day, and year specify the nth day of the year.
     * Returns 1 for January 1 (month = 1, day = 1) of any year.
     * Precondition: The date represented by month, day, year is a valid date.
     */
    public static int dayOfYear(int month, int day, int year)
    {
        GregorianCalendar cal = new GregorianCalendar(year, month-1, day);
        return cal.get(GregorianCalendar.DAY_OF_YEAR);
    }

    /** Returns the value representing the day of the week for the given date
     * (month, day, year), where 0 denotes Sunday, 1 denotes Monday, ...,
     * and 6 denotes Saturday.
     * Precondition: The date represented by month, day, year is a valid date.
     */
    public static int dayOfWeek(int month, int day, int year)
    {
        int idxDayOfYear = dayOfYear(month, day, year)-1;   // 0..364
        int idxDayOfWeek = idxDayOfYear % 7;    // 0..6
        return (firstDayOfYear(year) + idxDayOfWeek) % 7;
    }

    // There may be instance variables, constructors, and other methods not shown.
}

