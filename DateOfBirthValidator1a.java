import java.util.Scanner;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;

public class DateOfBirthValidator1a {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Prompt for user input
        System.out.println("Enter your date of birth in dd mm yyyy format:");
        
        // Read day, month, year inputs
        int day = scanner.nextInt();
        int month = scanner.nextInt();
        int year = scanner.nextInt();
        
        // Format the input into a string
        String dateInput = String.format("%02d-%02d-%04d", day, month, year);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        
        try {
            // Parse the date and validate it
            LocalDate date = LocalDate.parse(dateInput, formatter);
            
            // If parsing succeeds, it's a valid date
            System.out.println("Valid Date");
            
            // Calculate and display the day number of the year
            int dayOfYear = date.getDayOfYear();
            System.out.println(dayOfYear);
        } catch (DateTimeParseException e) {
            // If parsing fails, the date is invalid
            System.out.println("Invalid Date");
        }
    }
}
