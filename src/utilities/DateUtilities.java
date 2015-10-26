package utilities;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalUnit;

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
        String fDate = null;
        try{
        fDate = date.format(DateTimeFormatter.ISO_DATE);
        }catch(IllegalArgumentException e){
            System.out.println(e);
        }
        return fDate;
    }

    /**
     * Returns a String of a LocalDate object formatted to the specified format.
     * Only for LocalDate, not LocalDateTime. This will return a date, not a
     * date and time. Uses a LocalDate parameter. Also uses a DateTimeFormatter
     * parameter to format the date passed in.
     *
     * @param date LocalDate
     * @param format DateTimeFormatter ex:
     * DateTimeFormatter.ofPattern("MM-dd-YYYY") or
     * DateTimeFormatter.ofPattern("M/d/YY"), etc.
     * @return formated date string
     * @throws IllegalArgumentException
     */
    public String toString(LocalDate date, DateTimeFormatter format) throws IllegalArgumentException {
        if (date == null) {
            throw new IllegalArgumentException("Date cannot be null");
        } else if (format == null) {
            throw new IllegalArgumentException("toString LocalDate DateTimeFromatter cannot be null");
        }
        String fDate = null;
        try{
        fDate = date.format(format);
        }catch(IllegalArgumentException e){
            System.out.println(e);
        }
        return fDate;
    }

    /**
     * Returns a String of a LocalDateTime object. Only for LocalDateTime, not
     * LocalDate. This will return a date and time, not just a date. Uses a
     * LocalDateTime parameter.
     *
     * @param date LocalDateTime
     * @return date time String.
     * @throws IllegalArgumentException
     */
    public String toString(LocalDateTime date) throws IllegalArgumentException {
        if (date == null) {
            throw new IllegalArgumentException("Date cannot be null");
        }
        String fDate = null;
        try{
        fDate = date.format(DateTimeFormatter.ISO_DATE_TIME);
        }catch(IllegalArgumentException e){
            System.out.println(e);
        }
        return fDate;
    }

    /**
     * Returns a String of a LocalDateTime object. Only for LocalDateTime, not
     * LocalDate. This will return a date and time, not just a date. Uses a
     * LocalDateTime parameter.
     *
     * @param date LocalDateTime
     * @param format DateTimeFormatter ex:
     * DateTimeFormatter.ofPattern("MM-dd-YYYY hh:mm a") or
     * DateTimeFormatter.ofPattern("M/d/YY k:mm:ss"), etc.
     * @return formatted date time string.
     * @throws IllegalArgumentException
     */
    public String toString(LocalDateTime date, DateTimeFormatter format) throws IllegalArgumentException {
        if (date == null || format == null) {
            throw new IllegalArgumentException("Date cannot be null");
        }
        String fDate = null;
        try {
            fDate = date.format(format);
        } catch (IllegalArgumentException e) {
            System.out.println(e);
        }
        return fDate;
    }

    /**
     * Returns the LocalDate of a string. Only for LocalDate, not LocalDateTime.
     * This will only return a date, not a date and time.
     *
     * @param date a string date to be changed to a LocalDate.
     * @return LocalDate
     * @throws IllegalArgumentException
     */
    public LocalDate toDate(String date) throws IllegalArgumentException {
        if (date == null || date.isEmpty()) {
            throw new IllegalArgumentException("String to local Date parameter cannot be null or empty.");
        }
        LocalDate parseDate = null;
        try {
            parseDate = LocalDate.parse(date);
        } catch (IllegalArgumentException e) {
            System.out.println(e);
        }
        return parseDate;
    }

    /**
     * Returns the LocalDate of a string in the specified format. Only for
     * LocalDate, not LocalDateTime. This will only return a date, not a date
     * and time. Uses a specified DateTimeFormatter format.
     *
     * @param date a string date to be changed to a LocalDate.
     * @param format specified format ex:
     * DateTimeFormatter.ofPattern("MM-dd-YYYY") or
     * DateTimeFormatter.ofPattern("M/d/YY"), etc.
     * @return LocalDate of a specified format
     * @throws IllegalArgumentException
     */
    public LocalDate toDate(String date, DateTimeFormatter format) throws IllegalArgumentException {
        if (date == null || date.isEmpty()) {
            throw new IllegalArgumentException("String to local Date parameter cannot be null or empty.");
        } else if (format == null) {
            throw new IllegalArgumentException("Format of type DateTimeFormatter cannot be null");
        }
        LocalDate parseDate = null;
        try {
            parseDate = LocalDate.parse(date, format);
        } catch (IllegalArgumentException e) {
            System.out.println(e);
        }
        return parseDate;
    }

    /**
     * Returns the LocalDateTime of a string. Only for LocalDateTime, not
     * LocalDate. This will return a date and time, not only a date.
     *
     * @param date a string date to be changed to a LocalDateTime.
     * @return LocalDateTime
     * @throws IllegalArgumentException
     */
    public LocalDateTime toDateTime(String date) throws IllegalArgumentException {
        if (date == null || date.isEmpty()) {
            throw new IllegalArgumentException("String to local Date parameter cannot be null or empty.");
        }
        LocalDateTime parseDate = null;
        try {
            parseDate = LocalDateTime.parse(date);
        } catch (IllegalArgumentException e) {
            System.out.println(e);
        }
        return parseDate;
    }

    /**
     * Returns the LocalDateTime of a string in the specified format. Only for
     * LocalDateTime, not LocalDate. This will return a date and time, not only
     * a date. Uses a specified DateTimeFormatter format.
     *
     * @param date a string date to be changed to a LocalDateTime.
     * @param format specified format ex:
     * DateTimeFormatter.ofPattern("MM-dd-YYYY hh:mm a") or
     * DateTimeFormatter.ofPattern("M/d/YY k:mm:ss"), etc.
     * @return LocalDateTime of a specified format
     * @throws IllegalArgumentException
     */
    public LocalDateTime toDateTime(String date, DateTimeFormatter format) throws IllegalArgumentException {
        if (date == null || date.isEmpty()) {
            throw new IllegalArgumentException("String to local Date parameter cannot be null or empty.");
        } else if (format == null) {
            throw new IllegalArgumentException("Format of type DateTimeFormatter cannot be null");
        }
        LocalDateTime parseDate = null;
        try {
            parseDate = LocalDateTime.parse(date, format);
        } catch (IllegalArgumentException e) {
            System.out.println(e + ", " + e.getMessage());
        }
        return parseDate;
    }

    /**
     * dateDiff() is the difference between two dates using LocalDate and a
     * TemporalUnit. Only for LocalDate, not LocalDateTime. TemporalUnit is used
     * to specify what kind of unit you want the difference back in (e.g. Days,
     * Months, etc.) Anything less than a day for TemporalUnit will not be
     * accepted and will throw and exception.
     *
     * @param temporalUnit e.g. Days, months, etc. Anything less than a day is
     * not accepted and will throw an exception. Make sure to use a try catch to
     * catch any errors.
     * @param firstDate LocalDate
     * @param secondDate LocalDate
     * @return difference in firstDate and secondDate according to specified
     * TemporalUnit
     * @throws IllegalArgumentException
     */
    public long dateDiff(TemporalUnit temporalUnit, LocalDate firstDate, LocalDate secondDate) throws IllegalArgumentException {
        if (firstDate == null) {
            throw new IllegalArgumentException("First date parameter of type LocalDate is null.");
        } else if (secondDate == null) {
            throw new IllegalArgumentException("Second date parameter of type LocalDate is null");
        } else if (temporalUnit == null || temporalUnit == ChronoUnit.HOURS || temporalUnit == ChronoUnit.MINUTES || temporalUnit == ChronoUnit.SECONDS || temporalUnit == ChronoUnit.MILLIS || temporalUnit == ChronoUnit.MICROS || temporalUnit == ChronoUnit.NANOS) {
            throw new IllegalArgumentException("TemporalUnit is null or has a unit of time less than a day");
        }
        LocalDate startDate = firstDate;
        LocalDate endDate = secondDate;

        long diff = 0;
        try {
            diff = temporalUnit.between(startDate, endDate);
        } catch (IllegalArgumentException e) {
            System.out.println(e);
        }

        return diff;
    }

    /**
     * dateDiff() is the difference between two dates using LocalDate and a
     * TemporalUnit. Only for LocalDateTime, not LocalDate. TemporalUnit is used
     * to specify what kind of unit you want the difference back in (e.g. Days,
     * Months, etc.)
     *
     * @param temporalUnit e.g. Days, months, etc.
     * @param firstDate LocalDateTime
     * @param secondDate LocalDateTime
     * @return difference in firstDate and secondDate according to specified
     * TemporalUnit
     * @throws IllegalArgumentException
     */
    public long dateTimeDiff(TemporalUnit temporalUnit, LocalDateTime firstDate, LocalDateTime secondDate) throws IllegalArgumentException {
        if (firstDate == null) {
            throw new IllegalArgumentException("First date parameter of type LocalDate is null.");
        } else if (secondDate == null) {
            throw new IllegalArgumentException("Second date parameter of type LocalDate is null");
        } else if (temporalUnit == null) {
            throw new IllegalArgumentException("TemporalUnit is null or has a unit of time less than a day");
        }
        LocalDateTime startDate = firstDate;
        LocalDateTime endDate = secondDate;

        long diff = 0;
        try {
            diff = temporalUnit.between(startDate, endDate);
        } catch (IllegalArgumentException e) {
            System.out.println(e);
        }

        return diff;
    }
}
