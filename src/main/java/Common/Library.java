
package Common;


import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Scanner;


public class Library {
    
    protected Scanner sc = new Scanner(System.in);
    private final String PHONE_VALID = "^[0-9]{10}$";
    private final String EMAIL_VALID = "^[A-Z0-9a-z._%+-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,4}$";
    
     public String checkInputString() {
        //loop until user input true value
        while (true) {
            String result = sc.nextLine().trim();
            if (result.isEmpty()) {
                System.err.println("Not empty.");
            } else {
                return result;
            }
        }
    }

     
        public String checkInputPhone() {
    while (true) {
        try {

            // Remove any non-digit characters
            String resultCheck = checkInputString().replaceAll("\\D", "");

            if (resultCheck.length() != 10) {
                System.err.println("Phone number must be 10 digits");
            } else if (!resultCheck.matches(PHONE_VALID)) {
                System.err.println("Phone number must consist of 10 digits only");
            } else {
                return resultCheck;
            }
        } catch (NumberFormatException ex) {
            System.err.println("Phone number must be a valid number");
        }
    }
}

    public String checkInputDate() {
        while (true) {
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
            try {
                String dateCheck = checkInputString();
                LocalDate date = LocalDate.parse(dateCheck, formatter);
                return dateCheck;
            } catch (DateTimeParseException e) {
                System.err.println("Date to correct format(dd/MM/yyyy)");
            }
        }
    }

    public String checkInputEmail() {
        while (true) {
            String emailCheck = checkInputString();
            if (!emailCheck.matches(EMAIL_VALID)) {
                System.err.println("Email must be correct format");
                System.out.print("Email: ");
            } else {
                return emailCheck;
            }
        }
    }
    
}
