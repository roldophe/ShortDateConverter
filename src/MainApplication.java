import shortDateConverter.ShortDateConverter;

import java.util.Scanner;

public class MainApplication {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a short date (YYYY-MM-DD): ");
        String shortDate = scanner.nextLine();
        String fullDate = ShortDateConverter.convertShortDate(shortDate);
        System.out.println("Full date representation: " + fullDate);
    }
}