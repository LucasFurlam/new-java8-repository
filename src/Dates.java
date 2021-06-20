import java.time.*;
import java.time.format.DateTimeFormatter;

public class Dates {

    /**
     * Using some resources of Java 8 Date API.
     */

    public static void main(String[] args) {

        LocalDate today = LocalDate.now();
        System.out.println(today);

        LocalDate worldCup = LocalDate.of(2022, Month.JUNE, 5);
        int years = worldCup.getYear() - today.getYear();
        System.out.println(years);

        Period period = Period.between(today, worldCup);
        System.out.println(period.getDays());

        LocalDate nextWorldCup = worldCup.plusYears(4);
        System.out.println(nextWorldCup);

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String formatedValue = nextWorldCup.format(formatter);
        System.out.println(formatedValue);

        DateTimeFormatter formatterWithHours = DateTimeFormatter.ofPattern("dd/MM/yyyy hh:mm");
        LocalDateTime now = LocalDateTime.now();
        System.out.println(now.format(formatterWithHours));

        LocalTime interval = LocalTime.of(15, 30);
        System.out.println(interval);

    }

}
