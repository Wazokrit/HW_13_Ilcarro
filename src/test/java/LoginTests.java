import models.User;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.lang.reflect.Method;

public class LoginTests extends TestBase{

    @BeforeMethod
    public void precondition(Method method){
    if(isLogged()) logout();
        logger.info("Started test ----> " + method.getName());
    }

    @Test
    public void loginPositiveTest(){
        openLoginForm();
        User user = new User().
                whithEmail("asd@fgh.com").
                whithPassword("$Asdf1234");

        fillLoginForm(user);
        submitLogin();
        Assert.assertTrue(isLoggedSuccess());
        logger.info("loginPositiveTest starts with:" + user.getEmail() + " & " + user.getPassword());
    }
    @Test
    public void loginPositiveTest1(){
        openLoginForm();
        User user = new User().
                whithEmail("asd@fgh.com").
                whithPassword("$Asdf1234");
        fillLoginForm(user);
        submitLogin();
        Assert.assertTrue(isLoggedSuccess());
        logger.info("loginPositiveTest1 starts with:" + user.getEmail() + " & " + user.getPassword());
    }

    @AfterMethod
    public void postcondition(){
        clickOkButton();
        
    }

}
