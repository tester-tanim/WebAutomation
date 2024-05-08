package testcases;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.ProfilePage;
import pages.SignInPage;
import utilities.BrowserSetup;

public class TestLogin extends BrowserSetup {
    HomePage homePage = new HomePage();
    SignInPage signInPage = new SignInPage();
    ProfilePage profilePage = new ProfilePage();

    @Test
    public void testLogin(){
        getBrowser().get(homePage.url);
        homePage.clickOnElement(homePage.signInButton);
        signInPage.writeOnElement(signInPage.emailInputBox, signInPage.Email);
        signInPage.writeOnElement(signInPage.passwordInputBox, signInPage.password);
        signInPage.clickOnElement(signInPage.logInButton);
        Assert.assertTrue(homePage.displayStatus(homePage.userIcon));
    }

}
