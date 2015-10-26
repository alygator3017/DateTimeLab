package datetimelab;

import java.time.LocalDateTime;
import java.time.Month;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.chrono.ChronoLocalDate;
import java.time.chrono.ChronoLocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;


/**
 *
 * @author Alyson
 */
public class DateTimeLab {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Date date = new Date();
        LocalDateTime newDate = date.toInstant().atZone(ZoneId.systemDefault())
                .toLocalDateTime();
        String newDateString = newDate.format(DateTimeFormatter.ofPattern("ccc LLL dd yyyy hh:mm:ss"));
        System.out.println(date);
        System.out.println(newDate);
        System.out.println(newDateString);
        newDateString = newDate.format(DateTimeFormatter.ofPattern("ccc LLL dd yyyy k:mm:ss"));
        System.out.println(newDateString);
        
        int compare = newDate.compareTo(newDate);
        System.out.println("Should be 0 because we are on the same month: " + compare);
        LocalDateTime comparedDate = LocalDateTime.of(2015, Month.MARCH, 24, 12, 10);
        compare = newDate.compareTo(comparedDate);
        System.out.println("should be positive 7 because we are 7 months from march: " + compare);
        
        System.out.println("newDate is after comparedDate- should be true: " + newDate.isAfter(comparedDate));
        System.out.println("newDate is before comparedDate - should be false: " + newDate.isBefore(comparedDate));
        System.out.println("newDate is equal to comparedDate- should be false: " + newDate.isEqual(comparedDate));
        
        
        
    }
    
}
