package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class ImagesPage extends BasePage {

    @FindBy(xpath = "//div[@id='islrg']/div/div")
    private List<WebElement> items;

    public ImagesPage(WebDriver driver) {
        super(driver);
    }

    public List<WebElement> getListOfItems() {
        return items;
    }

    public int getItemsCount() {
        return getListOfItems().size();
    }
}


