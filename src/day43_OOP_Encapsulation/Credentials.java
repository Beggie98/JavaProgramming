package day43_OOP_Encapsulation;

public class Credentials {
    private String username, password;

    public void setUsername(String username){
        this.username = username;
    }



    public boolean isStrongPassword(String password){
        boolean isStrongPassword = false;
        if (password.length() > 8 && !password.contains(" ")){
            char[] chars = password.toCharArray();
            int frequencyOfLetters = 0;
            int frequencyOfDigits = 0;
            int frequencyOfSpecialChars = 0;
            for (int i = 0; i < chars.length; i++) {
                char each = chars[i];
                if (Character.isLetter(each)){
                    frequencyOfLetters++;
                } else if (Character.isDigit(each)) {
                    frequencyOfDigits++;
                }else {
                    frequencyOfSpecialChars++;
                }
            }

            if (frequencyOfLetters >= 1 && frequencyOfDigits >= 1 && frequencyOfSpecialChars >= 1){
                isStrongPassword = true;
            }else {
                isStrongPassword = false;
            }
        }else {
            isStrongPassword = false;
        }
        return isStrongPassword;
    }

    public void setPassword(String password){
        if (!isStrongPassword(password)){// if the given password is not a strong password
            return;//exit the method
        }
        this.password = password;
    }

    public String getUsername(){
        return username;
    }

    public String getPassword(){
        return password;
    }

    public String toString() {
        return "Credentials{" +
                "username='" + username + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
/*
create a class named Credentials
			variables:
				username, password

			methods:
				isStrongPassWord(): takes an argument of string and verifys if the given string is strong password
							Characteristics of strong passwords are:
					                1. Password MUST be at least have 8 characters long, and should not contain space
					                2. PassWord should at least contain one letter
					                3. Password should at least contain one special characters
					                4. Password should at least contain a digit

                getPassword(): reads the password
                getUsername(): reads the username
                setUsername(): sets the username
                setPassword(): sets a new password
                					the new password MUST be a strong password

				toString()
 */