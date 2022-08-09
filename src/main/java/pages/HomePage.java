package pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage {

    @FindBy(xpath = "//input[@class='gLFyf gsfi']")
    private WebElement searchInput;

    @FindBy(xpath = "//button[@id='L2AGLb']")
    private WebElement acceptAllButton;

    @FindBy(xpath = "//div[@class='hdtb-mitem']/a[contains(@href,'tbm=isch')]")
    private WebElement imagesIcon;


    public HomePage(WebDriver driver) {
        super(driver);
    }

    public void searchByKeyword(final String keyword) {
        searchInput.sendKeys(keyword);
        searchInput.sendKeys(Keys.ENTER);
    }

    public void acceptAll() {
        acceptAllButton.click();
    }

    public void clickImagesIcon() {
        imagesIcon.click();
    }
}
