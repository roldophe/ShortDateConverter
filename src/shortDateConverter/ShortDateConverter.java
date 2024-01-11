package shortDateConverter;

public class ShortDateConverter {
    public static String convertShortDate(String shortDate) {
        // Extract year, month, and day from the short date string
        int year = Integer.parseInt(shortDate.substring(0, 4));
        int month = Integer.parseInt(shortDate.substring(5, 7));
        int day = Integer.parseInt(shortDate.substring(8, 10));

        // Convert month number to month name
        String monthName = getMonthName(month);

        // Format the long date string
        String longDate = monthName + " " + day + ", " + year;

        return longDate;
    }

    private static String getMonthName(int month) {
        String[] monthNames = {
                "", "January", "February", "March", "April", "May", "June",
                "July", "August", "September", "October", "November", "December"
        };

        if (month < 1 || month > 12) {
            throw new IllegalArgumentException("Invalid month number");
        }

        return monthNames[month];
    }
}