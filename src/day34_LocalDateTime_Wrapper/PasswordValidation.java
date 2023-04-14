package day34_LocalDateTime_Wrapper;

//import java.lang.Character;

public class PasswordValidation {
    public static void main(String[] args) {

        String password = "12345678";

        boolean r1 = password.length()>=8 && !password.contains(" ");
        boolean hasUpperCase = false;
        boolean hasLowerCase = false;
        boolean hasDigit = false;
        boolean hasSpecialChar = false;


        for (char each : password.toCharArray()) {
            if (Character.isUpperCase(each)){
                hasUpperCase = true;
            }else if (Character.isLowerCase(each)){
                hasLowerCase = true;
            }else if (Character.isDigit(each)){
                hasDigit = true;
            }else {
                hasSpecialChar = true;
            }
        }

        boolean isStrongPassword = r1 && hasUpperCase && hasLowerCase && hasDigit && hasSpecialChar;

        System.out.println("isStrongPassword = " + isStrongPassword);

        if (!r1){
            System.out.println("The password does not have 8 characters or it contains space");
        }
        if (!hasUpperCase){
            System.out.println("The password does not have upper case letter");
        }
        if (!hasUpperCase){
            System.out.println("The password does not have lower case letter");
        }
        if (!hasSpecialChar){
            System.out.println("The password does not have special characters");
        }
    }
}
