package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class EbayAramaPages {

    public EbayAramaPages(){

        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(id="gh-ac-box")
    public WebElement ebayArama;
    @FindBy(className="sg-col-inner")
    public WebElement ebaySonuc;

}
