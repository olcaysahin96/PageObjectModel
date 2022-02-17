import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;

public class BookStoreTest extends BaseTest{
    BookStorePage bookStorePage;

    @Test
    @Order(1)
    public void goToProductDetail(){
        bookStorePage = new BookStorePage(driver);
        bookStorePage.clickBookStoreApplication();
        bookStorePage.clickThirdProduct();
        Assertions.assertEquals("Designing Evolvable Web APIs with ASP.NET", bookStorePage.assertionThirdProductDetail());
    }

}
