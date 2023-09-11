import models.User;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LoginTests extends TestBase{

    @BeforeMethod
    public void precondition(){
    if(isLogged()) logout();
    }

    @Test
    public void loginPositiveTest(){
        openLoginForm();
        User user = new User().whithEmail("asd@fgh.com").whithPassword("$Asdf1234");
        fillLoginForm(user);
        submitLogin();
        Assert.assertTrue(isLoggedSuccess());
    }
    @Test
    public void loginPositiveTest1(){
        openLoginForm();
        User user = new User().whithEmail("asd@fgh.com").whithPassword("$Asdf1234");
        fillLoginForm(user);
        submitLogin();
        Assert.assertTrue(isLoggedSuccess());
    }

    @AfterMethod
    public void postcondition(){
        clickOkButton();
    }

}
