package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class DemoqaPage {
    public DemoqaPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "(//li[@id='item-1'])[2]")
    public WebElement alertSekmesi;

    @FindBy(xpath = "//button[@id='timerAlertButton']")
    public WebElement timerAlertButonu;

}
