package datetimelab;

import java.time.DayOfWeek;
import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.ZoneId;
import java.time.temporal.TemporalAdjusters;
import java.util.Date;

/**
 *
 * @author Alyson
 */
public class Challenges {

    public static void main(String[] args) {
        //challenge 1
        LocalDateTime startDate = LocalDateTime.of(2015, Month.OCTOBER, 26, 00, 00);
        LocalDateTime endDate = LocalDateTime.of(2015, Month.DECEMBER, 26, 00, 00);

        Duration diff = Duration.between(startDate, endDate);

        long sec = (diff.getSeconds());
        System.out.println(sec);
        
        //challenge 2
        //10/11/2015
        //output in that format
        //due date of an invoice 15 days from today
        LocalDate invoice = LocalDate.of(2015, Month.OCTOBER, 26);
        LocalDate invoiceDue = invoice.plusDays(15);
        System.out.println(invoiceDue);
        
        //challenge 3
        //calculate the day of the month as an int representing the first wednesday 
        //the month this month
        LocalDate date = LocalDate.of(2015, Month.OCTOBER, 26);
        LocalDate date2 = date.plusMonths(1);
        LocalDate lastDay = date2.with(TemporalAdjusters.firstInMonth(DayOfWeek.WEDNESDAY));
        System.out.println(lastDay.getDayOfMonth());
        
        //challenge 4
        // find the weekday name that your birthday falls on this year
        LocalDate bday = LocalDate.of(2015, Month.JULY, 2);
        System.out.println(bday.getDayOfWeek());
        
        //challenge 5
        //convert an old fashioned date util object into a new local date time object
        Date oldDate = new Date();
        LocalDateTime newDate = oldDate.toInstant().atZone(ZoneId.systemDefault()).toLocalDateTime();
        System.out.println(newDate);
        
        
    }

}
