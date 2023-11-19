package intermediate.dayEight;

import java.util.regex.Pattern;

public class ValidateUserData {
    private UserData userData;

    public ValidateUserData() {

    }

    public boolean isValidData(UserData userData) {

        boolean isUserNameValid = false;
        boolean isUserEmailValid = false;
        boolean isUserPasswordValid = false;
        boolean isUserZipCode = false;
        String userName = "";
        String emailAddress = "";
        String regexRFC5322 = "^[a-zA-Z0-9_!#$%&'*+/=?`{|}~^.-]+@[a-zA-Z0-9.-]+$";
        String regexUserName = "^[a-zA-Z]*\s*[a-zA-Z]+$";

        userName = userData.getName();
        emailAddress = userData.getEmailAddress();

        isUserNameValid = Pattern.matches(regexUserName, userName);
        isUserEmailValid = Pattern.matches(regexRFC5322, emailAddress);
        isUserPasswordValid = true;
        isUserZipCode = true;

        return isUserNameValid &
                isUserEmailValid &
                isUserPasswordValid &
                isUserZipCode;
    }

}
