package utilities;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import javax.swing.text.DateFormatter;

/**
 *Different Utility Methods for Date class conversions and mathematics.
 * Uses new java 8 API.
 * Needs at least 2 ways of converting from string to date.
 * Needs at least 2 ways of converting from date to string.
 * Needs at least one method performing date/time arithmetic.
 * @author Alyson
 * @version 1
 */
public class DateUtilities {
    
    /**
     *Returns a String of a LocalDate object.
     * Only for LocalDate, not LocalDateTime. This will return a date, not a
     * date and time. Uses a LocalDate parameter. 
     * @param date
     * @return
     */
    public String toString(LocalDate date) throws IllegalArgumentException{
        if(date == null){
            throw new IllegalArgumentException("Date cannot be null");
        }
        String fDate = date.format(DateTimeFormatter.ISO_DATE);
        return fDate;
    }
    
    public String toString(LocalDate date, DateTimeFormatter format) throws IllegalArgumentException{
        if(date == null || format == null){
            throw new IllegalArgumentException("Date cannot be null");
        }
        String fDate = date.format(format);
        return fDate;
    }
}
