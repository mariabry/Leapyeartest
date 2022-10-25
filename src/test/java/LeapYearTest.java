import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.fail;

public class LeapYearTest {

   // @Test
   // public void Is_it_a_leap_year() {
    // fail("We don't have any code yet");
    //}

   @Test
    public void Is_Leap_Year_when_Divisible_By_4_and_not_100(){
      assertTrue(LeapYear.isLeapYear(2008),"A leap year");

    }

    @Test
    public void is_a_leap_year_when_its_divisible_by_400(){
        assertTrue(LeapYear.isLeapYear(2000),"A leap year");

    }
    @Test void Not_A_LeapYear_if_year_not_divisible_by_foure(){
       assertFalse(LeapYear.isLeapYear(1700),"Not a leap year");
    }

    @Test void Not_A_LeapYear_if_year_divisible_by_100_but_not_400() {
        assertFalse(LeapYear.isLeapYear(1800), "Not a leap year");
    }
}



