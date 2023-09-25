import models.User;
import org.testng.annotations.Test;

public class RegistrationTests extends TestBase{

@Test
    public void registrationPositive(){
    int i = (int)(System.currentTimeMillis()/1000)%3600;

    User user = new User().
            whithName("John").
            whithLastName("Silver").
            whithEmail("john_" + i + "@mail.com").
            whithPassword("$Asdf1234");



    openRegistrationForm();
    fillRegistrationForm(user);
    submitRegistration();

    logger.info("registrationPositiveTest starts with:" + user.getEmail() + " & " + user.getPassword());
}


}
