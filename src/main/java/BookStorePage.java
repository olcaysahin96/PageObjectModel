import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class BookStorePage extends BasePage{
    By bookStoreApplication = By.xpath("//*[@class=\"card mt-4 top-card\"][6]");
    By bookList = By.xpath("//*[@class=\"mr-2\"]");
    By thirdProductDetail = By.xpath("//*[@id=\"title-wrapper\"]/div[2]/label");

    public BookStorePage(WebDriver driver) {
        super(driver);
    }

    public void clickBookStoreApplication(){
        scrollDown();
        find(bookStoreApplication).click();
    }

    public void clickThirdProduct(){
        findAll(bookList).get(2).click();
    }

    public String assertionThirdProductDetail(){
        WebElement productTitle = find(thirdProductDetail);
        return productTitle.getText();
    }
}
