package Assignment;

import java.io.Console;
import java.time.LocalDate;

public class Assignment7 {
    public static void main(String[] args) {
        String day;
        String month;
        String year;
        Console c = System.console();
        System.out.println("Enter the Date: ");
        day = c.readLine();
        System.out.println("Enter the Month: ");
        month = c.readLine();
        System.out.println("Enter the Year: ");
        year = c.readLine();
        LocalDate n = LocalDate.of(Integer.parseInt(year), Integer.parseInt(month), Integer.parseInt(day));
        System.out.println(n + "- " + n.getDayOfWeek());
        for (int i = 0; i <= Integer.parseInt(day); i++) {
            LocalDate localDate = LocalDate.of(Integer.parseInt(year), Integer.parseInt(month), i);
            System.out.println(localDate + "- " + localDate.getDayOfWeek());
        }
    }
}
