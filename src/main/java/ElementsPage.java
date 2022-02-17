import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ElementsPage extends BasePage{

    By elements = By.xpath("//*[@id=\"app\"]/div/div/div[2]/div/div[1]");
    By textBox = By.xpath("//*[@class=\"btn btn-light \"][1]");
    By username = By.id("userName");
    By userEmail = By.id("userEmail");
    By currentAddress = By.id("currentAddress");
    By permanentAddress = By.id("permanentAddress");
    By submit = By.id("submit");
    By assertName = By.id("name");
    By assertEmail = By.id("email");
    By assertCurrentAddress = By.xpath("//*[@class=\"mb-1\"][3]");
    By assertPermananetAddress = By.xpath("//*[@class=\"mb-1\"][4]");

    public ElementsPage(WebDriver driver) {
        super(driver);
    }

    public void getNameEmailCurrentAddressPermanentAddress(String firstText, String secondText, String thirdText, String fourthText){
        find(elements).click();
        find(textBox).click();
        find(username).sendKeys(firstText);
        find(userEmail).sendKeys(secondText);
        find(currentAddress).sendKeys(thirdText);
        find(permanentAddress).sendKeys(fourthText);
    }

    public void clickSubmit(){
        find(submit).click();
    }


    public boolean isDisplayedName() {
        WebElement nameText = find(assertName);
        return nameText.isDisplayed();
    }

    public String assertionEmail(){
        WebElement emailText = find(assertEmail);
        return emailText.getText();
    }

    public String assertionCurrentAddress() {
        WebElement currentAddressText = find(assertCurrentAddress);
        return currentAddressText.getText();
    }

    public String assertionPermananetAddress() {
        WebElement permananetAddressText = find(assertPermananetAddress);
        return permananetAddressText.getText();
    }
}
