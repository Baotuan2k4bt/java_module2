package ss_9;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;

public class DateUtils {

    private static final DateTimeFormatter FORMATTER = DateTimeFormatter.ofPattern("yyyy-MM-dd");

    public static String getNextDay(String date) {
        try {
            LocalDate localDate = LocalDate.parse(date, FORMATTER);
            LocalDate nextDay = localDate.plusDays(1);
            return nextDay.format(FORMATTER);
        } catch (DateTimeParseException e) {
            throw new IllegalArgumentException("Ngày không hợp lệ: " + date, e);
        }
    }
}





