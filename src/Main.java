import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class Main {
    public static void main(String[] args) {
        OffsetDateTime localDateTime = OffsetDateTime.parse("2002-03-01T13:00:00Z");
        String longData = localDateTime.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.LONG));
        String mediumData = localDateTime.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM));
        String shortData = localDateTime.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT));
        System.out.println("long: " + longData);
        System.out.println("medium: " + mediumData);
        System.out.println("Short: " + shortData);
    }
}