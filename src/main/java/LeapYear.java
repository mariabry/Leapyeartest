public class LeapYear {
    public static boolean isLeapYear(int year) {
        //checking if it is a leap year or not:

        //A year is a leap year if it is evenly divisible by 400, but not 100
        //Or A leap year when its divisible by 400
        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0) ) {
            return true;
            //its not a leap year when its not divisible by 4
            // or when its divisible by 100, but not 400
        }else if ((year % 4 != 0) || (year % 100 == 0 && year % 400 != 0)) {
            return false;
          // else its not a leap year
        } else {
            return false;
        }

    }}
