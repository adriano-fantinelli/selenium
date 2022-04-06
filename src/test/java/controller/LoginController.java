package test.java.controller;

public class LoginController {

    public static String invalidEmail() {
        return "invalidEmail@gmail.com";
    }

    public static String invalidPassword() {
        return "invalidPassword";
    }

    public static String validEmail() {
        return "novoemailteste@gmail.com";
    }

    public static String validPassword() {
        return "teste123";
    }

    public static String myAccount() {
        return "MY ACCOUNT";
    }

    public static String authenticationFailed() {
        return "Authentication failed.";
    }

    public static String passwordIsRequired() {
        return "Password is required.";
    }

    public static String emailRequired() {
        return "An email address required.";
    }

    public static String blank() {
        return "";
    }
}
