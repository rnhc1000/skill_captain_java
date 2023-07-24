package intermediate.dayEight;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

/**
 * Assignments:
 * Create a Java program that simulates user registration for an e-commerce
 * application.
 * The program should allow users to enter their name, email address, password
 * and shipping address.
 * The program should store the user data in an in-memory data structure, such
 * as an
 * ArrayList or HashMap.
 * The program should also validate user input to ensure that all required
 * fields are entered
 * and that the email address is in a valid format.
 */
public class UserRegistration {

    public static void main(String[] args) {
        boolean userDataOK = false;
        Integer idUser = 0;
        String nameOfUser = "";
        String emailAddress = "";
        String password = "";
        String shippingAddress = "";
        int amountOfInfo = 5;
        int countInfo = 0;
        Map<Integer,UserData> userRegister = new HashMap<Integer, UserData>();
        Scanner input = new Scanner(System.in);

        while (countInfo < amountOfInfo) {

            System.out.print("Input the Id of the User... -> ");
            idUser = input.nextInt();
            input.nextLine();
            countInfo++;
            System.out.print("Input user full name... -> ");
            nameOfUser = input.nextLine();
            countInfo++;
            System.out.print("Input user email address... -> ");
            emailAddress = input.nextLine();
            countInfo++;
            System.out.print("Input user password ... -> ");
            password = input.nextLine();
            countInfo++;
            System.out.print("Input user shipping address ... -> ");
            shippingAddress = input.nextLine();
            countInfo++;
        }

        UserData userData = new UserData(
            nameOfUser,
            emailAddress,
            password,
            shippingAddress
        );
        boolean isValid = false;
        ValidateUserData validateUserData = new ValidateUserData();
        isValid = validateUserData.isValidData(userData);

        if (isValid) {
            userRegister.put(idUser, userData);

            userRegister.forEach((k,v) -> System.out.println(k + " " + v));
        } else {
            System.out.println("Data not valid.... Try again.....");
        }

        input.close();
    }

}
