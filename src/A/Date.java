package A;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Date {
	    public static void main(String[] args) {
	        // Get the current date
	        LocalDate currentDate = LocalDate.now();

	        // Subtracting 7 days from the current date
	        LocalDate pastDate = currentDate.minusDays(7);

	        // Format the past date if needed
	        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
	        String formattedPastDate = pastDate.format(formatter);

	        System.out.println("Current Date: " + currentDate.format(formatter));
	        System.out.println("Past Date: " + formattedPastDate);
	    }
	}


