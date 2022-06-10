package stepdefinitions;

import io.cucumber.java.en.Given;
import net.bytebuddy.asm.Advice;
import org.openqa.selenium.Keys;
import pages.GoogleAramaPage;
import utilities.Driver;

public class GoogleArama2 {

    GoogleAramaPage page = new GoogleAramaPage();

    @Given("kullanici googleda armut aratir")
    public void kullanici_googleda_armut_aratir() {

    page.googleArama.sendKeys("Armut"+ Keys.ENTER);

    }
}
