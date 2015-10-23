package utilities;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.TemporalAccessor;
import javax.swing.text.DateFormatter;

/**
 * Different Utility Methods for Date class conversions and mathematics. Uses
 * new java 8 API. Needs at least 2 ways of converting from string to date.
 * Needs at least 2 ways of converting from date to string. Needs at least one
 * method performing date/time arithmetic.
 *
 * @author Alyson
 * @version 1
 */
public class DateUtilities {

    /**
     * Returns a String of a LocalDate object. Only for LocalDate, not
     * LocalDateTime. This will return a date, not a date and time. Uses a
     * LocalDate parameter.
     *
     * @param date LocalDate
     * @return date string
     * @throws IllegalArgumentException
     */
    public String toString(LocalDate date) throws IllegalArgumentException {
        if (date == null) {
            throw new IllegalArgumentException("Date cannot be null");
        }
        String fDate = date.format(DateTimeFormatter.ISO_DATE);
        return fDate;
    }

    /**
     * Returns a String of a LocalDate object formatted to the specified format.
     * Only for LocalDate, not LocalDateTime. This will return a date, not a
     * date and time. Uses a LocalDate parameter. Also uses a DateTimeFormatter
     * parameter to format the date passed in.
     *
     * @param date LocalDate
     * @param format DateTimeFormatter
     * @return date string
     * @throws IllegalArgumentException
     */
    public String toString(LocalDate date, DateTimeFormatter format) throws IllegalArgumentException {
        if (date == null) {
            throw new IllegalArgumentException("Date cannot be null");
        } else if (format == null) {
            throw new IllegalArgumentException("toString LocalDate DateTimeFromatter cannot be null");
        }
        String fDate = date.format(format);
        return fDate;
    }

    /**
     * Returns a String of a LocalDateTime object. Only for LocalDateTime, not
     * LocalDate. This will return a date and time, not just a date. Uses a
     * LocalDateTime parameter.
     *
     * @param date LocalDateTime
     * @return
     * @throws IllegalArgumentException
     */
    public String toString(LocalDateTime date) throws IllegalArgumentException {
        if (date == null) {
            throw new IllegalArgumentException("Date cannot be null");
        }
        String fDate = date.format(DateTimeFormatter.ISO_DATE);
        return fDate;
    }

    /**
     * Returns a String of a LocalDateTime object. Only for LocalDateTime, not
     * LocalDate. This will return a date and time, not just a date. Uses a
     * LocalDateTime parameter.
     *
     * @param date LocalDateTime
     * @param format DateTimeFormatter
     * @return
     * @throws IllegalArgumentException
     */
    public String toString(LocalDateTime date, DateTimeFormatter format) throws IllegalArgumentException {
        if (date == null || format == null) {
            throw new IllegalArgumentException("Date cannot be null");
        }
        String fDate = null;
        try{
            fDate = date.format(format);
        }catch(IllegalArgumentException e ){
            System.out.println(e + ", " + e.getMessage());
        }
        return fDate;
    }
    
    /**
     * Returns the LocalDate of a string. 
     * Only for LocalDate, not LocalDateTime. This will only return a date, not 
     * a date and time.  
     * @param date a string date to be changed to a LocalTime.
     * @return LocalTime
     * @throws IllegalArgumentException
     */
    public LocalDate toDate(String date)throws IllegalArgumentException{
        if(date == null || date.isEmpty()){
            throw new IllegalArgumentException("String to local Date parameter cannot be null or empty.");
        }
        LocalDate dDate = null;
        try{
            dDate = LocalDate.parse(date);
        }catch(IllegalArgumentException e){
            System.out.println(e + ", " + e.getMessage());
        }
        return dDate;
    }
}
