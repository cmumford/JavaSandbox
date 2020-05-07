import org.junit.Assert;
import org.junit.Test;

import java.util.GregorianCalendar;

public class APCalendarTest {
    @Test
    public void leapYears() throws Exception {

        // Normal year divisible by 4.
        Assert.assertTrue(APCalendar.isLeapYear(1776));

        // divisible by 4 and by 100
        Assert.assertFalse(APCalendar.isLeapYear(1900));

        // Odd year not a leap year.
        Assert.assertFalse(APCalendar.isLeapYear(2001));

        // Divisible by 400 is a leap year.
        Assert.assertTrue(APCalendar.isLeapYear(2000));
    }

    @Test
    public void numLeapYears() throws Exception {
        Assert.assertEquals(1, APCalendar.numberOfLeapYears(1776, 1776));

        Assert.assertEquals(0, APCalendar.numberOfLeapYears(1777, 1777));

        int expectedLeapYears = 0;
        GregorianCalendar cal = new GregorianCalendar();
        for (int year = 2000; year <= 3000; year++) {
            if (cal.isLeapYear(year))
                expectedLeapYears++;
        }
        Assert.assertEquals(expectedLeapYears, APCalendar.numberOfLeapYears(2000, 3000));
    }

    @Test
    public void testFirstDayOfYear() throws Exception {
        Assert.assertEquals(2, APCalendar.firstDayOfYear(2019));
    }

    @Test
    public void testDayOfYear() throws Exception {
        Assert.assertEquals(60, APCalendar.dayOfYear(3, 1, 2017));
        Assert.assertEquals(61, APCalendar.dayOfYear(3, 1, 2016));
    }

    @Test
    public void dayOfWeek() throws Exception {
        Assert.assertEquals(2, APCalendar.dayOfWeek(1, 1, 2019) );
        Assert.assertEquals(3, APCalendar.dayOfWeek(1, 2, 2019) );
        Assert.assertEquals(4, APCalendar.dayOfWeek(1, 3, 2019) );
        Assert.assertEquals(5, APCalendar.dayOfWeek(1, 4, 2019) );
        Assert.assertEquals(6, APCalendar.dayOfWeek(1, 5, 2019) );

        Assert.assertEquals(0, APCalendar.dayOfWeek(1, 6, 2019) );
        Assert.assertEquals(1, APCalendar.dayOfWeek(1, 7, 2019) );
        Assert.assertEquals(2, APCalendar.dayOfWeek(1, 8, 2019) );
    }
}
