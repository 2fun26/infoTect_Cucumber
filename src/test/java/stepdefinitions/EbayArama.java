package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.Keys;
import pages.AmazonAramaPages;
import pages.EbayAramaPages;
import utilities.Driver;

public class EbayArama {

    EbayAramaPages page=new EbayAramaPages();

    @Given("kullanici ebay sayifasina gider")
    public void kullanici_ebay_sayifasina_gider() {

        Driver.getDriver().get("https://ebay.com");

    }

    @Given("kullanici cerezleri kabul eder")
    public void kullanici_cerezleri_kabul_eder() {

    }

    @Given("kullanici arama kutusuna mug yazar")
    public void kullanici_arama_kutusuna_mug_yazar() {

        page.ebayArama.sendKeys("mug"+ Keys.ENTER);

    }

    @Then("kullanici arama sonucunu yazdirir")
    public void kullanici_arama_sonucunu_yazdirir() {

        System.out.println(page.ebaySonuc.getText());

    }

}
