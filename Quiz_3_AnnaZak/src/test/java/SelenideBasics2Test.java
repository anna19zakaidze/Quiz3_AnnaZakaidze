import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import com.codeborne.selenide.testng.SoftAsserts;
import org.testng.asserts.SoftAssert;
import static com.codeborne.selenide.Selenide.*;
import java.net.MalformedURLException;
import java.util.List;

@Listeners({ SoftAsserts.class})
public class SelenideBasics2Test {

    @Test
    public void demoqaBooks() throws MalformedURLException{

        // - Navigate to the https://demoqa.com/books
        String url ="https://demoqa.com/books";
        open(url);

        // - Using inner elements locators chain Find all books with publisher 'O'Reilly Media' containing title 'Javascript'
        //   (Example : $(".container").$(".subarea").$(withText("ezburger")); , Slide N 14)
        List<SelenideElement> bookElements = $$(By.className("rt-tr-group")).filterBy(Condition.and("Book Name",Condition.text("O'Reilly Media"), Condition.text("JavaScript")));

        // - Check with selenide soft assertions that size of returned list equals to 10(failed case)
        Integer sizeOfList = bookElements.size();
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertEquals(sizeOfList,"10"); //აქ უნდა დაფეილდეს, რადგან , რეალურად, ლისტის ზომა 3-ია
        softAssert.assertAll();

    }
}
