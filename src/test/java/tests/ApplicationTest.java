package tests;

import beforesteps.BeforeSteps;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.disabled;
import static com.codeborne.selenide.Condition.visible;
import static objects.LandingPageObjects.landingPage;
import static objects.LoginPageObjects.*;
import static testdata.AuthData.*;

public class ApplicationTest extends BeforeSteps {

    @Test
    void successfulLogin() {
        usernameField.val(correctUsername);
        passwordField.val(correctPassword);
        loginButton.click();
        landingPage.shouldBe(visible);
    }

    @Test
    void incorrectUsername() {
        usernameField.val(incorrectUsername);
        passwordField.val(correctPassword);
        loginButton.click();
        errorMessage.shouldBe(visible);
    }

    //unique error messages for long and incorrect auth data would be more preferrable
    @Test
    void incorrectPassword() {
        usernameField.val(correctUsername);
        passwordField.val(incorrectPassword);
        loginButton.click();
        errorMessage.shouldBe(visible);
    }

    @Test
    void tooLongUsername() {
        usernameField.val(tooLongUsername);
        errorMessage.shouldBe(visible);
        loginButton.shouldBe(disabled);
    }

    @Test
    void tooLongPassword() {
        passwordField.val(tooLongPassword);
        errorMessage.shouldBe(visible);
        loginButton.shouldBe(disabled);
    }

}
