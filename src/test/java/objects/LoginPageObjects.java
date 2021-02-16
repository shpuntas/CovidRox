package objects;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;

public class LoginPageObjects {
    public static SelenideElement
        usernameField = $("[id$=username"),
        passwordField = $("[id$=password]"),
        errorMessage = $("[id$=error_message]"),
        loginButton = $("[id$=login_button]");
}
