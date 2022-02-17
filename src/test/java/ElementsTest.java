import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;

public class ElementsTest extends BaseTest{

    ElementsPage elementsPage;
    Log log = new Log();

    @Test
    @Order(1)
    public void setNameEmailCurrentAddressPermanentAddress(){
        elementsPage = new ElementsPage(driver);
        elementsPage.getNameEmailCurrentAddressPermanentAddress(
                "Olcay Sahin",
                "test@gmail.com",
                "Kale Sok. Beyoglu / ISTANBUL",
                "Yildiz Sok. Sisli / ISTANBUL");
        log.info("Name, E-mail, Current Address and Permanent Address filled!");
    }

    @Test
    @Order(2)
    public void assertNameEmailCurrentAndPermanentAddress(){
        elementsPage = new ElementsPage(driver);
        setNameEmailCurrentAddressPermanentAddress();
        elementsPage.clickSubmit();
        log.info("Clicked the submit button!");
        Assertions.assertTrue(elementsPage.isDisplayedName(), "Name is not displayed!");
        log.info("Name assertion success!");
        Assertions.assertEquals("Email:test@gmail.com",elementsPage.assertionEmail(), "Email is not expected result!");
        log.info("Email assertion success!");
        Assertions.assertEquals("Current Address :Kale Sok. Beyoglu / ISTANBUL", elementsPage.assertionCurrentAddress(), "Current Address is not expected result!");
        log.info("Current Address assertion success!");
        Assertions.assertEquals("Permananet Address :Yildiz Sok. Sisli / ISTANBUL", elementsPage.assertionPermananetAddress(), "Permananet Address is not expected result!");
        log.info("Permanent Address assertion success!");
    }
}
