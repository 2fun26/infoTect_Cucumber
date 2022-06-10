package runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"html:target/default-cucumber-reports"},//Raporlarimizi olusturmak icin yazdik
        features = "src/test/resources/features",//features klasorunun path'i senaryolara ulasmak icin
        glue = "src/test/java/stepdefinitions",// testlerimizin oldugu dosyalara ulasmak icin
        //tags = "",
        dryRun = true
)


public class EbayRunner {

}
